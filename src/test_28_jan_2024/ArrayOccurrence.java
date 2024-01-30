package test_28_jan_2024;

import java.util.Scanner;

public class ArrayOccurrence {

    public static int countOccurrences(int[] arr, int mark) {
        int count = 0;
        for (int num : arr) {
            if (num == mark) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the number to find its occurrence: ");
        int markNumber = scanner.nextInt();

        int occurrenceCount = countOccurrences(arr, markNumber);
        System.out.println("The number " + markNumber + " occurs " + occurrenceCount + " times in the array.");

        scanner.close();
    }


}
