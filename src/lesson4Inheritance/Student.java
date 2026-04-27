package lesson4Inheritance;

/**
 * Create a new class Student in the inheritanceExample package
 * Add extends Person to the Student class
 * Add the following String variable: studentId
 * Create a constructor that sets the variables and the super class variables
 * Create getter functions for the variables
 * Create the setter functions for the variables
 * Override the toString function
 * Change the return type of the toString function to
 * return super.toString() + " student ID " + studentId;
 */
public class Student extends Person{


    private int studentID;

    public Student(String firstName, String lastName, int studentID){
        super(firstName, lastName);
        this.studentID = studentID;
    }

    public String toString(){
        return super.toString() + "; Student id id " + studentID;
    }

    public static void main() {
        Student st1 = new Student("Joshua", "Bondoc", 123);
        System.out.println(st1.toString());
    }
}
