package compiler;

public interface ScopeStack {

    /**
     * Add new scope onto stack
     */
    void newScope();

    /**
     * Removes scope from stack
     */
    void popScope();

    /**
     * Assign variable to symbol table on top of stack
     *
     * @param variable
     */
    void add(String variable);

    void assign(String variable, int value);

    int get(String variable);
}
