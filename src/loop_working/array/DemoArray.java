package loop_working.array;

public class DemoArray {
    public static void main(String[] args) { // advance loop
        String countries[] = {"Afghanistan", "Bhutan", "Nepal", "Pakistan"};
        for (String var : countries) {
            System.out.println("printing country:" + var);
            // by for loop
        }
        String c = "Afghanistan, Russia, Arizona";
        for (int i = 1; i < 4; i++) {
            System.out.println("printing countries: " + c);
        } // by while loop
        int i = 0;
        while (i < 3) {
            System.out.println("Afghanistan, Ankara, Arizona");
            i++;

        } // by do while loop
        i = 0;
        do {
            System.out.println("Printing countries: Afghanistan, Ankara, Arizona");
            i++;
        } while (i > 4);
        // by for loop

        int distance[] = {20, 43, 76, 15, 88, 74

        };
        System.out.println(distance[3]);
        System.out.println(distance[0]);
        for (i = 0; i < distance.length; i++) {
            System.out.println(" distance:" + distance[i]);
        } // by advance loop
        for (int var : distance) {
            System.out.println("printing distance:" + var);
        } //
        double salary[]={55000,4987.0,54000,99900};
        for(i=0; i<4; i++){
            System.out.println("printing salary:"+salary[i]);
        }
        System.out.println(salary[2]);
        // by advance loop
        for(double var: salary){
            System.out.println("salary:"+var);
        }


        }


    }









