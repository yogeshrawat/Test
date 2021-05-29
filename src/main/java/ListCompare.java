import java.util.*;

public class ListCompare {

    public static void main(String[] args) {
        Integer[] a1 = {1, 2, 3, 2, 1};
        Integer[] a2 = {1, 2, 3};
        Integer[] a3 = {1, 2, 3, 3};

//        System.out.println(sameElements(a1, a2));
        System.out.println(compareList(a3, a2));

    }

    static boolean sameElements(Object[] array1, Object[] array2) {
        Set<Object> uniqueElements1 = new HashSet<>(Arrays.asList(array1));
        Set<Object> uniqueElements2 = new HashSet<>(Arrays.asList(array2));

        // if size is different, means there will be a mismatch
        if (uniqueElements1.size() != uniqueElements2.size()) return false;

        for (Object obj : uniqueElements1) {
            // element not present in both?
            if (!uniqueElements2.contains(obj)) return false;
        }

        return true;
    }

    static boolean compareList(Integer[] expectedArray, Integer[] actualArray) {

        List<Integer> expectedList = Arrays.asList(expectedArray);
        List<Integer> actualList = Arrays.asList(actualArray);

        HashSet<Integer> expectedSet = new HashSet<>(expectedList);
//        expectedList = new ArrayList<>(expectedSet);
        // if size is different, means there will be a mismatch
        if (expectedList.size() != actualList.size()) return false;

        for (Integer obj : expectedList) {
            // element not present in both?
            if (!actualList.contains(obj)) return false;
        }

        return true;
    }
}
