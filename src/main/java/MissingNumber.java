import java.util.HashMap;
import java.util.Map;

public class MissingNumber {

    public static void findMissing(int[] num, int totalNum){
        int total = totalNum*(totalNum + 1) / 2;

        int sumOfNum = 0;

        for (int i=0 ; i< num.length ; i++){
            sumOfNum = sumOfNum + num[i];
        }
        System.out.println("Missing number "+ (total - sumOfNum));
    }

    public static void  find2Missing(int[] num, int totalNum){

        //Map - > int (num) , boolean
        Map<Integer,Boolean> map =  new HashMap<>();

        for (int i=0 ; i< num.length ; i++) {
            map.put(num[i],true);
        }

        for (int i=1 ; i<= totalNum ; i++) {
            if(!map.containsKey(i))
                System.out.println("Missing number " + i);
        }
    }
    public static void main(String[] args) {

        int[] num = {1,2,3,4,5,6,8,9,10};
//        MissingNumber.findMissing(num,10);

        int[] num2 = {1,2,4,6,8,9,10};
        MissingNumber.find2Missing(num2,10);

    }
}
