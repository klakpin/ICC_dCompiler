package Interfaces;

/**
 * All operations were taken from language description
 */
public interface Operations {

    Object plus(Object var1);

    Object minus(Object var1);

    Object plus(Object var1, Object var2);

    Object minus(Object var1, Object var2);

    Object divide(Object var1, Object var2);

    Object multiply(Object var1, Object var2);

    Boolean equals(Object var1, Object var2);

    Boolean greater(Object var1, Object var2);

    Boolean less(Object var1, Object var2);

    Boolean notequal(Object var1, Object var2);

    Boolean moreequals(Object var1, Object var2);

    Boolean lessequals(Object var1, Object var2);


    Boolean and(Object var1, Object var2);

    Boolean or(Object var1, Object var2);

    Boolean xor(Object var1, Object var2);

    Boolean not(Object var1, Object var2);
}
