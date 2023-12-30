package Arrays;

import java.util.HashMap;

public class OccuranceOfEleUsingHashMap {
    public static void main(String... A) {
        int arr1[] = {10, 5, 15, 20, 14, 5, 14, 5};

        HashMap<Integer, Integer> occurrenceMap = new HashMap<>();

        for (int num : arr1) {
            if (occurrenceMap.containsKey(num)) {
                occurrenceMap.put(num, occurrenceMap.get(num) + 1);
            } else {
                occurrenceMap.put(num, 1);
            }
        }

        for (int num : occurrenceMap.keySet()) {
            System.out.println("Occurrence of element " + num + ": " + occurrenceMap.get(num));
        }
    }
}
