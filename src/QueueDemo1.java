import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/**
 * Create by Air on 2017/5/20 at 14:22
 */
public class QueueDemo1 {
    public static void main(String args[]) {
        /**
         * Deque比较快   猜想是因为每次添加元素都只是移动一个位置
         * 然而LinkedList 却要解除关系因此要比Deque花费稍微多的时间
         */
        Deque<Integer> q = new ArrayDeque<>();
        //Deque<Integer> q = new LinkedList<>();
        long begin = System.nanoTime();
        test(q);
        long end = System.nanoTime();
        System.out.println("took " + (end - begin) + "ns");
    }

    public static void test(Deque<Integer> q) {
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 10_000; j++) {
                q.addLast(j);
            }

            for (int j = 0; j < 10_000; j++) {
                q.removeFirst();
            }
        }
    }
}
