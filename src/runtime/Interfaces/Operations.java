package Interfaces;

/**
 * All operations were taken from language description
 */
public interface Operations {

    // TODO Alyona
    Object plus(Object var1);

    // TODO Alyona
    Object minus(Object var1);

    // TODO Alyona
    Object plus(Object var1, Object var2);

    // TODO Alyona
    Object minus(Object var1, Object var2);

    // TODO Alyona
    Object divide(Object var1, Object var2);

    // TODO Alyona
    Object multiply(Object var1, Object var2);

    // TODO Milana
    Boolean equals(Object var1, Object var2);

    // TODO Milana
    Boolean greater(Object var1, Object var2);

    // TODO Milana
    Boolean less(Object var1, Object var2);

    // TODO Milana
    Boolean notequal(Object var1, Object var2);

    // TODO Milana
    Boolean moreequals(Object var1, Object var2);

    Boolean lessequals(Object var1, Object var2);

    Boolean and(Object var1, Object var2);

    Boolean or(Object var1, Object var2);

    Boolean xor(Object var1, Object var2);

    Boolean not(Object var1, Object var2); // why 2 arguments?
}
