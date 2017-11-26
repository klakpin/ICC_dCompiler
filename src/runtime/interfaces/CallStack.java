package interfaces;

/**
 * Stack that stores all function calls
 */
public interface CallStack {

    void add(SymTable data);

    public SymTable pop();
}
