package collection;

public class ArrayList {

       // write a method to create Arraylist;

       public void createArrayList(){

       java.util.ArrayList list= new java.util.ArrayList();

       // adding data to ArrayList obj.add(data);

       list.add("Japan");           // Index 0;
       list.add("Italy");           // Index 1;
       list.add("Greece");          // Index 2;
       list.add("Ireland");         // Index 3;
       list.add("New Zealand");     // Index 4;
       list.add("Spain");           // Index 5;
       list.add("Portugal");        // Index 6;
       list.add("Israel");          // Index 7;
       list.add("Norway");          // Index 8;
       list.add("Switzerland");     // Index 9;
       list.add("Turkey");          // Index 10;
       list.add(1);                 // Index 11;
       list.add(2);                 // Index 12;
       list.add(3);                 // Index 13;
       list.add(4);                 // Index 14;
       list.add(5);                 // Index 15;
       list.add(6);                 // Index 16;
       list.add(7);                 // Index 17;
       list.add(8);                 // Index 18;
       list.add(9);                 // Index 19;
       list.add(10);                // Index 20;
       list.add(11) ;               // Index 21;

           System.out.println("Printing list: "+list);

           //READING data from list  obj.get(INDEX);

           System.out.println("Printing 3rd index data: "+list.get(3));

           // for loop;

           for(int i=0; i<list.size(); i++){

               System.out.println("Printing list data using for loop: "+list.get(i) +" Index: "+i);
           }
           // while loop;

           int a=0;
           while(a< list.size()){

               System.out.println("Printing list data using while loop: "+list.get(a));
               a++;
           }
           // advance for loop;

           for(Object var: list){

               System.out.println("Printing list data using advance for loop: "+var);
           }
           // do while loop;

           int b=0;
           do{
               System.out.println("Printing list data using do while loop: "+list.get(b));
               b++;
           }while(b< list.size());


       }

    public static void main(String[] args) {

           ArrayList obj=new ArrayList();
           obj.createArrayList();
    }

}
