package compiler;

import runtime.Operations;

//TODO implement everything
public class OperationsImpl implements Operations {

    @Override
    public Object plus(Object var1) {
        return null;
    }

    @Override
    public Object minus(Object var1) {
        return null;
    }

    @Override
    public Object plus(Object var1, Object var2) {
        if (var1 instanceof Integer && var2 instanceof Integer) {
            Integer a = (Integer) var1;
            Integer b = (Integer) var2;
            return a + b;
        }
        //TODO write all possible operations
        return null;
    }

    @Override
    public Object minus(Object var1, Object var2) {
        if (var1 instanceof Integer && var2 instanceof Integer) {
            Integer a = (Integer) var1;
            Integer b = (Integer) var2;
            return a - b;
        }
        //TODO write all possible operations
        return null;
    }

    @Override
    public Object divide(Object var1, Object var2) {
        return null;
    }

    @Override
    public Boolean greater(Object var1, Object var2) {
        if (var1 instanceof Integer && var2 instanceof Integer) {
            Integer a = (Integer) var1;
            Integer b = (Integer) var2;
            return a > b;
        }
        //TODO write all possible operations
        return null;
    }

    @Override
    public Boolean less(Object var1, Object var2) {
        return null;
    }

    @Override
    public Boolean notequal(Object var1, Object var2) {
        if (var1 instanceof Integer && var2 instanceof Integer) {
            Integer a = (Integer) var1;
            Integer b = (Integer) var2;
            return a != b;
        }
        //TODO write all possible operations
        return null;
    }

    @Override
    public Boolean moreequals(Object var1, Object var2) {
        return null;
    }

    @Override
    public Boolean lessequals(Object var1, Object var2) {
        return null;
    }

    @Override
    public Boolean and(Object var1, Object var2) {
        return null;
    }

    @Override
    public Boolean or(Object var1, Object var2) {
        return null;
    }

    @Override
    public Boolean xor(Object var1, Object var2) {
        return null;
    }

    @Override
    public Boolean not(Object var1, Object var2) {
        return null;
    }

    @Override
    public Object multiply(Object var1, Object var2) {
        if (var1 instanceof Integer && var2 instanceof Integer) {
            Integer a = (Integer) var1;
            Integer b = (Integer) var2;
            return a * b;
        }
        //TODO write all possible operations
        return null;
    }

    @Override
    public Boolean equals(Object var1, Object var2) {
        return null;
    }


}
