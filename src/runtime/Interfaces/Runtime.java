package Interfaces;

/**
 * List of assembler-like commands
 */
public interface Runtime {
    /**
     * Push variable onto stack
     *
     * @param obj variable to be pushed in stack
     */
    void vpush(Object obj);

    /**
     * Get variable from scope stack and push it to top of stack
     *
     * @param name name of variable to be pushed in stack
     */
    void vpush(String name) throws Exception;

    /**
     * Add variable name to the symbol table of current scope
     *
     * @param name
     */
    void add(String name) throws Exception;

    /**
     * Assign to a variable with name value from top of the stack
     *
     * @param name
     */
    void assign(String name) throws Exception;

    /**
     * Takes value from array by index and put result in stack.
     * First value on stack is array index, second value is array itself.
     */
    void readcort() throws Exception;

    /**
     * Takes object from stack, takes index value (int) from stack, takes cortaige from stack, assign object to array cell
     * with certain index.
     */
    void assigncort() throws Exception;

    /**
     * Takes value from object by index (string) and put result in stack.
     * First value on stack is index, second value is object itself.
     */
    void readobj() throws Exception;

    /**
     * Takes object from stack, takes index name (string) from stack, takes structure from stack,
     * assign object to var in structure
     * with certain index
     */
    void assignobj() throws Exception;

    /**
     * Take type from top of stack, take variable from top of stack, check that types are same, put result on top of stack
     */
    void checktype();

    void readInt();

    void readDouble();

    void readString();

    /**
     * Assign value to variable in the scope, i.e. add it into current symbol table
     *
     * @param name
     * @param val
     */
    void assign(String name, Object val) throws Exception;

    void invoke(Object object) throws Exception;

    void enterScope();

    void exitScope();

    /**
     * Go to scope from which function was called.
     */
    void exitfunc();

    /**
     * Invokes function with given name
     *
     * @param name name of function
     */
    void invoke(String name) throws Exception;

    /**
     * Take function from top of stack and invokes it
     */
    void invoke() throws Exception;

    /**
     * Pop variable from top of stack and converts it into boolean value
     *
     * @return boolean variable of variable from top of stack
     */
    boolean bpop() throws Exception;

    /**
     * Add 2 variables from top of the stack and put result on top of the stack
     */
    void plus();

    /**
     * Subtract 2 variables from top of the stack and put result on top of the stack
     */
    void minus();

    void plusplus() throws Exception;

    void minusminus() throws Exception;

    /**
     * Multiply 2 variables from top of the stack and put result on top of the stack
     */
    void multiply();

    void divide();

    void greater();

    void greaterequals();

    void less();

    void lessequal();

    void equals();

    void notequal();

    void not();

    void or();

    void and();

    void xor();

    /**
     * Duplicates value on stack
     */
    void dup();

    /**
     * Swap elements on top of stack
     */
    void swap();

    void cprint();

    /**
     * This is for x..y loop, x is first argument on stack, y is second argument
     *
     * @param runnable loop body
     * @throws Exception exception that can be thrown while execution
     */
    void forloop(Runnable runnable) throws Exception;

    void run() throws Exception;
}
