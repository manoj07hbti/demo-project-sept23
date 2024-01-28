package test_28_jan_23;

public class ReverseString {
    public String rev(String str) {
        char[] ch = str.toCharArray();
        String rev = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            rev = rev + ch[i];
        }
        return rev;
    }

        public static void main(String[] args) {
        ReverseString obj = new ReverseString();
        System.out.println(obj.rev("Hello"));
    }
}

