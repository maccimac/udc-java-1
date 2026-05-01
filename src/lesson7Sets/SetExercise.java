package lesson7Sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class SetExercise {

    public static void main(String[] args) {
        List<String> numbers = new ArrayList<String>();
        numbers.add("1");
        numbers.add("1");
        numbers.add("2");
        numbers.add("30.4");
        numbers.add("-90");
        numbers.add("-30.4");
        numbers.add("30.4");

        Set<String> setUniqueNums = new HashSet<String>(numbers);
        for(String str : setUniqueNums){
            System.out.println(str);
        }
    }

}
