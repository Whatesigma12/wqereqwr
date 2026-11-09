package stacks;

import java.util.ArrayList;
import java.util.EmptyStackException;

/** Task 2.2: generic stack using inheritance instead of composition. */
public class GenericStackInheritance<E> extends ArrayList<E> {
    public int getSize() { return size(); }
    public void push(E item) { add(item); }

    public E peek() {
        if (isEmpty()) throw new EmptyStackException();
        return get(size() - 1);
    }

    public E pop() {
        if (isEmpty()) throw new EmptyStackException();
        return remove(size() - 1);
    }

    @Override
    public String toString() { return "Stack: " + super.toString(); }
}
