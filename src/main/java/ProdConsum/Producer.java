package ProdConsum;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{

    BlockingQueue blockingQueue ;

    Producer(BlockingQueue blockingQueue){
        this.blockingQueue = blockingQueue;
    }
    @Override
    public void run() {

        while (true) {
            try {
                this.blockingQueue.put(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Added Element");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
