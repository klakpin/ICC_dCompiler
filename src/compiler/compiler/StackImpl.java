package compiler;


import runtime.Stack;

import java.util.ArrayList;

public class StackImpl implements Stack {
    public ArrayList<Object> stack = new ArrayList<>();

    @Override
    public Object pop() {
        Object res = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return res;
    }

    @Override
    public void push(Object obj) {
        stack.add(obj);
    }
}