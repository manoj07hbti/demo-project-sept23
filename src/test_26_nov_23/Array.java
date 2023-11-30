package test_26_nov_23;

public class Array {
    //Write a method to find Max  and min value in an test_26_nov_23.Array {7,4,51,45,3,67,89,93,43}
    public int max(int[] array) {
        // Initialize max with the first element of the array
        int max = array[0];
        // Iterate through the array to find max values
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int min(int[] array) {
        // Initialize min with the first element of the array
        int min = array[0];
        // Iterate through the array to find min values
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = {7, 4, 51, 45, 3, 67, 89, 93, 43};
        Array obj = new Array();
        System.out.println("This is the maximum value: " + obj.max(array));
        System.out.println("This is the minimum value: " + obj.min(array));
    }
}
