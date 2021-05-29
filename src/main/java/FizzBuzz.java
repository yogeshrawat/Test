import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FizzBuzz {
    //If divisible by 3 -> fizz
    // by 5 -> buzz
    // by Both - > fizzbuzz

    public static void printFizzBuzz(int num){

        int dividBy3 = num%3;
        int dividBy5 = num%5;

        if( dividBy3 == 0 && dividBy5 == 0){
            System.out.println(num + " ->fizzBuzz");
        } else if (dividBy3 == 0){
            System.out.println(num + " ->fizz");
        } else if(dividBy5 == 0){
            System.out.println(num + " ->buzz");
        }
    }

    public static void main(String[] args) {
        FizzBuzz.printFizzBuzz(2);
        FizzBuzz.printFizzBuzz(3);
        FizzBuzz.printFizzBuzz(5);
        FizzBuzz.printFizzBuzz(9);
        FizzBuzz.printFizzBuzz(10);
        FizzBuzz.printFizzBuzz(12);
        FizzBuzz.printFizzBuzz(15);
        FizzBuzz.printFizzBuzz(30);

        Set s = new HashSet<String>();
        s.add("USD");
        s.add("CAD");
        System.out.println(s.toString());


    }
}
