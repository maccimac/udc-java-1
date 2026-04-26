package lesson6Generics;

import java.util.ArrayList;



public class GenericsExercise {

    public void main(String[] args) {
        ArrayList variables = new ArrayList();


        variables.add(1);
        variables.add("Hello");
        variables.add(true);
        variables.add(1.23);
        Character character = 'a';
        variables.add(character);
        System.out.println(variables);

        for (Object item : variables) {
            displayClassName(item);
        };
    }

    public <MyType> void  displayClassName (MyType item){
        System.out.println(item.getClass().getName());
    }



}
