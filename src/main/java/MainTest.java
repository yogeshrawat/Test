import javax.management.relation.RelationNotFoundException;
import java.util.Random;

public class MainTest {

    public static void main(String[] args) {

        BlockingQueue<Integer> blockingQueue = new BlockingQueue();

        Runnable producer = new Runnable() {
            Random random = new Random();
            @Override
            public void run() {
                while (true) {
                    int val = random.nextInt(100);
                    blockingQueue.put(val);
                    System.out.println("Produced val :" + val);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Runnable consumer = new Runnable() {
            Random random = new Random();
            @Override
            public void run() {
                while (true) {
                    int val = blockingQueue.take();
                    System.out.println("Consumed val :" + val);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread producerThread = new Thread(producer);
        producerThread.start();

        Thread consumerThread = new Thread(consumer);
        consumerThread.start();



    }
}
