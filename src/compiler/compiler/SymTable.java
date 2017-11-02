package compiler;

public interface SymTable {

    void add(String name);

    void assign(String name, int value);

    int get(String name);

    boolean contains(String name);
}
