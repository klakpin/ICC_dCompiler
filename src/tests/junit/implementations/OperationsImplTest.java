package implementations;

import Interfaces.Operations;
import org.junit.jupiter.api.Test;
import types.Cortege;

import static org.junit.jupiter.api.Assertions.*;

class OperationsImplTest {

    Operations op = new OperationsImpl();

    @Test
    void plusplus() throws Exception {
        int var1 = 10;
        double var2 = 1.0;
        assertEquals(op.plusplus(var1), 11);
        assertEquals(op.plusplus(var2), 2.0);
    }

    @Test
    void minusminus() throws Exception {
        int var1 = 10;
        double var2 = 1.0;
        assertEquals(op.minusminus(var1), 9);
        assertEquals(op.minusminus(var2), 0.0);
    }

    @Test
    void plus() {
        int int1 = 2;
        int int2 = 3;
        //integer+integer
        assertEquals(op.plus(int1, int2), 5);

        double double1 = 10d;
        //integer+double
        assertEquals(op.plus(int1, double1), 12d);

        //double+integer
        assertEquals(op.plus(double1, int1), 12d);

        double double2 = -10d;
        //double+double
        assertEquals(op.plus(double1, double2), 0d);

        //string+string


        //cortaige+cortaige
        Cortege cort1 = new Cortege();
        Cortege cort2 = new Cortege();

        //cortaige+object

    }

    @Test
    void minus() {
    }

    @Test
    void divide() {
    }

    @Test
    void greater() {
    }

    @Test
    void less() {
    }

    @Test
    void notequal() {
    }

    @Test
    void greaterequals() {
    }

    @Test
    void lessequal() {
    }

    @Test
    void multiply() {
    }

    @Test
    void equals() {
    }

    @Test
    void and() {
    }

    @Test
    void or() {
    }

    @Test
    void xor() {
    }

    @Test
    void not() {
    }

}