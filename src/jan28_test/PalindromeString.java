package jan28_test;

public class PalindromeString {

    public static void main(String[] args) {

        String Name = "madam";
        String rev = "";

        for(int i =Name.length()-1; i>=0; i--){

            rev=rev + Name.charAt(i);
        }
        if(Name.equals(rev)){
            System.out.println("This is Palindrome String");
        }else{
            System.out.println("Not Palindrome String");
        }
    }
}
