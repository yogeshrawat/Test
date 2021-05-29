package ProdConsum;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class Main {

    public static void main(String[] args) {

        BlockingQueue blockingQueue = new PriorityBlockingQueue<Integer>();

        Thread producerThread = new Thread(new Producer(blockingQueue));
        Thread consumerThread = new Thread(new Consumer(blockingQueue));

        producerThread.start();
        consumerThread.start();
    }


}
