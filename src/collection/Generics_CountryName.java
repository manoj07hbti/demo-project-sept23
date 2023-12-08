package collection;

import java.util.ArrayList;

public class Generics_CountryName {

    public ArrayList<String> createStringList() {

        ArrayList<String> countryName = new ArrayList<>();
        countryName.add("India");
        countryName.add("China");
        countryName.add("Russia");
        countryName.add("America");
        countryName.add("Japan");

        for (int i = 0; i < countryName.size(); i++) {
            System.out.println("Printing Country Name using For loop: " + countryName.get(i));
        }
        int j=0;
        while(j<countryName.size()){
            System.out.println("Printing country name using while loop:"+countryName.get(j));
            j++;
        }

        int k=0;
        do{
            System.out.println("Printing country name using do while loop:"+countryName.get(k));
            k++;
        } while(j<countryName.size());

        for(String var :countryName){
            System.out.println("Printing country name using Advance For loop: "+var);
        }
        return countryName;
    }

    public static void main(String[] args) {

        Generics_CountryName obj = new Generics_CountryName();
       ArrayList<String> output= obj.createStringList();
        System.out.println("Printing Country Name: "+output);

}

}