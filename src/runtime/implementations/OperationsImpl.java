package implementations;

import Interfaces.Operations;
import types.Cortaige;
import types.Structure;

import java.util.Objects;

//TODO implement everything
public class OperationsImpl implements Operations {

    @Override
    public Object plusplus(Object var1) {
        return null;
    }

    @Override
    public Object minusminus(Object var1) {
        return null;
    }

    @Override
    public Object plus(Object var1, Object var2) {
        //integer+integer
        if (var1 instanceof Integer && var2 instanceof Integer) {
            Integer a = (Integer) var1;
            Integer b = (Integer) var2;
            Integer sum=a+b;
            return sum;
        }
        //integer+double
        if (var1 instanceof Integer && var2 instanceof Double) {
            Integer a = (Integer) var1;
            Double b = (Double) var2;
            Double sum=a+b;
            return sum;
        }
        //double+integer
        if (var1 instanceof Double && var2 instanceof Integer) {
            Double a = (Double) var1;
            Integer b = (Integer) var2;
            Double sum=a+b;
            return sum;
        }
        //double+double
        if (var1 instanceof Double && var2 instanceof Double) {
            Double a = (Double) var1;
            Double b = (Double) var2;
            Double sum=a+b;
            return sum;
        }
        //string+string
        if (var1 instanceof String && var2 instanceof String) {
            String a = (String) var1;
            String b = (String) var2;
            String sum=a+b;
            return sum;
        }
        //cortaige+cortaige
        if (var1 instanceof Cortaige && var2 instanceof Cortaige) {
            Cortaige a = (Cortaige) var1;
            Cortaige b = (Cortaige) var2;
            a.concatination(b);
            return a;
        }
        //cortaige+object
        if (var1 instanceof Cortaige && var2 instanceof Structure) {
            Cortaige a = (Cortaige) var1;
            Structure b = (Structure) var2;
            a.concatination(b.convertToCortaige());
            return a;
        }
        //TODO object+object!!!!!!!
        if (var1 instanceof Structure && var2 instanceof Structure) {
            Structure a = (Structure) var1;
            Structure b = (Structure) var2;
            a.concatination(b);
            return a;
        }
        return null;
    }

    @Override
    public Object minus(Object var1, Object var2) {
        //integer-integer
        if (var1 instanceof Integer && var2 instanceof Integer) {
            Integer a = (Integer) var1;
            Integer b = (Integer) var2;
            Integer minus1=a-b;
            return minus1;
        }
        //integer-double
        if (var1 instanceof Integer && var2 instanceof Double) {
            Integer a = (Integer) var1;
            Double b = (Double) var2;
            Double minus1=a-b;
            return minus1;
        }
        //double-integer
        if (var1 instanceof Double && var2 instanceof Integer) {
            Double a = (Double) var1;
            Integer b = (Integer) var2;
            Double minus1=a-b;
            return minus1;
        }
        //double-double
        if (var1 instanceof Double && var2 instanceof Double) {
            Double a = (Double) var1;
            Double b = (Double) var2;
            Double minus1=a-b;
            return minus1;
        }

        return null;
    }

    @Override
    public Object divide(Object var1, Object var2) {
        //integer/integer
        if (var1 instanceof Integer && var2 instanceof Integer) {
            Integer a = (Integer) var1;
            Integer b = (Integer) var2;
            Integer divide1=a/b;
            return divide1;
        }
        //integer/double
        if (var1 instanceof Integer && var2 instanceof Double) {
            Integer a = (Integer) var1;
            Double b = (Double) var2;
            Double divide1=a/b;
            return divide1;
        }
        //double/integer
        if (var1 instanceof Double && var2 instanceof Integer) {
            Double a = (Double) var1;
            Integer b = (Integer) var2;
            Double divide1=a/b;
            return divide1;
        }
        //double/double
        if (var1 instanceof Double && var2 instanceof Double) {
            Double a = (Double) var1;
            Double b = (Double) var2;
            Double divide1=a/b;
            return divide1;
        }
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
        //integer*integer
        if (var1 instanceof Integer && var2 instanceof Integer) {
            Integer a = (Integer) var1;
            Integer b = (Integer) var2;
            Integer multiply1=a*b;
            return multiply1;
        }
        //integer*double
        if (var1 instanceof Integer && var2 instanceof Double) {
            Integer a = (Integer) var1;
            Double b = (Double) var2;
            Double multiply1=a*b;
            return multiply1;
        }
        //double*integer
        if (var1 instanceof Double && var2 instanceof Integer) {
            Double a = (Double) var1;
            Integer b = (Integer) var2;
            Double multiply1=a*b;
            return multiply1;
        }
        //double*double
        if (var1 instanceof Double && var2 instanceof Double) {
            Double a = (Double) var1;
            Double b = (Double) var2;
            Double multiply1=a*b;
            return multiply1;
        }
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
