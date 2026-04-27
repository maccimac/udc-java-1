package lesson6Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class IteratorAndCollectionsExercise {
    static void main(){
        exerciseIterator();
        exerciseCollections();

    }

    static void exerciseIterator(){
        System.out.println("Iterator Exercise");
        List<String> names = new ArrayList<>();

        names.add("John");
        names.add("Jane");
        names.add("Bob");

        Iterator<String> iterator = names.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        };
    }

    static void exerciseCollections(){
        System.out.println("Collections Exercise");
        List<String> items = new LinkedList<String>();
        items.add("item1");
        items.add("item2");
        items.add("item3");

        for(String item : items){
            System.out.println(item);
        }
    }

}
