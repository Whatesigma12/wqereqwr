package cloning;

import java.util.ArrayList;
import java.util.EmptyStackException;

/** Task 3.1: MyStack defined by inheritance (extends ArrayList<Object>). */
public class MyStack extends ArrayList<Object> {
    public int getSize() { return size(); }
    public void push(Object o) { add(o); }
    public Object peek() {
        if (isEmpty()) throw new EmptyStackException();
        return get(size() - 1);
    }
    public Object pop() {
        if (isEmpty()) throw new EmptyStackException();
        return remove(size() - 1);
    }
}
