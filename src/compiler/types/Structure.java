package types;

import java.util.ArrayList;
import java.util.HashMap;

public class Structure {
    private HashMap<String, Object> objects = new HashMap<>();

    public Object get(String name) {
        return objects.get(name);
    }

    public void set(String name, Object value) {
        objects.put(name, value);
    }
}
