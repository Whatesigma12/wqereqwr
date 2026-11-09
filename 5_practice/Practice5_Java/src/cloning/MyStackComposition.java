package cloning;

import java.util.ArrayList;
import java.util.EmptyStackException;

/** Original composition-based stack, tasks 3.1 and 3.2. */
public class MyStackComposition implements Cloneable {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() { return list.isEmpty(); }
    public int getSize() { return list.size(); }
    public Object peek() {
        if (isEmpty()) throw new EmptyStackException();
        return list.get(getSize() - 1);
    }
    public Object pop() {
        if (isEmpty()) throw new EmptyStackException();
        return list.remove(getSize() - 1);
    }
    public void push(Object o) { list.add(o); }

    /** Copy the mutable ArrayList itself, not just its reference.
     * Contents are not recursively cloned (arbitrary Object cannot be cloned safely).
     */
    @Override
    public MyStackComposition clone() {
        try {
            MyStackComposition copy = (MyStackComposition) super.clone();
            copy.list = new ArrayList<>(this.list);
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override
    public String toString() { return "Stack: " + list; }
}
