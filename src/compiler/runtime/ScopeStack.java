package runtime;

/**
 * Stack of scopes. For operations performing should traverse through all symbols tables starting from latest.
 */
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

    void assign(String variable, Object value);

    Object get(String variable);

    void invoke(String name);
}
