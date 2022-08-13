import java.util.LinkedList;
import java.util.Queue;

public class Queues {

    public static void main(String[] args) {

        // Queue = FIFO data structure. First-In First-Out
        //		   A collection designed for holding elements prior to processing
        //		   Linear data structure

        //         enqueue (add) = offer()
        //         dequeue (remove) = poll()
        //         peek();


        Queue<String> queue = new LinkedList<String>();

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

//        System.out.println(queue.isEmpty());
//        System.out.println(queue.size());
//        System.out.println(queue.contains("Harold"));

        System.out.println(queue.peek());
        queue.poll();

        System.out.println(queue);


    }
}
