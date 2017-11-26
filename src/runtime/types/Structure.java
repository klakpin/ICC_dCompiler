package types;

import implementations.OperationsImpl;

import java.util.HashMap;

public class Structure {
    private HashMap<String, Object> objects = new HashMap<>();

    public Object get(String name) {
        return objects.get(name);
    }

    public Cortege convertToCortaige() {
        Cortege cortege = new Cortege();
        for (int i=0;i<objects.size();i++){
            cortege.set(i, objects.values().toArray()[i]);
        }
        return cortege;
    }

    public void concatination(Structure structure1) throws Exception {
        String[] strings=new String[this.getSize()];
        strings=objects.keySet().toArray(new String[this.getSize()]);
        OperationsImpl op=new OperationsImpl();
        for (int i=0;i<structure1.getSize();i++) {
            if (structure1.get(strings[i]) != null) {
                objects.replace(strings[i], op.plus(objects.get(strings[i]), structure1.getObjects().get(strings[i])));
                objects.remove(strings[i]);
            }
        }
        objects.putAll(structure1.getObjects());
    }
    public int getSize(){
        return objects.size();
    }

    public HashMap<String, Object> getObjects() {
        return objects;
    }

    public void set(String name, Object value) {
        objects.put(name, value);
    }
}
