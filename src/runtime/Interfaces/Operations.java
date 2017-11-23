package Interfaces;

/**
 * All operations were taken from language description
 */
public interface Operations {

    Object plusplus(Object var1) throws Exception;

    Object minusminus(Object var1) throws Exception;

    Object plus(Object var1, Object var2);

    Object minus(Object var1, Object var2);

    Object divide(Object var1, Object var2);

    Object multiply(Object var1, Object var2);

    Boolean equals(Object var1, Object var2) throws Exception;

    Boolean greater(Object var1, Object var2);

    Boolean less(Object var1, Object var2);

    Boolean notequal(Object var1, Object var2) throws Exception;

    Boolean greaterequals(Object var1, Object var2);

    Boolean lessequal(Object var1, Object var2);

    Boolean and(Object var1, Object var2);

    Boolean or(Object var1, Object var2);

    Boolean xor(Object var1, Object var2);

    Boolean not(Object var1);

    Object size(Object var1);
}
