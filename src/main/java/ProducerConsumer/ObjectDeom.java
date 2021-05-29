package ProducerConsumer;

import java.util.Optional;

public class ObjectDeom {

    public void test(){
       // super();
    }
    @Override
    public String toString(){
        return "ObjectDeom";
    }

    public static void main(String[] args) {
        Optional<Object> o = Optional.of(new ObjectDeom());
        System.out.println(o.get().toString());
    }
}
