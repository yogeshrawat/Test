package ProducerConsumer;

import java.io.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ProducerConsumerMain {


    public static void main(String[] args) {

        Resource resource = new Resource();
        Thread producerThread = new Thread(new Producer(resource));
        Thread consumerThread = new Thread(new Consumer(resource));

        producerThread.start();
        consumerThread.start();

//        List<String> list = Arrays.asList("dog","over","good");
//        System.out.println(list.stream());
//
//        Supplier<String> i = () -> "Car";
//        Integer x =3;
//        Integer y = null;
//
//        System.out.println(Integer.compareUnsigned(x,3) == 0 || Integer.compareUnsigned(y,0) == 0);
//        System.out.println(y.compareTo(null) == 0);
//        double my = 9819.1341;
//        System.out.println(new DecimalFormat().format(my));
//        System.out.println(my);
//
//        System.out.print("Hello");
//        System.out.print("World");
//
//        System.out.println("New");
////        int7=7;
//        if(true){
//            System.out.println();
//        }
//
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(4);
//        String then = "";
//        list.forEach(System.out::println);
//
//        list.forEach(elem -> System.out.println(elem));
//        System.out.println(Stream.of("yellow","blue","green")
//        .max((s1,s2) -> s1.compareTo(s2))
//                .filter(s -> s.endsWith("n"))
//                .orElse("yellow"));
//
//        int a = 9 , b=2;
//        float f;
//        f = a/b;
//        System.out.println(f);
//        f= f/2;
//        System.out.println(f);
//
//        f= a + b/f;
//        System.out.println(f);
//
//        ByteArrayOutputStream b1 = new ByteArrayOutputStream();
//        b1.write(100);
//        System.out.println(b1.size());
//
//        byte c1[] = {10,20,30,40,50};
//        byte c2[] = {60,70,80,90};
//
//        b1.write(c1,0,c2.length);
//        System.out.println(b1.size());
    }
}
