package test_nov27_2023;
//Write a method to find Max  and min value in an Array {7,4,51,45,3,67,89,93,43}
public class Array {
    public int max(int [] array) {
        int max = 0;

        for(int i=0; i<array.length; i++ ) {
            if(array[i]>max) {
                max = array[i];
            }
        }
        return max;
    }
    public int min(int [] array) {
        int min = array[0];

        for(int i=0; i<array.length; i++ ) {
            if(array[i]<min) {
                min = array[i];
            }
        }
        return min;
    }
    public static void main(String args[]) {
        int[] Array = {7,4,51,45,3,67,89,93,43};
        Array m = new Array();
        System.out.println("Maximum value in the array is::"+m.max(Array));
        System.out.println("Minimum value in the array is::"+m.min(Array));
    }
}


