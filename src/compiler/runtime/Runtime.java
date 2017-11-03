package runtime;

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
    void add(String name);

    /**
     * Assign to a variable with name value from top of the stack
     *
     * @param name
     */
    void assign(String name) throws Exception;

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
    boolean bpop();

    /**
     * Add 2 variables from top of the stack and put result on top of the stack
     */
    void plus();

    /**
     * Subtract 2 variables from top of the stack and put result on top of the stack
     */
    void minus();

    /**
     * Multiply 2 variables from top of the stack and put result on top of the stack
     */
    void multiply();

    void greater();

    void notequal();

    void run();
}
