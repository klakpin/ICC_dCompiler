package implementations;

import interfaces.*;
import interfaces.Runnable;
import interfaces.Runtime;
import types.*;

import java.util.Scanner;

public class RuntimeImpl implements Runtime {

    private final ScopeStack scopeStack = new ScopeStackImpl();

    private final Stack stack = new StackImpl();

    private final Operations op = new OperationsImpl();

    private final CallStack callStack = new CallStackImpl();

    private Scanner in = new Scanner(System.in);

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
        stack.push(in.nextInt());
    }

    @Override
    public void readDouble() {
        stack.push(in.nextDouble());
    }

    @Override
    public void readString() {
        stack.push(new Text(in.nextLine()));
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
    public void and() throws Exception {
        stack.push(op.and(stack.pop(), stack.pop()));
    }

    @Override
    public void xor() throws Exception {
        stack.push(op.xor(stack.pop(), stack.pop()));
    }

    @Override
    public void equals() throws Exception {
        stack.push(op.equals(stack.pop(), stack.pop()));
    }

    @Override
    public void or() throws Exception {
        stack.push(op.or(stack.pop(), stack.pop()));
    }

    @Override
    public void not() throws Exception {
        stack.push(op.not(stack.pop()));
    }

    @Override
    public void plus() throws Exception {
        stack.push(op.plus(stack.pop(), stack.pop()));
    }

    @Override
    public void minus() throws Exception {
        stack.push(op.minus(stack.pop(), stack.pop()));
    }

    @Override
    public void multiply() throws Exception {
        stack.push(op.multiply(stack.pop(), stack.pop()));
    }


    @Override
    public void divide() throws Exception {
        stack.push(op.divide(stack.pop(), stack.pop()));
    }


    @Override
    public void greater() throws Exception {
        stack.push(op.greater(stack.pop(), stack.pop()));
    }

    @Override
    public void less() throws Exception {
        stack.push(op.less(stack.pop(), stack.pop()));
    }

    @Override
    public void greaterequals() throws Exception {
        stack.push(op.greaterequals(stack.pop(), stack.pop()));
    }

    @Override
    public void lessequal() throws Exception {
        stack.push(op.lessequal(stack.pop(), stack.pop()));
    }

    @Override
    public void notequal() throws Exception {
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
        scopeStack.newScope();
        add("a");
        vpush(25);
        assign("a");
        forloop(() -> {
            vpush("a");
            cprint();
        });
        scopeStack.popScope();
    }
}