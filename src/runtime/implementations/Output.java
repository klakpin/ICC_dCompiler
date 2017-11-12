package implementations;

import Interfaces.*;
import Interfaces.Runtime;
import types.Cortaige;
import types.Function;

public class Output implements Runtime {

    final ScopeStack scopeStack = new ScopeStackImpl();

    final Stack stack = new StackImpl();

    final Operations op = new OperationsImpl();

    @Override
    public void and() {
        //TODO implement
    }

    @Override
    public void xor() {
        //TODO implement

    }

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
    public void add(String name) {
        scopeStack.add(name);
    }

    @Override
    public void assign(String name) throws Exception {
        assign(name, stack.pop());
    }

    @Override
    public void cprint() {
        System.out.println(stack.pop());
    }

    @Override
    public void readcort() throws Exception {
        Object indexObj = stack.pop();

        if (!(indexObj instanceof Integer)) {
            throw new Exception("Index of cortaige must be integer.");
        }
        int index = (int) indexObj;
        Object cortObj = stack.pop();
        if (!(cortObj instanceof Cortaige)) {
            throw new Exception("Cortaige should be cortaige");
        }
        Cortaige cortaige = (Cortaige) cortObj;
        stack.push(cortaige.get(index));
    }

    @Override
    public void assigncort() throws Exception {
        Object obj = stack.pop();

        Object indexObj = stack.pop();

        if (!(indexObj instanceof Integer)) {
            throw new Exception("Index of cortaige must be integer.");
        }

        int index = (int) indexObj;

        Object cortObj = stack.pop();

        if (!(cortObj instanceof Cortaige)) {
            throw new Exception("Cortaige should be cortaige");
        }

        Cortaige cortaige = (Cortaige) cortObj;

        cortaige.set(index, obj);
    }

    @Override
    public void or() {
        //TODO implement
    }

    @Override
    public void readobj() {
        //TODO implement

    }

    @Override
    public void assignobj() {
        //TODO implement

    }

    @Override
    public void assign(String name, Object val) throws Exception {
        scopeStack.assign(name, val);
    }

    @Override
    public void invoke(Object object) throws Exception {
        Function runnable = (Function) object;
        SymTable origin = scopeStack.getScope();
        scopeStack.newScope(origin);
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
    public void plus() {
        Object var1 = stack.pop();
        Object var2 = stack.pop();
        stack.push(op.plus(var1, var2));
    }

    @Override
    public void minus() {
        Object var1 = stack.pop();
        Object var2 = stack.pop();
        stack.push(op.minus(var1, var2));
    }

    @Override
    public void multiply() {
        Object var1 = stack.pop();
        Object var2 = stack.pop();
        stack.push(op.multiply(var1, var2));
    }


    @Override
    public void divide() {
        Object var1 = stack.pop();
        Object var2 = stack.pop();
        stack.push(op.divide(var1, var2));
    }


    @Override
    public void greater() {
        Object var1 = stack.pop();
        Object var2 = stack.pop();
        stack.push(op.greater(var1, var2));
    }

    @Override
    public void less() {
        Object var1 = stack.pop();
        Object var2 = stack.pop();
        stack.push(op.less(var1, var2));
    }

    @Override
    public void notequal() {
        Object var1 = stack.pop();
        Object var2 = stack.pop();
        stack.push(op.notequal(var1, var2));
    }

    @Override
    public boolean bpop() {
        Object res = stack.pop();
        return (boolean) res;
        //TODO check cast, can be wrong
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
        SymTable currTable = scopeStack.getScope();
        while (currTable.getOrigin() != scopeStack.getScope()) {
            scopeStack.popScope();
        }
    }

    @Override
    public void run() throws Exception {
        scopeStack.newScope();
        add("euclidus");
        vpush(new Function(() -> {
            add("b");
            assign("b");
            add("a");
            assign("a");
            vpush("b");
            vpush("a");
            notequal();
            while (bpop()) {
                enterScope();
                vpush("b");
                vpush("a");
                greater();
                if (bpop()) {
                    enterScope();
                    vpush("b");
                    vpush("a");
                    minus();
                    assign("a");
                    exitScope();
                } else {
                    enterScope();
                    vpush("a");
                    vpush("b");
                    minus();
                    assign("b");
                    exitScope();
                }
                exitScope();
                vpush("b");
                vpush("a");
                notequal();
            }
            vpush("a");
            exitfunc();
            if (true) {
                return;
            }
        }));
        assign("euclidus");
        add("res");
        vpush(5);
        vpush(10);
        vpush("euclidus");
        invoke();
        assign("res");
        vpush("res");
        cprint();
        scopeStack.popScope();
    }
}