package interfaces;

/**
 * Stack that contains variables, like JVM stack
 */
public interface Stack {
    Object pop();

    void push(Object obj);

    Object get();

    void printStack(String text);
}
