package implementations;

import Interfaces.SymTable;

import java.util.HashMap;

public class SymTableImpl implements SymTable {

    HashMap<String, Object> values;

    SymTable origin;

    public SymTableImpl() {
        values = new HashMap<>();
    }

    public SymTableImpl(SymTable table) {
        values = new HashMap<>();
        origin = table;
    }

    @Override
    public SymTable getOrigin() {
        return origin;
    }

    @Override
    public void add(String name) throws Exception {
        if (values.containsKey(name)) {
            throw new Exception("Variable is already defined in the scope: " + name);
        }
        values.put(name, null);
    }

    @Override
    public void assign(String name, Object value) {
        values.put(name, value);
    }

    @Override
    public Object get(String name) {
        return values.get(name);
    }

    @Override
    public boolean contains(String name) {
        return values.containsKey(name);
    }
}
