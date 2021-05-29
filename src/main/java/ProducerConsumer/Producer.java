package ProducerConsumer;

public class Producer implements Runnable{

    Resource resource;

    public Producer(Resource resource) {
        this.resource = resource;
    }

    public void run() {
        System.out.println("Producer thread");
        try {
            resource.produce();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
