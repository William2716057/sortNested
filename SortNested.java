import java.util.*;

public class SortNested {
    public static void main(String[] args) {
        Object[] inputArray = {Arrays.asList(3), 4, Arrays.asList(2), Arrays.asList(5), 1, 6};

        Arrays.sort(inputArray, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                int v1 = getValue(o1);
                int v2 = getValue(o2);
                return Integer.compare(v1, v2);
            }

            private int getValue(Object obj) {
                if (obj instanceof List) {
                    return (int) ((List<?>) obj).get(0);
                } else {
                    return (int) obj;
                }
            }
        });

        System.out.println("Sorted: " + Arrays.toString(inputArray));
    }
}
