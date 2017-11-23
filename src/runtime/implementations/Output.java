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
        add("player1Name");
        add("player2Name");
        add("board");
        vpush(new Cortege());
        assign("board");
        add("printBoard");
        vpush(new Function(() -> {
            vpush(new Text("  1     2     3  \n"));
            cprint();
            vpush(new Text("     :     :     \n"));
            cprint();
            vpush(new Text("  "));
            cprint();
            vpush("board");
            vpush(1);
            readcort();
            vpush(1);
            readcort();
            cprint();
            vpush(new Text("  :  "));
            cprint();
            vpush("board");
            vpush(1);
            readcort();
            vpush(2);
            readcort();
            cprint();
            vpush(new Text("  :  "));
            cprint();
            vpush("board");
            vpush(1);
            readcort();
            vpush(3);
            readcort();
            cprint();
            vpush(new Text("    1\n"));
            cprint();
            vpush(new Text("_____:_____:_____\n"));
            cprint();
            vpush(new Text("     :     :     \n"));
            cprint();
            vpush(new Text("  "));
            cprint();
            vpush("board");
            vpush(2);
            readcort();
            vpush(1);
            readcort();
            cprint();
            vpush(new Text("  :  "));
            cprint();
            vpush("board");
            vpush(2);
            readcort();
            vpush(2);
            readcort();
            cprint();
            vpush(new Text("  :  "));
            cprint();
            vpush("board");
            vpush(2);
            readcort();
            vpush(3);
            readcort();
            cprint();
            vpush(new Text("    2\n"));
            cprint();
            vpush(new Text("_____:_____:_____\n"));
            cprint();
            vpush(new Text("     |     |     \n"));
            cprint();
            vpush(new Text("  "));
            cprint();
            vpush("board");
            vpush(3);
            readcort();
            vpush(1);
            readcort();
            cprint();
            vpush(new Text("  :  "));
            cprint();
            vpush("board");
            vpush(3);
            readcort();
            vpush(2);
            readcort();
            cprint();
            vpush(new Text("  :  "));
            cprint();
            vpush("board");
            vpush(3);
            readcort();
            vpush(3);
            readcort();
            cprint();
            vpush(new Text("    3\n"));
            cprint();
            vpush(new Text("_____:_____:_____\n"));
            cprint();
        }));
        assign("printBoard");
        add("giveWinner");
        vpush(new Function(() -> {
            add("player1Count");
            vpush(0);
            assign("player1Count");
            add("player2Count");
            vpush(0);
            assign("player2Count");
            add("nullifyVariables");
            vpush(new Function(() -> {
                vpush(0);
                assign("player1Count");
                vpush(0);
                assign("player2Count");
            }));
            assign("nullifyVariables");
            enterScope();
            add("i");
            vpush(1);
            assign("i");
            vpush(3);
            vpush("i");
            lessequal();
            while (bpop()) {
                enterScope();
                enterScope();
                add("y");
                vpush(1);
                assign("y");
                vpush(3);
                vpush("y");
                lessequal();
                while (bpop()) {
                    enterScope();
                    vpush(1);
                    vpush("board");
                    vpush("i");
                    readcort();
                    vpush("y");
                    readcort();
                    stack.printStack("Before equals");
                    equals();
                    if (bpop()) {
                        enterScope();
                        vpush(1);
                        vpush("player1Count");
                        plus();
                        assign("player1Count");
                        exitScope();
                    }
                    vpush(2);
                    vpush("board");
                    vpush("i");
                    readcort();
                    vpush("y");
                    readcort();
                    equals();
                    if (bpop()) {
                        enterScope();
                        vpush(1);
                        vpush("player2Count");
                        plus();
                        assign("player2Count");
                        exitScope();
                    }
                    exitScope();
                    vpush(3);
                    vpush("y");
                    vpush(1);
                    plus();
                    assign("y");
                    vpush("y");
                    lessequal();
                }
                enterScope();
                exitScope();
                vpush(3);
                vpush("i");
                vpush(1);
                plus();
                assign("i");
                vpush("i");
                lessequal();
            }
            enterScope();
            vpush(3);
            vpush("player1Count");
            equals();
            if (bpop()) {
                enterScope();
                vpush(1);
                exitfunc();
                if (true) {
                    return;
                }
                exitScope();
            }
            vpush(3);
            vpush("player2Count");
            equals();
            if (bpop()) {
                enterScope();
                vpush(2);
                exitfunc();
                if (true) {
                    return;
                }
                exitScope();
            }
            vpush("nullifyVariables");
            invoke();
            enterScope();
            add("y");
            vpush(1);
            assign("y");
            vpush(3);
            vpush("y");
            lessequal();
            while (bpop()) {
                enterScope();
                enterScope();
                add("i");
                vpush(1);
                assign("i");
                vpush(3);
                vpush("i");
                lessequal();
                while (bpop()) {
                    enterScope();
                    vpush(1);
                    vpush("board");
                    vpush("i");
                    readcort();
                    vpush("y");
                    readcort();
                    equals();
                    if (bpop()) {
                        enterScope();
                        vpush(1);
                        vpush("player1Count");
                        plus();
                        assign("player1Count");
                        exitScope();
                    }
                    vpush(2);
                    vpush("board");
                    vpush("i");
                    readcort();
                    vpush("y");
                    readcort();
                    equals();
                    if (bpop()) {
                        enterScope();
                        vpush(1);
                        vpush("player2Count");
                        plus();
                        assign("player2Count");
                        exitScope();
                    }
                    exitScope();
                    vpush(3);
                    vpush("i");
                    vpush(1);
                    plus();
                    assign("i");
                    vpush("i");
                    lessequal();
                }
                enterScope();
                exitScope();
                vpush(3);
                vpush("y");
                vpush(1);
                plus();
                assign("y");
                vpush("y");
                lessequal();
            }
            enterScope();
            vpush(3);
            vpush("player1Count");
            equals();
            if (bpop()) {
                enterScope();
                vpush(1);
                exitfunc();
                if (true) {
                    return;
                }
                exitScope();
            }
            vpush(3);
            vpush("player2Count");
            equals();
            if (bpop()) {
                enterScope();
                vpush(2);
                exitfunc();
                if (true) {
                    return;
                }
                exitScope();
            }
            vpush("nullifyVariables");
            invoke();
            enterScope();
            add("i");
            vpush(1);
            assign("i");
            vpush(3);
            vpush("i");
            lessequal();
            while (bpop()) {
                enterScope();
                vpush(1);
                vpush("board");
                vpush("i");
                readcort();
                vpush("i");
                readcort();
                equals();
                if (bpop()) {
                    enterScope();
                    vpush(1);
                    vpush("player1Count");
                    plus();
                    assign("player1Count");
                    exitScope();
                }
                vpush(2);
                vpush("board");
                vpush("i");
                readcort();
                vpush("i");
                readcort();
                equals();
                if (bpop()) {
                    enterScope();
                    vpush(1);
                    vpush("player2Count");
                    plus();
                    assign("player2Count");
                    exitScope();
                }
                exitScope();
                vpush(3);
                vpush("i");
                vpush(1);
                plus();
                assign("i");
                vpush("i");
                lessequal();
            }
            enterScope();
            vpush(3);
            vpush("player1Count");
            equals();
            if (bpop()) {
                enterScope();
                vpush(1);
                exitfunc();
                if (true) {
                    return;
                }
                exitScope();
            }
            vpush(3);
            vpush("player2Count");
            equals();
            if (bpop()) {
                enterScope();
                vpush(2);
                exitfunc();
                if (true) {
                    return;
                }
                exitScope();
            }
            vpush("nullifyVariables");
            invoke();
            enterScope();
            add("i");
            vpush(1);
            assign("i");
            vpush(3);
            vpush("i");
            lessequal();
            while (bpop()) {
                enterScope();
                vpush(1);
                vpush("board");
                vpush("i");
                readcort();
                vpush("i");
                vpush(4);
                minus();
                readcort();
                equals();
                if (bpop()) {
                    enterScope();
                    vpush(1);
                    vpush("player1Count");
                    plus();
                    assign("player1Count");
                    exitScope();
                }
                vpush(2);
                vpush("board");
                vpush("i");
                readcort();
                vpush("i");
                vpush(4);
                minus();
                readcort();
                equals();
                if (bpop()) {
                    enterScope();
                    vpush(1);
                    vpush("player2Count");
                    plus();
                    assign("player2Count");
                    exitScope();
                }
                exitScope();
                vpush(3);
                vpush("i");
                vpush(1);
                plus();
                assign("i");
                vpush("i");
                lessequal();
            }
            enterScope();
            vpush(3);
            vpush("player1Count");
            equals();
            if (bpop()) {
                enterScope();
                vpush(1);
                exitfunc();
                if (true) {
                    return;
                }
                exitScope();
            }
            vpush(3);
            vpush("player2Count");
            equals();
            if (bpop()) {
                enterScope();
                vpush(2);
                exitfunc();
                if (true) {
                    return;
                }
                exitScope();
            }
            vpush(0);
            exitfunc();
            if (true) {
                return;
            }
        }));
        assign("giveWinner");
        enterScope();
        add("i");
        vpush(1);
        assign("i");
        vpush(3);
        vpush("i");
        lessequal();
        while (bpop()) {
            enterScope();
            vpush(new Cortege());
            vpush("board");
            swap();
            vpush("i");
            assigncort();
            exitScope();
            vpush(3);
            vpush("i");
            vpush(1);
            plus();
            assign("i");
            vpush("i");
            lessequal();
        }
        enterScope();
        enterScope();
        add("i");
        vpush(1);
        assign("i");
        vpush(3);
        vpush("i");
        lessequal();
        while (bpop()) {
            enterScope();
            enterScope();
            add("y");
            vpush(1);
            assign("y");
            vpush(3);
            vpush("y");
            lessequal();
            while (bpop()) {
                enterScope();
                vpush(new Text(" "));
                vpush("board");
                vpush("i");
                readcort();
                swap();
                vpush("y");
                assigncort();
                exitScope();
                vpush(3);
                vpush("y");
                vpush(1);
                plus();
                assign("y");
                vpush("y");
                lessequal();
            }
            enterScope();
            exitScope();
            vpush(3);
            vpush("i");
            vpush(1);
            plus();
            assign("i");
            vpush("i");
            lessequal();
        }
        enterScope();
        vpush(new Text("Enter player 1 name: "));
        cprint();
        readString();
        assign("player1Name");
        vpush(new Text("\nEnter player 2 name: "));
        cprint();
        readString();
        assign("player2Name");
        vpush(new Text("\n"));
        cprint();
        add("gameRunning");
        vpush(true);
        assign("gameRunning");
        vpush("printBoard");
        invoke();
        vpush(new Text("Winner is player "));
        cprint();
        vpush("giveWinner");
        invoke();
        cprint();
        scopeStack.popScope();
    }
}