package interfaces;

/**
 * All operations were taken from language description
 */
public interface Operations {

    Object plusplus(Object var1) throws Exception;

    Object minusminus(Object var1) throws Exception;

    Object plus(Object var1, Object var2) throws Exception;

    Object minus(Object var1, Object var2) throws Exception;

    Object divide(Object var1, Object var2) throws Exception;

    Object multiply(Object var1, Object var2) throws Exception;

    Boolean equals(Object var1, Object var2) throws Exception;

    Boolean greater(Object var1, Object var2) throws Exception;

    Boolean less(Object var1, Object var2) throws Exception;

    Boolean notequal(Object var1, Object var2) throws Exception;

    Boolean greaterequals(Object var1, Object var2) throws Exception;

    Boolean lessequal(Object var1, Object var2) throws Exception;

    Boolean and(Object var1, Object var2) throws Exception;

    Boolean or(Object var1, Object var2) throws Exception;

    Boolean xor(Object var1, Object var2) throws Exception;

    Boolean not(Object var1) throws Exception;

    Object size(Object var1);
}
