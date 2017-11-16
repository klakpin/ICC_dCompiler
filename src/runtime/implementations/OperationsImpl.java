package implementations;

import Interfaces.Operations;

import java.util.Objects;

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
        if (var1 instanceof Integer && var2 instanceof Integer) {
            Integer a = (Integer) var1;
            Integer b = (Integer) var2;
            return a / b;
        }
        //TODO write all possible operations
        return null;

    }

    @Override
    public Boolean greater(Object var1, Object var2) {
        if (var1 instanceof Integer && var2 instanceof Integer) {
            return (Integer) var1 > (Integer) var2;
        }
        if (var1 instanceof Integer && var2 instanceof Double) {
            return (Integer) var1 > (Double) var2;
        }
        if (var1 instanceof Double && var2 instanceof Integer) {
            return (Double) var1 > (Integer) var2;
        }
        if (var1 instanceof Double && var2 instanceof Double) {
            return (Double) var1 > (Double) var2;
        }

        return null;
    }

    @Override
    public Boolean less(Object var1, Object var2) {
        if (var1 instanceof Integer && var2 instanceof Integer) {
            return (Integer) var1 < (Integer) var2;
        }
        if (var1 instanceof Integer && var2 instanceof Double) {
            return (Integer) var1 < (Double) var2;
        }
        if (var1 instanceof Double && var2 instanceof Integer) {
            return (Double) var1 < (Integer) var2;
        }
        if (var1 instanceof Double && var2 instanceof Double) {
            return (Double) var1 < (Double) var2;
        }
        return null;
    }

    @Override
    public Boolean notequal(Object var1, Object var2) {

        if (var1 instanceof Integer && var2 instanceof Integer) {
            return var1 != var2;
        }
        if (var1 instanceof Integer && var2 instanceof Double) {
            int a = (Integer) var1;
            double b = (Double) var2;
            return a != b;

        }
        if (var1 instanceof Double && var2 instanceof Integer) {
            double a = (Double) var1;
            int b = (Integer) var2;
            return a != b;
        }
        if (var1 instanceof Double && var2 instanceof Double) {
            return var1 != var2;
        }
        return null;
    }

    @Override
    public Boolean greaterequals(Object var1, Object var2) {
        if (var1 instanceof Integer && var2 instanceof Integer) {
            return (Integer) var1 >= (Integer) var2;
        }
        if (var1 instanceof Integer && var2 instanceof Double) {
            return (Integer) var1 >= (Double) var2;
        }
        if (var1 instanceof Double && var2 instanceof Integer) {
            return (Double) var1 >= (Integer) var2;
        }
        if (var1 instanceof Double && var2 instanceof Double) {
            return (Double) var1 >= (Double) var2;
        }
        return null;
    }

    @Override
    public Boolean lessequal(Object var1, Object var2) {
        if (var1 instanceof Integer && var2 instanceof Integer) {
            return (Integer) var1 <= (Integer) var2;
        }
        if (var1 instanceof Integer && var2 instanceof Double) {
            return (Integer) var1 <= (Double) var2;
        }
        if (var1 instanceof Double && var2 instanceof Integer) {
            return (Double) var1 <= (Integer) var2;
        }
        if (var1 instanceof Double && var2 instanceof Double) {
            return (Double) var1 <= (Double) var2;
        }
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
        if (var1 instanceof Integer && var2 instanceof Integer) {
            return (Integer) var1 == (Integer) var2;
        }
        if (var1 instanceof Integer && var2 instanceof Double) {
            int a = (Integer) var1;
            double b = (Double) var2;
            return a == b;

        }
        if (var1 instanceof Double && var2 instanceof Integer) {
            double a = (Double) var1;
            int b = (Integer) var2;
            return a == b;

        }
        if (var1 instanceof Double && var2 instanceof Double) {
            return var1 == var2;
        }
        return null;
    }

    @Override
    public Boolean and(Object var1, Object var2) {
        if (var1 instanceof Boolean && var2 instanceof Boolean) {
            if (var1.equals(true) && var2.equals(true)) {
                return true;
            }
            return false;
        }
        return null;

    }

    @Override
    public Boolean or(Object var1, Object var2) {
        if (var1 instanceof Boolean && var2 instanceof Boolean) {
            if (var1.equals(false) && var2.equals(false)) {
                return false;
            }
            return true;
        }
        return null;
    }

    @Override
    public Boolean xor(Object var1, Object var2) {
        if (var1 instanceof Boolean && var2 instanceof Boolean) {
            if ((var1.equals(true) && var2.equals(true)) || (var1.equals(false) && var2.equals(false))) {
                return false;
            }
            return true;
        }
        return null;
    }

    @Override
    public Boolean not(Object var1) {
        if (var1 instanceof Boolean) {
            if (var1.equals(true)) {
                return false;
            }
            return true;
        }
        return null;
    }


}
