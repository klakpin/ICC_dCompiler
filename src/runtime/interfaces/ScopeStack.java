package interfaces;

/**
 * Stack of scopes. For operations performing should traverse through all symbols tables starting from latest.
 */
public interface ScopeStack {

    /**
     * Add new symbol table onto stack
     */
    void newScope();

    /**
     * Add new symbol table onto stack and set the origin of new symbol table
     *
     * @param table origin of symbol table
     */
    void newScope(SymTable table);

    /**
     * Removes scope from stack
     */
    void popScope();

    /**
     * Returns symbol table but don't removes it from stack
     */
    SymTable getScope();

    /**
     * Add (declare) variable to symbol table on top of stack
     *
     * @param variable name of variable
     */
    void add(String variable) throws Exception;

    /**
     * Assign value to variable
     *
     * @param variable name of variable
     * @param value    value to be assigned
     */
    void assign(String variable, Object value) throws Exception;

    /**
     * Search through tables for object
     *
     * @param variable name of variable to find
     * @return found variable
     */
    Object get(String variable) throws Exception;
}
