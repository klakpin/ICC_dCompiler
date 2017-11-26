package implementations;

import interfaces.Stack;

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
    public void printStack(String text) {
        System.out.println("-------------------------------------------------");
        System.out.print(text + " : ");
        System.out.print("Top of stack -> | ");
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.print(stack.get(i) + " ");
        }
        System.out.println("   |");
        System.out.println("-------------------------------------------------");
    }

    @Override
    public void push(Object obj) {
        stack.add(obj);
    }

    @Override
    public Object get() {
        return stack.get(stack.size() - 1);
    }
}