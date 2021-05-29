package ProducerConsumer;

import java.util.Arrays;
import java.util.LinkedList;

public class Resource {

    LinkedList linkedList=  new LinkedList();
    int capacity =5;

    public void produce() throws InterruptedException {
        while (true) {
            synchronized (linkedList) {
                if (linkedList.size() < capacity) {
                    linkedList.add(Math.random());
                    System.out.println("Producer added. Now size is "+ linkedList.size());

                    linkedList.notify();
                    System.out.println("Producer sleeping");
                    Thread.sleep(1000);
                    System.out.println("Producer woke");
                } else {
                    try {
                        System.out.println("Producer waiting. Because size is "+ linkedList.size());
                        linkedList.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public void consume(){
        while (true) {
            synchronized (linkedList) {
                if (linkedList.size() != 0) {
                    linkedList.remove();
                    System.out.println("Consumer consumed. Now size is "+ linkedList.size());
                    linkedList.notify();

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        System.out.println("Consumer waiting. Because size is "+ linkedList.size());
                        linkedList.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
