package implementations;

import Interfaces.ScopeStack;
import Interfaces.SymTable;

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
    public void newScope(SymTable table) {
        symTablesStack.add(new SymTableImpl(table));
    }

    @Override
    public void popScope() {
        symTablesStack.remove(symTablesStack.size() - 1);
    }

    @Override
    public void add(String name) {
        symTablesStack.get(symTablesStack.size() - 1).add(name);
    }

    @Override
    public void assign(String name, Object value) throws Exception {
        SymTable currentScope = symTablesStack.get(symTablesStack.size() - 1);
        while (!currentScope.contains(name) && currentScope.getOrigin() != null) {
            currentScope = currentScope.getOrigin();
        }
        if (currentScope != null) {
            currentScope.assign(name, value);
        } else {
            throw new Exception("Variable " + name + " was not found in any scope");
        }
    }

    @Override
    public Object get(String name) throws Exception {
        SymTable currentScope = symTablesStack.get(symTablesStack.size() - 1);
        while (!currentScope.contains(name) && currentScope.getOrigin() != null) {
            currentScope = currentScope.getOrigin();
        }
        //noinspection ConstantConditions
        if (currentScope != null) {
            return currentScope.get(name);
        } else {
            throw new Exception("Variable " + name + " was not found in any scope.");
        }
    }

    @Override
    public SymTable getScope() {
        return symTablesStack.get(symTablesStack.size() - 1);
    }
}
