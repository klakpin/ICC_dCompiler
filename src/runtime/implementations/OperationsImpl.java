package implementations;

import interfaces.Operations;
import types.Cortege;
import types.Structure;
import types.Text;

import java.lang.instrument.Instrumentation;

public class OperationsImpl implements Operations {

    @Override
    public Object plusplus(Object var1) throws Exception {
        if (var1 instanceof Integer) {
            int value = (Integer) var1;
            value++;
            return value;
        } else if (var1 instanceof Double) {
            double value = (Double) var1;
            value++;
            return value;
        } else {
            throw new Exception("Operation '++' cannot be applied to " + var1.getClass().getTypeName());
        }
    }

    @Override
    public Object minusminus(Object var1) throws Exception {
        if (var1 instanceof Integer) {
            int value = (Integer) var1;
            value--;
            return value;
        } else if (var1 instanceof Double) {
            double value = (Double) var1;
            value--;
            return value;
        } else {
            throw new Exception("Operation '--' cannot be applied to " + var1.getClass().getTypeName());
        }
    }

    @Override
    public Object plus(Object var1, Object var2) throws Exception {
        //integer+integer
        if (var1 instanceof Integer && var2 instanceof Integer) {
            Integer a = (Integer) var1;
            Integer b = (Integer) var2;
            Integer sum = a + b;
            return sum;
        }
        //integer+double
        if (var1 instanceof Integer && var2 instanceof Double) {
            Integer a = (Integer) var1;
            Double b = (Double) var2;
            Double sum = a + b;
            return sum;
        }
        //double+integer
        if (var1 instanceof Double && var2 instanceof Integer) {
            Double a = (Double) var1;
            Integer b = (Integer) var2;
            Double sum = a + b;
            return sum;
        }
        //double+double
        if (var1 instanceof Double && var2 instanceof Double) {
            Double a = (Double) var1;
            Double b = (Double) var2;
            Double sum = a + b;
            return sum;
        }
        //string+string
        if (var1 instanceof Text && var2 instanceof Text) {
            Text a = (Text) var1;
            Text b = (Text) var2;
            return new Text(a.toString() + b.toString());
        }
        //cortaige+cortaige
        if (var1 instanceof Cortege && var2 instanceof Cortege) {
            Cortege a = (Cortege) var1;
            Cortege b = (Cortege) var2;
            a.concatination(b);
            return a;
        }
        //cortaige+object
        if (var1 instanceof Cortege && var2 instanceof Structure) {
            Cortege a = (Cortege) var1;
            Structure b = (Structure) var2;
            a.concatination(b.convertToCortaige());
            return a;
        }
        if (var1 instanceof Structure && var2 instanceof Structure) {
            Structure a = (Structure) var1;
            Structure b = (Structure) var2;
            a.concatination(b);
            return a;
        }
        throw new Exception("Incompatible operations type, cannot apply operation '+' to types "
                + var1.getClass().getTypeName() + " and " + var2.getClass().getTypeName());
    }

    @Override
    public Object minus(Object var1, Object var2) throws Exception {
        //integer-integer
        if (var1 instanceof Integer && var2 instanceof Integer) {
            Integer a = (Integer) var1;
            Integer b = (Integer) var2;
            Integer minus1 = a - b;
            return minus1;
        }
        //integer-double
        if (var1 instanceof Integer && var2 instanceof Double) {
            Integer a = (Integer) var1;
            Double b = (Double) var2;
            Double minus1 = a - b;
            return minus1;
        }
        //double-integer
        if (var1 instanceof Double && var2 instanceof Integer) {
            Double a = (Double) var1;
            Integer b = (Integer) var2;
            Double minus1 = a - b;
            return minus1;
        }
        //double-double
        if (var1 instanceof Double && var2 instanceof Double) {
            Double a = (Double) var1;
            Double b = (Double) var2;
            Double minus1 = a - b;
            return minus1;
        }
        throw new Exception("Incompatible operations type, cannot apply operation '-' to types "
                + var1.getClass().getTypeName() + " and " + var2.getClass().getTypeName());
    }

    @Override
    public Object divide(Object var1, Object var2) throws Exception {
        //integer/integer
        if (var1 instanceof Integer && var2 instanceof Integer) {
            Integer a = (Integer) var1;
            Integer b = (Integer) var2;
            Integer divide1 = a / b;
            return divide1;
        }
        //integer/double
        if (var1 instanceof Integer && var2 instanceof Double) {
            Integer a = (Integer) var1;
            Double b = (Double) var2;
            Double divide1 = a / b;
            return divide1;
        }
        //double/integer
        if (var1 instanceof Double && var2 instanceof Integer) {
            Double a = (Double) var1;
            Integer b = (Integer) var2;
            Double divide1 = a / b;
            return divide1;
        }
        //double/double
        if (var1 instanceof Double && var2 instanceof Double) {
            Double a = (Double) var1;
            Double b = (Double) var2;
            Double divide1 = a / b;
            return divide1;
        }
        throw new Exception("Incompatible operations type, cannot apply operation '/' to types "
                + var1.getClass().getTypeName() + " and " + var2.getClass().getTypeName());
    }

    @Override
    public Boolean greater(Object var1, Object var2) throws Exception {
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
        throw new Exception("Incompatible operations type, cannot apply operation '>' to types"
                + var1.getClass().getTypeName() + " and " + var2.getClass().getTypeName());
    }

    @Override
    public Boolean less(Object var1, Object var2) throws Exception {
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
        throw new Exception("Incompatible operations type, cannot apply operation '<' to types "
                + var1.getClass().getTypeName() + " and " + var2.getClass().getTypeName());
    }

    @Override
    public Boolean notequal(Object var1, Object var2) throws Exception {

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
        if (var1 instanceof Text && var2 instanceof Text) {
            Text v1 = (Text) var1;
            Text v2 = (Text) var2;
            return !v1.toString().equals(v2.toString());
        }
        throw new Exception("Incompatible operations type, cannot apply operation '/=' to types"
                + var1.getClass().getTypeName() + " and " + var2.getClass().getTypeName());
    }

    @Override
    public Boolean greaterequals(Object var1, Object var2) throws Exception {
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
        throw new Exception("Incompatible operations type, cannot apply operation '>=' to types "
                + var1.getClass().getTypeName() + " and " + var2.getClass().getTypeName());
    }

    @Override
    public Boolean lessequal(Object var1, Object var2) throws Exception {
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
        throw new Exception("Incompatible operations type, cannot apply operation '<=' to types"
                + var1.getClass().getTypeName() + " and " + var2.getClass().getTypeName());
    }

    @Override
    public Object multiply(Object var1, Object var2) throws Exception {
        //integer*integer
        if (var1 instanceof Integer && var2 instanceof Integer) {
            Integer a = (Integer) var1;
            Integer b = (Integer) var2;
            Integer multiply1 = a * b;
            return multiply1;
        }
        //integer*double
        if (var1 instanceof Integer && var2 instanceof Double) {
            Integer a = (Integer) var1;
            Double b = (Double) var2;
            Double multiply1 = a * b;
            return multiply1;
        }
        //double*integer
        if (var1 instanceof Double && var2 instanceof Integer) {
            Double a = (Double) var1;
            Integer b = (Integer) var2;
            Double multiply1 = a * b;
            return multiply1;
        }
        //double*double
        if (var1 instanceof Double && var2 instanceof Double) {
            Double a = (Double) var1;
            Double b = (Double) var2;
            Double multiply1 = a * b;
            return multiply1;
        }
        throw new Exception("Incompatible operations type, cannot apply operation '*' to types "
                + var1.getClass().getTypeName() + " and " + var2.getClass().getTypeName());
    }

    @Override
    public Boolean equals(Object var1, Object var2) throws Exception {
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
        if (var1 instanceof Text && var2 instanceof Text) {
            Text v1 = (Text) var1;
            Text v2 = (Text) var2;
            return v1.toString().equals(v2.toString());
        }
        throw new Exception("Incompatible operations type, cannot apply operation '=' to types "
                + var1.getClass().getTypeName() + " and " + var2.getClass().getTypeName());
    }

    @Override
    public Boolean and(Object var1, Object var2) throws Exception {
        if (var1 instanceof Boolean && var2 instanceof Boolean) {
            if (var1.equals(true) && var2.equals(true)) {
                return true;
            }
            return false;
        }
        throw new Exception("Incompatible operations type, cannot apply operation 'and' to types "
                + var1.getClass().getTypeName() + " and " + var2.getClass().getTypeName());
    }

    @Override
    public Boolean or(Object var1, Object var2) throws Exception {
        if (var1 instanceof Boolean && var2 instanceof Boolean) {
            if (var1.equals(false) && var2.equals(false)) {
                return false;
            }
            return true;
        }
        throw new Exception("Incompatible operations type, cannot apply operation 'or' to types "
                + var1.getClass().getTypeName() + " and " + var2.getClass().getTypeName());
    }

    @Override
    public Boolean xor(Object var1, Object var2) throws Exception {
        if (var1 instanceof Boolean && var2 instanceof Boolean) {
            if ((var1.equals(true) && var2.equals(true)) || (var1.equals(false) && var2.equals(false))) {
                return false;
            }
            return true;
        }
        throw new Exception("Incompatible operations type, cannot apply operation 'xor' to types "
                + var1.getClass().getTypeName() + " and " + var2.getClass().getTypeName());
    }

    @Override
    public Boolean not(Object var1) throws Exception {
        if (var1 instanceof Boolean) {
            if (var1.equals(true)) {
                return false;
            }
            return true;
        }
        throw new Exception("Incompatible operations type, cannot apply operation 'not' to type "
                + var1.getClass().getTypeName());
    }

    @Override
    public Object size(Object var1) {
        if (var1 instanceof Cortege) {
            Cortege var = (Cortege) var1;
            return var.getSize();
        } else if (var1 instanceof Structure) {
            Structure var = (Structure) var1;
            return var.getSize();
        } else {
            return 1;
        }
    }


}
