package ProducerConsumer;

public class Consumer implements Runnable{

    Resource resource;

    public Consumer(Resource resource) {
        this.resource = resource;
    }

    public void run() {
        System.out.println("Consumer thread");
        resource.consume();
    }
}
