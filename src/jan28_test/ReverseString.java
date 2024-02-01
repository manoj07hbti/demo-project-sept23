package jan28_test;

public class ReverseString {

    //write a code to reverse a String

    public static void main(String[] args) {

        String Name = "Vishal";
        String rev = " ";

        for(int i = Name.length()-1; i>=0; i-- ){

            rev=rev+Name.charAt(i);
        }
        System.out.println(rev);
    }
}
