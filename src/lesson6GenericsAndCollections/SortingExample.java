package lesson6GenericsAndCollections;

import java.util.ArrayList;
import java.util.Collections;


public class SortingExample {

    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Bob");

        for(String name : names){
            System.out.println(name);
        }
        Collections.sort(names);

        for(String name : names){
            System.out.println(name);
        }
    }


}


