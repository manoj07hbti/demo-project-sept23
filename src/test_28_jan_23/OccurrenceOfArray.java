package test_28_jan_23;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceOfArray {
    static void Freq(int arr[], int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else
            {
                map.put(arr[i], 1);
            }
        }
        System.out.println(map);
    }
    public static void main(String args[]) {
        int arr[] = {1,2,3,1,4,5,2,3,2,5,5,2,7,8};
        int n = arr.length;
        Freq(arr, n);
    }
}
