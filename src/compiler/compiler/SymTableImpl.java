package compiler;

import java.util.ArrayList;
import java.util.HashMap;

public class SymTableImpl implements SymTable {


    HashMap<String, Integer> values;

    public SymTableImpl() {
        values = new HashMap<>();
    }

    @Override
    public void add(String name) {
        values.put(name, 0);
    }

    @Override
    public void assign(String name, int value) {
        values.put(name, value);
    }

    @Override
    public int get(String name) {
        return values.get(name);
    }

    @Override
    public boolean contains(String name) {
        return values.containsKey(name);
    }
}
