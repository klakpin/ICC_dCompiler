package implementations;

import Interfaces.CallStack;
import Interfaces.SymTable;

import java.util.ArrayList;

public class CallStackImpl implements CallStack {

    private ArrayList<SymTable> tablesList = new ArrayList<>();

    @Override
    public void add(SymTable data) {
        tablesList.add(data);
    }

    @Override
    public SymTable pop() {
        SymTable result = tablesList.get(tablesList.size() - 1);
        tablesList.remove(tablesList.size() - 1);
        return result;
    }
}
