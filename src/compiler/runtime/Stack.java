package runtime;

/**
 * Stack that contains variables, like JVM stack
 */
public interface Stack {
    Object pop();

    void push(Object obj);
}
