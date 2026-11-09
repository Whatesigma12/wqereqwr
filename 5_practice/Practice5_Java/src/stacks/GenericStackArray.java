package stacks;

import java.util.Arrays;
import java.util.EmptyStackException;

/** Task 2.1: generic stack using an array, doubling its capacity when full. */
public class GenericStackArray<E> {
    private Object[] elements = new Object[2];
    private int size;

    public int getSize() { return size; }
    public boolean isEmpty() { return size == 0; }

    public void push(E item) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        elements[size++] = item;
    }

    @SuppressWarnings("unchecked")
    public E peek() {
        if (isEmpty()) throw new EmptyStackException();
        return (E) elements[size - 1];
    }

    @SuppressWarnings("unchecked")
    public E pop() {
        if (isEmpty()) throw new EmptyStackException();
        E result = (E) elements[--size];
        elements[size] = null;
        return result;
    }

    @Override
    public String toString() {
        return "Stack: " + Arrays.toString(Arrays.copyOf(elements, size));
    }
}
