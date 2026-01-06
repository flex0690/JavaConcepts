import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        PriorityQueue<Integer> pq = new PriorityQueue<> (Comparator.reverseOrder());

        pq.add(0);
        pq.add(2);
        pq.add(5);
        pq.add(1);
        pq.add(9);
        pq.add(2);

        Iterator it = pq.iterator();

        System.out.printf("Head of queue: %d \n" , pq.peek());
//        System.out.println(pq.size());
//        System.out.println("head of queue: " + pq.poll());
//        System.out.println(pq.size());
//        System.out.printf("Head of queue: %d \n" , pq.peek());
//        System.out.println(pq);


        while (it.hasNext()) {
            System.out.printf("%d ", it.next());
        }


    }
}