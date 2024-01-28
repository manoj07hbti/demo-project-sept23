package test_28_jan_23;

public class PalindromeReverseString {
    public void revStr(String str) {
        String reverseStr = " ";
        int strLength = str.length();
        for (int i = (strLength - 1); i >= 0; --i) {
            reverseStr = reverseStr + str.charAt(i);
            if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
                System.out.println(str + " is a Palindrome String.");
            } else {
                System.out.println(str + " is not a Palindrome String.");
            }
        }
    }
    public static void main(String[] args) {
        PalindromeReverseString obj=new PalindromeReverseString();
        obj.revStr("level");
    }
}
