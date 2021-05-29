import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue<T> {

    //test 4.1
    //test 4.2
    //test 5.1
    //test 5.2
    private Queue<T> queue = new LinkedList<>();
    int capacity = 5;

    public synchronized void put(T val) {

        if (queue.size() == capacity) {
            try {
                System.out.println("Queue is full. Waiting...");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        queue.add(val);
//            System.out.println("Added value in Queue " + val);
        notify();

    }


    public synchronized T take() {

        if (queue.size() == 0) {
            try {
                System.out.println("Queue is empty. Waiting...");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        T item = queue.remove();
//            System.out.println("Removed element " + item.toString());
        notify();
        return item;
    }
}
