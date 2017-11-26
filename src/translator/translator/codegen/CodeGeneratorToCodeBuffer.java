package translator.codegen;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class CodeGeneratorToCodeBuffer implements CodeGenerator {

    int startLine = 344;

    private StringBuilder resultClass = new StringBuilder();
    private Map<Integer, Integer> codeMapping = new TreeMap<>();

    @Override
    public void start() throws IOException {
        resultClass.append(beginning);
    }

    @Override
    public void add(int srcLine, String string) {
        resultClass.append(string + "\n");
        startLine++;
        codeMapping.put(startLine, srcLine);

    }

    @Override
    public void end() throws IOException {
        resultClass.append(ending);
    }

    public String getResultClass() {
        return resultClass.toString();
    }

    private String ending = "    }\n" +
            "}";

    private String beginning = "package implementations;\n" +
            "\n" +
            "import interfaces.*;\n" +
            "import interfaces.Runnable;\n" +
            "import interfaces.Runtime;\n" +
            "import types.*;\n" +
            "\n" +
            "import java.util.Scanner;\n" +
            "\n" +
            "public class Output implements Runtime {\n" +
            "\n" +
            "    private final ScopeStack scopeStack = new ScopeStackImpl();\n" +
            "\n" +
            "    private final Stack stack = new StackImpl();\n" +
            "\n" +
            "    private final Operations op = new OperationsImpl();\n" +
            "\n" +
            "    private final CallStack callStack = new CallStackImpl();\n" +
            "\n" +
            "    private Scanner in = new Scanner(System.in);\n" +
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
            "    public void add(String name) throws Exception {\n" +
            "        scopeStack.add(name);\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void assign(String name) throws Exception {\n" +
            "        assign(name, stack.pop());\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void assign(String name, Object val) throws Exception {\n" +
            "        scopeStack.assign(name, val);\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void cprint() {\n" +
            "        System.out.print(stack.pop().toString());\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void readcort() throws Exception {\n" +
            "        Object indexObj = stack.pop();\n" +
            "\n" +
            "        if (!(indexObj instanceof Integer)) {\n" +
            "            throw new Exception(\"Index of cortege must be integer.\");\n" +
            "        }\n" +
            "        int index = (int) indexObj;\n" +
            "        Object cortObj = stack.pop();\n" +
            "        if (!(cortObj instanceof Cortege)) {\n" +
            "            throw new Exception(\"Cortege should be cortege\");\n" +
            "        }\n" +
            "        Cortege cortege = (Cortege) cortObj;\n" +
            "        stack.push(cortege.get(index));\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void assigncort() throws Exception {\n" +
            "        Object indexObj = stack.pop();\n" +
            "        Object obj = stack.pop();\n" +
            "\n" +
            "        if (!(indexObj instanceof Integer)) {\n" +
            "            throw new Exception(\"Index of cortege must be integer.\");\n" +
            "        }\n" +
            "\n" +
            "        int index = (int) indexObj;\n" +
            "\n" +
            "        Object cortObj = stack.pop();\n" +
            "\n" +
            "        if (!(cortObj instanceof Cortege)) {\n" +
            "            throw new Exception(\"Cortege should be cortege\");\n" +
            "        }\n" +
            "\n" +
            "        Cortege cortege = (Cortege) cortObj;\n" +
            "\n" +
            "        cortege.set(index, obj);\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void readobj() throws Exception {\n" +
            "        Object structObj = stack.pop();\n" +
            "        Object indexObj = stack.pop();\n" +
            "\n" +
            "        if (!(indexObj instanceof Text)) {\n" +
            "            throw new Exception(\"Index of Object must be Text, has \" + indexObj.getClass().getTypeName());\n" +
            "        }\n" +
            "\n" +
            "        Text index = (Text) indexObj;\n" +
            "        if (!(structObj instanceof Structure)) {\n" +
            "            throw new Exception(\"Structure should be structure, has \" + structObj.getClass().getTypeName());\n" +
            "        }\n" +
            "\n" +
            "        Structure object = (Structure) structObj;\n" +
            "        stack.push(object.get(index.toString()));\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void assignobj() throws Exception {\n" +
            "        Object obj = stack.pop();\n" +
            "        Object indexObj = stack.pop();\n" +
            "        Object structObj = stack.pop();\n" +
            "\n" +
            "        if (!(indexObj instanceof Text)) {\n" +
            "            throw new Exception(\"Index of object must be text.\");\n" +
            "        }\n" +
            "\n" +
            "        Text index = (Text) indexObj;\n" +
            "\n" +
            "        if (!(structObj instanceof Structure)) {\n" +
            "            throw new Exception(\"Object should be object\");\n" +
            "        }\n" +
            "\n" +
            "        Structure object = (Structure) structObj;\n" +
            "\n" +
            "        object.set(index.toString(), obj);\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void checktype() {\n" +
            "        Object objType = stack.pop();\n" +
            "        Object object = stack.pop();\n" +
            "\n" +
            "        TypeIndicator strType = (TypeIndicator) objType;\n" +
            "\n" +
            "        switch (strType.getType()) {\n" +
            "            case \"int\":\n" +
            "                stack.push(object instanceof Integer);\n" +
            "                break;\n" +
            "            case \"double\":\n" +
            "                stack.push(object instanceof Double);\n" +
            "                break;\n" +
            "            case \"bool\":\n" +
            "                stack.push(object instanceof Boolean);\n" +
            "                break;\n" +
            "            case \"string\":\n" +
            "                stack.push(object instanceof Text);\n" +
            "                break;\n" +
            "            case \"empty\":\n" +
            "                stack.push(object == null);\n" +
            "                break;\n" +
            "            case \"[]\":\n" +
            "                stack.push(object instanceof Cortege);\n" +
            "                break;\n" +
            "            case \"{}\":\n" +
            "                stack.push(object instanceof Structure);\n" +
            "                break;\n" +
            "            case \"func\":\n" +
            "                stack.push(object instanceof Function);\n" +
            "                break;\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void evalsize() {\n" +
            "        Object object = stack.pop();\n" +
            "        stack.push(op.size(object));\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void readInt() {\n" +
            "        stack.push(in.nextInt());\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void readDouble() {\n" +
            "        stack.push(in.nextDouble());\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void readString() {\n" +
            "        stack.push(new Text(in.nextLine()));\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void invoke(Object object) throws Exception {\n" +
            "        Function runnable = (Function) object;\n" +
            "        SymTable origin = scopeStack.getScope();\n" +
            "        scopeStack.newScope(origin);\n" +
            "\n" +
            "        callStack.add(origin);\n" +
            "\n" +
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
            "    public void plusplus() throws Exception {\n" +
            "        stack.push(op.plusplus(stack.pop()));\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void minusminus() throws Exception {\n" +
            "        stack.push(op.minusminus(stack.pop()));\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void and() {\n" +
            "        stack.push(op.and(stack.pop(), stack.pop()));\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void xor() {\n" +
            "        stack.push(op.xor(stack.pop(), stack.pop()));\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void equals() throws Exception {\n" +
            "        stack.push(op.equals(stack.pop(), stack.pop()));\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void or() {\n" +
            "        stack.push(op.or(stack.pop(), stack.pop()));\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void not() {\n" +
            "        stack.push(op.not(stack.pop()));\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void plus() {\n" +
            "        stack.push(op.plus(stack.pop(), stack.pop()));\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void minus() {\n" +
            "        stack.push(op.minus(stack.pop(), stack.pop()));\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void multiply() {\n" +
            "        stack.push(op.multiply(stack.pop(), stack.pop()));\n" +
            "    }\n" +
            "\n" +
            "\n" +
            "    @Override\n" +
            "    public void divide() {\n" +
            "        stack.push(op.divide(stack.pop(), stack.pop()));\n" +
            "    }\n" +
            "\n" +
            "\n" +
            "    @Override\n" +
            "    public void greater() {\n" +
            "        stack.push(op.greater(stack.pop(), stack.pop()));\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void less() {\n" +
            "        stack.push(op.less(stack.pop(), stack.pop()));\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void greaterequals() {\n" +
            "        stack.push(op.greaterequals(stack.pop(), stack.pop()));\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void lessequal() {\n" +
            "        stack.push(op.lessequal(stack.pop(), stack.pop()));\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void notequal() throws Exception {\n" +
            "        stack.push(op.notequal(stack.pop(), stack.pop()));\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public boolean bpop() throws Exception {\n" +
            "        Object res = stack.pop();\n" +
            "        if (res instanceof Boolean) {\n" +
            "            return (boolean) res;\n" +
            "        } else {\n" +
            "            throw new Exception(\"Cannot convert \" + res.getClass().toString() + \" to boolean for condition check.\");\n" +
            "        }\n" +
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
            "\n" +
            "        SymTable target = callStack.pop();\n" +
            "        while (target != scopeStack.getScope()) {\n" +
            "            scopeStack.popScope();\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "\n" +
            "    @Override\n" +
            "    public void forloop(Runnable runnable) throws Exception {\n" +
            "        int begin = (Integer) stack.pop();\n" +
            "        int end = (Integer) stack.pop();\n" +
            "        for (int i = begin; i <= end; i++) {\n" +
            "            runnable.run();\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void run() throws Exception {\n";
}
