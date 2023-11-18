package function_method;

public class Engineer {
    public void construction(){
        System.out.println("construction method of engineer");
    } public void design(){
        System.out.println("design method of engineer");
    }
    public void inspection(){
        System.out.println("inspection method of engineer");
    }

    public static void main(String[] args) {
        Engineer objengineer=new Engineer();
        objengineer.construction();
        objengineer.design();
        objengineer.inspection();
    }
}
