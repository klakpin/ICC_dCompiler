package types;

import java.util.HashMap;

public class Cortaige {

    private HashMap<Integer, Object> objects = new HashMap<>();

    public Object get(int number) {
        return objects.get(number);
    }

    public void set(int number, Object value) {
        objects.put(number, value);
    }
}
