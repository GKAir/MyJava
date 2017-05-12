package link;

import link.demo01.MyLink;

/**
 * Author:  Air
 * Date  :  2017/5/9.
 */
public class LinkMain {
    public static void main(String[] args) {
        MyLink link = new MyLink(666);

        MyLink next1 = new MyLink(777);


        System.out.println(666);

        link.addFirst(next1);

        System.out.println(link.data);
        System.out.println(link.next);
        System.out.println(next1.data);
        System.out.println(next1.next.data);
        System.out.println(next1.previous);

    }
}
