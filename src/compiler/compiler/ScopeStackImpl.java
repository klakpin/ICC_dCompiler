package compiler;

import runtime.ScopeStack;
import runtime.SymTable;
import types.Function;

import java.util.ArrayList;

public class ScopeStackImpl implements ScopeStack {


    private ArrayList<SymTable> symTablesStack;

    public ScopeStackImpl() {
        symTablesStack = new ArrayList<>();
    }

    @Override
    public void newScope() {
        symTablesStack.add(new SymTableImpl());
    }

    @Override
    public void popScope() {
        symTablesStack.remove(symTablesStack.size() - 1);
    }

    @Override
    public void add(String variable) {
        symTablesStack.get(symTablesStack.size() - 1).add(variable);
    }

    @Override
    public void assign(String variable, Object value) {
        for (int i = symTablesStack.size() - 1; i >= 0; i--) {
            if (symTablesStack.get(i).contains(variable)) {
                symTablesStack.get(i).assign(variable, value);
            }
        }
    }

    @Override
    public Object get(String variable) {
        for (int i = symTablesStack.size() - 1; i >= 0; i--) {
            if (symTablesStack.get(i).contains(variable)) {
                return symTablesStack.get(i).get(variable);
            }
        }
        return null;
    }

    @Override
    public void invoke(String name) {
        Function func = (Function) get(name);
        func.run();
    }
}
