package jan28_test;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayFind {

    public static void main(String[] args) {

   //     Write a code calculate occurrence of any given number in given array
    //    int arr[]={1,2,3,1,4,5,2,3,2,5,5,2,7,8};

        int arr[]={1,2,3,1,4,5,2,3,2,5,5,2,7,8};
        Arrays.sort(arr);
        for(int i =0; i< arr.length-1; i++){
            int count =1;
            for(int j=i+1; j< arr.length; j++){

                if(arr[i] == arr[j])
                    count++;
                else
                    break;
            }
            System.out.println(arr[i] + " = " + count);
            i+=(count-1);
        }
    }
}




