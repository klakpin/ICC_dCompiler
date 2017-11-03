package compiler;

import runtime.*;
import runtime.Runtime;
import types.Function;

public class RuntimeImpl implements Runtime {

    final ScopeStack scopeStack = new ScopeStackImpl();

    final Stack stack = new StackImpl();

    final Operations op = new OperationsImpl();


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
    public void assign(String name, Object val) throws Exception {
        scopeStack.assign(name, val);
    }

    @Override
    public void invoke(Object object) throws Exception {
        Function runnable = (Function) object;
        SymTable origin = scopeStack.getScope();
        scopeStack.newScope(origin);
        runnable.run();
        scopeStack.popScope();
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
    public void greater() {
        Object var1 = stack.pop();
        Object var2 = stack.pop();
        stack.push(op.greater(var1, var2));
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
    public void run() {

    }

    /**
     * Iterative euclidus algorithm
     */
    public int euclidus(int var1, int var2) throws Exception {
        scopeStack.newScope();

        // var euclidus := func ...
        add("euclidus");
        vpush(new Function(() -> {
            // a, b initialization
            add("b");
            assign("b");
            add("a");
            assign("a");


            // a /= b
            vpush("a");
            vpush("b");
            notequal();


            while (bpop()) {
                enterScope();
                // a > b
                vpush("b");
                vpush("a");
                greater();

                // if a > b
                if (bpop()) {
                    enterScope();

                    // a := a - b
                    vpush("b");
                    vpush("a");
                    minus();
                    assign("a");

                    exitScope();
                } else {
                    enterScope();
                    // b := b - a
                    vpush("a");
                    vpush("b");
                    minus();
                    assign("b");
                    exitScope();
                }


                // Check variables again
                // a /= b
                vpush("a");
                vpush("b");
                notequal();
                exitScope();
            }

            vpush("a");
        }));
        assign("euclidus");


        // var res := euclidus(5, 10)
        add("res");
        vpush(var1);
        vpush(var2);
        vpush("euclidus");
        invoke();
        assign("res");

        //print res
        vpush("res");

        scopeStack.popScope();

        Integer res = (Integer) stack.pop();
        return res;
    }
}