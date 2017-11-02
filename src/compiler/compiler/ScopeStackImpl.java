package compiler;

import java.util.ArrayList;

public class ScopeStackImpl implements ScopeStack {

    ArrayList<SymTable> stack;

    public ScopeStackImpl() {
        stack = new ArrayList<>();
    }

    @Override
    public void newScope() {
        stack.add(new SymTableImpl());
    }

    @Override
    public void popScope() {
        stack.remove(stack.size() - 1);
    }

    @Override
    public void add(String variable) {
        stack.get(stack.size() - 1).add(variable);
    }

    @Override
    public void assign(String variable, int value) {
        stack.get(stack.size() - 1).assign(variable, value);

    }

    @Override
    public int get(String variable) {
        for (int i = stack.size() - 1; i >= 0; i--) {
            if (stack.get(i).contains(variable)) {
                return stack.get(i).get(variable);
            }
        }
        return 0;
    }
}
