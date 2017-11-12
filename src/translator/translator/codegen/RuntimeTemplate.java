package translator.codegen;

public class RuntimeTemplate {
    public static String part1 = "package implementations;\n" +
            "\n" +
            "import Interfaces.*;\n" +
            "import Interfaces.Runtime;\n" +
            "import types.Cortaige;\n" +
            "import types.Function;\n" +
            "\n" +
            "public class Output implements Runtime {\n" +
            "\n" +
            "    final ScopeStack scopeStack = new ScopeStackImpl();\n" +
            "\n" +
            "    final Stack stack = new StackImpl();\n" +
            "\n" +
            "    final Operations op = new OperationsImpl();\n" +
            "\n" +
            "    @Override\n" +
            "    public void and() {\n" +
            "        //TODO implement\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void xor() {\n" +
            "        //TODO implement\n" +
            "\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void dup() {\n" +
            "        Object obj = stack.pop();\n" +
            "        stack.push(obj);\n" +
            "        stack.push(obj);\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void vpush(Object obj) {\n" +
            "        stack.push(obj);\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void vpush(String name) throws Exception {\n" +
            "        stack.push(scopeStack.get(name));\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void add(String name) {\n" +
            "        scopeStack.add(name);\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void assign(String name) throws Exception {\n" +
            "        assign(name, stack.pop());\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void cprint() {\n" +
            "        System.out.println(stack.pop());\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void readcort() throws Exception {\n" +
            "        Object indexObj = stack.pop();\n" +
            "\n" +
            "        if (!(indexObj instanceof Integer)) {\n" +
            "            throw new Exception(\"Index of cortaige must be integer.\");\n" +
            "        }\n" +
            "        int index = (int) indexObj;\n" +
            "        Object cortObj = stack.pop();\n" +
            "        if (!(cortObj instanceof Cortaige)) {\n" +
            "            throw new Exception(\"Cortaige should be cortaige\");\n" +
            "        }\n" +
            "        Cortaige cortaige = (Cortaige) cortObj;\n" +
            "        stack.push(cortaige.get(index));\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void assigncort() throws Exception {\n" +
            "        Object obj = stack.pop();\n" +
            "\n" +
            "        Object indexObj = stack.pop();\n" +
            "\n" +
            "        if (!(indexObj instanceof Integer)) {\n" +
            "            throw new Exception(\"Index of cortaige must be integer.\");\n" +
            "        }\n" +
            "\n" +
            "        int index = (int) indexObj;\n" +
            "\n" +
            "        Object cortObj = stack.pop();\n" +
            "\n" +
            "        if (!(cortObj instanceof Cortaige)) {\n" +
            "            throw new Exception(\"Cortaige should be cortaige\");\n" +
            "        }\n" +
            "\n" +
            "        Cortaige cortaige = (Cortaige) cortObj;\n" +
            "\n" +
            "        cortaige.set(index, obj);\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void or() {\n" +
            "        //TODO implement\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void readobj() {\n" +
            "        //TODO implement\n" +
            "\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void assignobj() {\n" +
            "        //TODO implement\n" +
            "\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void assign(String name, Object val) throws Exception {\n" +
            "        scopeStack.assign(name, val);\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void invoke(Object object) throws Exception {\n" +
            "        Function runnable = (Function) object;\n" +
            "        SymTable origin = scopeStack.getScope();\n" +
            "        scopeStack.newScope(origin);\n" +
            "        runnable.run();\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void enterScope() {\n" +
            "        SymTable origin = scopeStack.getScope();\n" +
            "        scopeStack.newScope(origin);\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void exitScope() {\n" +
            "        scopeStack.popScope();\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void invoke(String name) throws Exception {\n" +
            "        invoke(scopeStack.get(name));\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void invoke() throws Exception {\n" +
            "        invoke(stack.pop());\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void plus() {\n" +
            "        Object var1 = stack.pop();\n" +
            "        Object var2 = stack.pop();\n" +
            "        stack.push(op.plus(var1, var2));\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void minus() {\n" +
            "        Object var1 = stack.pop();\n" +
            "        Object var2 = stack.pop();\n" +
            "        stack.push(op.minus(var1, var2));\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void multiply() {\n" +
            "        Object var1 = stack.pop();\n" +
            "        Object var2 = stack.pop();\n" +
            "        stack.push(op.multiply(var1, var2));\n" +
            "    }\n" +
            "\n" +
            "\n" +
            "    @Override\n" +
            "    public void divide() {\n" +
            "        Object var1 = stack.pop();\n" +
            "        Object var2 = stack.pop();\n" +
            "        stack.push(op.divide(var1, var2));\n" +
            "    }\n" +
            "\n" +
            "\n" +
            "    @Override\n" +
            "    public void greater() {\n" +
            "        Object var1 = stack.pop();\n" +
            "        Object var2 = stack.pop();\n" +
            "        stack.push(op.greater(var1, var2));\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void less() {\n" +
            "        Object var1 = stack.pop();\n" +
            "        Object var2 = stack.pop();\n" +
            "        stack.push(op.less(var1, var2));\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void notequal() {\n" +
            "        Object var1 = stack.pop();\n" +
            "        Object var2 = stack.pop();\n" +
            "        stack.push(op.notequal(var1, var2));\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public boolean bpop() {\n" +
            "        Object res = stack.pop();\n" +
            "        return (boolean) res;\n" +
            "        //TODO check cast, can be wrong\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void swap() {\n" +
            "        Object var1 = stack.pop();\n" +
            "        Object var2 = stack.pop();\n" +
            "        stack.push(var1);\n" +
            "        stack.push(var2);\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void exitfunc() {\n" +
            "        SymTable currTable = scopeStack.getScope();\n" +
            "        while (currTable.getOrigin() != scopeStack.getScope()) {\n" +
            "            scopeStack.popScope();\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void run() throws Exception {\n";

    public static String part2 = "}\n" +
            "}";
}
