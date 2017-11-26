package types;

import java.util.HashMap;

/**
 * Cortege is our arrays
 */
public class Cortege {

    private HashMap<Integer, Object> objects = new HashMap<>();

    public void concatination(Cortege cortage1) {
        objects.putAll(cortage1.returnObjects());
    }

    public Object get(int number) {
        return objects.get(number);
    }

    public HashMap<Integer, Object> returnObjects() {
        return objects;
    }

    public void set(int number, Object value) {
        objects.put(number, value);
    }

    public int getSize() {
        return objects.size();
    }
}
