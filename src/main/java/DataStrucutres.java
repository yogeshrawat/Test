import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DataStrucutres {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        map.put(1,"v1");
        map.put(2,"v2");
        map.put(3,"v3");

        Iterator iterator = map.entrySet().iterator();

        Iterator keyIterator = map.keySet().iterator();

        while (iterator.hasNext()){

            Map.Entry key = (Map.Entry) iterator.next();
            System.out.println(key.getKey());
            System.out.println(key.getValue());
        }

        while (keyIterator.hasNext()){
            System.out.println(keyIterator.next());
        }
    }
}

