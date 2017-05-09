package stack.MyStack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * Author:  Air
 * Date  :  2017/5/4.
 */
public class MyStack<E> implements Iterable {
    private ArrayList<E> list;

    public MyStack() {
        this.list = new ArrayList<E>();
    }

    public int size() {
        return list.size();
    }

    public E getTop() {
        if (isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public void push(E e) {
        list.add(e);
    }

    public E pop() {
        if (isEmpty()) {
            return null;
        }
        return list.remove(list.size() - 1);
    }
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {

    }
}
