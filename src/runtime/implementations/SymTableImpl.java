package implementations;

import Interfaces.SymTable;

import java.util.HashMap;
import java.util.Map;

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

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        String name;
        String value;


        result.append("¦- - - ¦- - - - ¦\n");
        result.append("¦ name ¦ value  ¦\n");
        result.append("¦------¦--------¦\n");

        for (Map.Entry<String, Object> entry : values.entrySet()) {
            name = entry.getKey();

            try {
                value = entry.getValue().toString();
            } catch (NullPointerException e) {
                value = "null";
            }

            result.append("¦");

            if (name.length() > 6) {
                name = name.substring(0, 6);
            }

            for (int i = 0; i < (6 - name.length()) / 2; i++) {
                result.append(" ");
            }

            result.append(name);

            for (int i = 0; i < (6 - name.length()) / 2; i++) {
                result.append(" ");
            }

            if (name.length() % 2 != 0) {
                result.append(" ");
            }
            result.append("¦");

            // value
            if (value.length() > 8) {
                value = value.substring(0, 8);
            }

            for (int i = 0; i < (8 - value.length()) / 2; i++) {
                result.append(" ");
            }

            result.append(value);

            for (int i = 0; i < (8 - value.length()) / 2; i++) {
                result.append(" ");
            }

            if (value.length() % 2 != 0) {
                result.append(" ");
            }
            result.append("¦\n");
        }
        result.append("¦- - - ¦- - - - ¦\n");


        return result.toString();
    }
}
