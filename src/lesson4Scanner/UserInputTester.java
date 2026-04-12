package lesson4Scanner;
import java.util.Scanner;

public class UserInputTester {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      try{
        System.out.println("Enter string:");
        String input = scanner.nextLine();
        System.out.println("You entered: " + input);
      }catch(Exception e){
        e.getLocalizedMessage();
      }finally{
        scanner.close();
      }



    }
}
