package lesson7Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class MapExercise {

    public static void main(String[] args) {
        Map<String, Person> firstMap = new HashMap<>();

        Person josh = new Person("Josh", "");
        String joshEmail = "jkr@ea.com";
        josh.setEmail(joshEmail);


        String macciEmail = "macci@webcrafterinc.ca";
        Person macci = new Person("Macci", macciEmail);


        ArrayList<Person> personArray = new ArrayList<Person>();
        personArray.add(josh);
        personArray.add(macci);

        for(Person p : personArray){
            System.out.println(p.toString());
            firstMap.put(p.getEmail(), p );
        }

        Person joshRetrieved = firstMap.get(joshEmail);
        System.out.println(joshRetrieved.getName());



    }
}
