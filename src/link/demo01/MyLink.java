package link.demo01;

import java.util.Queue;

/**
 * Author:  Air
 * Date  :  2017/5/9.
 */
public class MyLink<T> {
    Queue
    public int data;
    public MyLink next;
    public MyLink previous;

    public MyLink() {

    }

    public MyLink(int num) {
        this.data = num;
        this.previous = null;
        this.next = null;
    }

    public void addFirst(MyLink link) {
        link.next = this;
        this.previous = link;
        this.next = null;
    }
    public void addLast(MyLink link) {
        this.next = link;
        link.previous = this;
        link.next = null;
    }

    public void deleteFirst() {
        MyLink link = this;
        while (link.previous != null) {
            link = link.previous;
        }
        link.next.previous = null;
        link.next = null;
    }
}
