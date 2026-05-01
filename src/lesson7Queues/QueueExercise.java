package lesson7Queues;

import java.util.LinkedList;
import java.util.Queue;


public class QueueExercise {

    public static void main(String[] args){
        Queue<String> myQueue = new LinkedList<>();
        myQueue.add("Fr");
        myQueue.add("Pr");
        myQueue.add("Un poste bien payé");
        myQueue.add("Un appartement");

        while(!myQueue.isEmpty()){
            System.out.println(myQueue.poll());
        }


        String a = "Hello";
        String b = "Hello";

        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}
