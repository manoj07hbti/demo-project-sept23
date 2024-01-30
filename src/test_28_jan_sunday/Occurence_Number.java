package test_28_jan_sunday;

import sun.font.DelegatingShape;

import java.util.HashMap;

public class Occurence_Number {

    public void occurenceNo(int array[], int n) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(array[i])) {

                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }

        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        Occurence_Number obj=new Occurence_Number();
        int array[] = {1, 2, 3, 1, 4, 5, 2, 3, 2, 5, 5, 2, 7, 8};
        int n = array.length;
        obj.occurenceNo(array,n);


    }
}