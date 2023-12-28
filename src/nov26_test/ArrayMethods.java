package nov26_test;

public class ArrayMethods {

    //Write a method to find Maximum  and minimum value in an Array {7,4,51,45,3,67,89,93,43}
    public int maximum(int[] array) {
        int maximum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maximum) {
                maximum = array[i];
            }
        } return maximum;
    }
    public int minimum(int[] array) {
        int minimum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
            }
        } return minimum;
    }
    public static void main (String[]args){
        int[] array = {2, 1, 51, 45, 3, 67, 89, 93, 43};
        ArrayMethods obj = new ArrayMethods();
        System.out.println("This is the maximum value: "+obj.maximum(array));
        System.out.println("This is the minimum value: "+obj.minimum(array));

    }
}

