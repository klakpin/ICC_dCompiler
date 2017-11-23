package implementations;

import Interfaces.*;
import Interfaces.Runtime;
import Interfaces.Runnable;
import types.*;
import java.util.Scanner;
public class Output implements Runtime {

    private final ScopeStack scopeStack = new ScopeStackImpl();

    private final Stack stack = new StackImpl();

    private final Operations op = new OperationsImpl();

    private final CallStack callStack = new CallStackImpl();

    @Override
    public void dup() {
        Object obj = stack.pop();
        stack.push(obj);
        stack.push(obj);
    }

    @Override
    public void vpush(Object obj) {
        stack.push(obj);
    }

    @Override
    public void vpush(String name) throws Exception {
        stack.push(scopeStack.get(name));
    }

    @Override
    public void add(String name) throws Exception {
        scopeStack.add(name);
    }

    @Override
    public void assign(String name) throws Exception {
        assign(name, stack.pop());
    }

    @Override
    public void assign(String name, Object val) throws Exception {
        scopeStack.assign(name, val);
    }

    @Override
    public void cprint() {
        System.out.print(stack.pop().toString());
    }

    @Override
    public void readcort() throws Exception {
        Object indexObj = stack.pop();

        if (!(indexObj instanceof Integer)) {
            throw new Exception("Index of cortege must be integer.");
        }
        int index = (int) indexObj;
        Object cortObj = stack.pop();
        if (!(cortObj instanceof Cortege)) {
            throw new Exception("Cortege should be cortege");
        }
        Cortege cortege = (Cortege) cortObj;
        stack.push(cortege.get(index));
    }

    @Override
    public void assigncort() throws Exception {
        Object indexObj = stack.pop();
        Object obj = stack.pop();

        if (!(indexObj instanceof Integer)) {
            throw new Exception("Index of cortege must be integer.");
        }

        int index = (int) indexObj;

        Object cortObj = stack.pop();

        if (!(cortObj instanceof Cortege)) {
            throw new Exception("Cortege should be cortege");
        }

        Cortege cortege = (Cortege) cortObj;

        cortege.set(index, obj);
    }

    @Override
    public void readobj() throws Exception {
        Object structObj = stack.pop();
        Object indexObj = stack.pop();

        if (!(indexObj instanceof Text)) {
            throw new Exception("Index of Object must be Text, has " + indexObj.getClass().getTypeName());
        }

        Text index = (Text) indexObj;
        if (!(structObj instanceof Structure)) {
            throw new Exception("Structure should be structure, has " + structObj.getClass().getTypeName());
        }

        Structure object = (Structure) structObj;
        stack.push(object.get(index.toString()));
    }

    @Override
    public void assignobj() throws Exception {
        Object obj = stack.pop();
        Object indexObj = stack.pop();
        Object structObj = stack.pop();

        if (!(indexObj instanceof Text)) {
            throw new Exception("Index of object must be text.");
        }

        Text index = (Text) indexObj;

        if (!(structObj instanceof Structure)) {
            throw new Exception("Object should be object");
        }

        Structure object = (Structure) structObj;

        object.set(index.toString(), obj);
    }

    @Override
    public void checktype() {
        Object objType = stack.pop();
        Object object = stack.pop();

        TypeIndicator strType = (TypeIndicator) objType;

        switch (strType.getType()) {
            case "int":
                stack.push(object instanceof Integer);
                break;
            case "double":
                stack.push(object instanceof Double);
                break;
            case "bool":
                stack.push(object instanceof Boolean);
                break;
            case "string":
                stack.push(object instanceof Text);
                break;
            case "empty":
                stack.push(object == null);
                break;
            case "[]":
                stack.push(object instanceof Cortege);
                break;
            case "{}":
                stack.push(object instanceof Structure);
                break;
            case "func":
                stack.push(object instanceof Function);
                break;
        }
    }

    @Override
    public void evalsize() {
        Object object = stack.pop();
        stack.push(op.size(object));
    }

    @Override
    public void readInt() {
        Scanner in = new Scanner(System.in);
        stack.push(in.nextInt());
        in.close();
    }

    @Override
    public void readDouble() {
        Scanner in = new Scanner(System.in);
        stack.push(in.nextDouble());
        in.close();
    }

    @Override
    public void readString() {
        Scanner in = new Scanner(System.in);
        stack.push(new Text(in.nextLine()));
        in.close();
    }

    @Override
    public void invoke(Object object) throws Exception {
        Function runnable = (Function) object;
        SymTable origin = scopeStack.getScope();
        scopeStack.newScope(origin);

        callStack.add(origin);

        runnable.run();
    }

    @Override
    public void enterScope() {
        SymTable origin = scopeStack.getScope();
        scopeStack.newScope(origin);
    }

    @Override
    public void exitScope() {
        scopeStack.popScope();
    }

    @Override
    public void invoke(String name) throws Exception {
        invoke(scopeStack.get(name));
    }

    @Override
    public void invoke() throws Exception {
        invoke(stack.pop());
    }

    @Override
    public void plusplus() throws Exception {
        stack.push(op.plusplus(stack.pop()));
    }

    @Override
    public void minusminus() throws Exception {
        stack.push(op.minusminus(stack.pop()));
    }

    @Override
    public void and() {
        stack.push(op.and(stack.pop(), stack.pop()));
    }

    @Override
    public void xor() {
        stack.push(op.xor(stack.pop(), stack.pop()));
    }

    @Override
    public void equals() {
        stack.push(op.equals(stack.pop(), stack.pop()));
    }

    @Override
    public void or() {
        stack.push(op.or(stack.pop(), stack.pop()));
    }

    @Override
    public void not() {
        stack.push(op.not(stack.pop()));
    }

    @Override
    public void plus() {
        stack.push(op.plus(stack.pop(), stack.pop()));
    }

    @Override
    public void minus() {
        stack.push(op.minus(stack.pop(), stack.pop()));
    }

    @Override
    public void multiply() {
        stack.push(op.multiply(stack.pop(), stack.pop()));
    }


    @Override
    public void divide() {
        stack.push(op.divide(stack.pop(), stack.pop()));
    }


    @Override
    public void greater() {
        stack.push(op.greater(stack.pop(), stack.pop()));
    }

    @Override
    public void less() {
        stack.push(op.less(stack.pop(), stack.pop()));
    }

    @Override
    public void greaterequals() {
        stack.push(op.greaterequals(stack.pop(), stack.pop()));
    }

    @Override
    public void lessequal() {
        stack.push(op.lessequal(stack.pop(), stack.pop()));
    }

    @Override
    public void notequal() {
        stack.push(op.notequal(stack.pop(), stack.pop()));
    }

    @Override
    public boolean bpop() throws Exception {
        Object res = stack.pop();
        if (res instanceof Boolean) {
            return (boolean) res;
        } else {
            throw new Exception("Cannot convert " + res.getClass().toString() + " to boolean for condition check.");
        }
    }

    @Override
    public void swap() {
        Object var1 = stack.pop();
        Object var2 = stack.pop();
        stack.push(var1);
        stack.push(var2);
    }

    @Override
    public void exitfunc() {

        SymTable target = callStack.pop();
        while (target != scopeStack.getScope()) {
            scopeStack.popScope();
        }
//
//        System.out.println(scopeStack.toString());
//        if (scopeStack.getScope().getOrigin() != null) {
//            scopeStack.popScope();
//        }
    }


    @Override
    public void forloop(Runnable runnable) throws Exception {
        int begin = (Integer) stack.pop();
        int end = (Integer) stack.pop();
        for (int i = begin; i <= end; i++) {
            runnable.run();
        }
    }

    @Override
    public void run() throws Exception {
<<<<<<< HEAD
scopeStack.newScope();
add("a");
vpush(new Cortaige());
dup();
vpush(1);
vpush(1);
assigncort();
dup();
vpush(2);
vpush(2);
assigncort();
dup();
vpush(1);
vpush(3);
assigncort();
dup();
vpush(4);
vpush(4);
assigncort();
dup();
vpush(5);
vpush(5);
assigncort();
dup();
vpush(6);
vpush(6);
assigncort();
assign("a");
add("b");
vpush(new Cortaige());
dup();
vpush(7);
vpush(1);
assigncort();
dup();
vpush(8);
vpush(2);
assigncort();
assign("b");
add("c");
vpush("b");
vpush("a");
plus();
assign("c");
enterScope();
add("i");
vpush(1);
assign("i");
vpush(6);
vpush("i");
lessequal();
while(bpop()) {
enterScope();
vpush("c");
vpush("i");
readcort();
cprint();
exitScope();
vpush(6);
vpush("i");
vpush(1);
plus();
assign("i");
vpush("i");
lessequal();
}
enterScope();
scopeStack.popScope();
}
=======
        scopeStack.newScope();
        add("a");
        vpush(new Cortege());
        dup();
        vpush(34);
        vpush(1);
        assigncort();
        dup();
        vpush(203);
        vpush(2);
        assigncort();
        dup();
        vpush(3);
        vpush(3);
        assigncort();
        dup();
        vpush(746);
        vpush(4);
        assigncort();
        dup();
        vpush(200);
        vpush(5);
        assigncort();
        dup();
        vpush(984);
        vpush(6);
        assigncort();
        dup();
        vpush(198);
        vpush(7);
        assigncort();
        dup();
        vpush(764);
        vpush(8);
        assigncort();
        dup();
        vpush(9);
        vpush(9);
        assigncort();
        assign("a");
        add("bubbleSort");
        vpush(new Function(() -> {
            add("swapped");
            vpush(true);
            assign("swapped");
            vpush("swapped");
            while (bpop()) {
                enterScope();
                vpush(false);
                assign("swapped");
                enterScope();
                add("i");
                vpush(1);
                assign("i");
                vpush(8);
                vpush("i");
                lessequal();
                while (bpop()) {
                    enterScope();
                    vpush("a");
                    vpush(1);
                    vpush("i");
                    plus();
                    readcort();
                    vpush("a");
                    vpush("i");
                    readcort();
                    greater();
                    if (bpop()) {
                        enterScope();
                        add("temp");
                        vpush("a");
                        vpush("i");
                        readcort();
                        assign("temp");
                        vpush("a");
                        vpush(1);
                        vpush("i");
                        plus();
                        readcort();
                        vpush("a");
                        swap();
                        vpush("i");
                        assigncort();
                        vpush("temp");
                        vpush("a");
                        swap();
                        vpush(1);
                        vpush("i");
                        plus();
                        assigncort();
                        vpush(true);
                        assign("swapped");
                        exitScope();
                    }
                    exitScope();
                    vpush(8);
                    vpush("i");
                    vpush(1);
                    plus();
                    assign("i");
                    vpush("i");
                    lessequal();
                }
                enterScope();
                exitScope();
                vpush("swapped");
            }
        }));
        assign("bubbleSort");
        vpush(new Text("Final array is: "));
        cprint();
        enterScope();
        add("i");
        vpush(1);
        assign("i");
        vpush(9);
        vpush("i");
        lessequal();
        while (bpop()) {
            enterScope();
            vpush("a");
            vpush("i");
            readcort();
            cprint();
            vpush(new Text(" "));
            cprint();
            exitScope();
            vpush(9);
            vpush("i");
            vpush(1);
            plus();
            assign("i");
            vpush("i");
            lessequal();
        }
        enterScope();
        scopeStack.popScope();
    }
>>>>>>> 8e8804b22c1c64cff409ef48a6905acf58520db3
}