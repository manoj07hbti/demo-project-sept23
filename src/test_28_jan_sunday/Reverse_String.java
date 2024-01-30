package test_28_jan_sunday;

public class Reverse_String {

    public void reverseString(String message){

        StringBuffer sbfr=new StringBuffer(message); // Conversion from String object to StringBuffer

        sbfr.reverse(); // To reverse the string
        System.out.println("Reverse String: "+sbfr);
    }

    public static void main(String[] args) {
        Reverse_String obj  =new Reverse_String();
        obj.reverseString("I Love My Country");
    }
}
