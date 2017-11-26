package interfaces;

public interface CallStack {

    void add(SymTable data);

    public SymTable pop();
}
