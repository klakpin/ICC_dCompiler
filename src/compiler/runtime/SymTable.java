package runtime;

/**
 * Symbol table that contains all variables
 */
public interface SymTable {

    void add(String name);

    void assign(String name, Object value);

    Object get(String name);

    boolean contains(String name);
}
