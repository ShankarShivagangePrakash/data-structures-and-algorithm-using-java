package queue;

import java.util.Stack;

public class QueueTest {

    public static void main(String[] args){

        Queue queue = new Queue();

        Queue.Node dequeueElement = queue.dequeue();
        System.out.println("Dequeued element is: " + ((dequeueElement != null) ? dequeueElement.getValue() : null));

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.getLength();
        queue.printQueue();

        Queue.Node dequeueElement1 = queue.dequeue();
        Queue.Node dequeueElement2 = queue.dequeue();
        Queue.Node dequeueElement3 = queue.dequeue();
        Queue.Node dequeueElement4 = queue.dequeue();
        System.out.println("Dequeued element is: " + ((dequeueElement1 != null) ? dequeueElement1.getValue() : null));
        System.out.println("Dequeued element is: " + ((dequeueElement2 != null) ? dequeueElement2.getValue() : null));
        System.out.println("Dequeued element is: " + ((dequeueElement3 != null) ? dequeueElement3.getValue() : null));
        System.out.println("Dequeued element is: " + ((dequeueElement4 != null) ? dequeueElement4.getValue() : null));
        queue.getLength();
        queue.printQueue();

    }
}
