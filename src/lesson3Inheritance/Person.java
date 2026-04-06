package lesson3Inheritance;

public class Person {

    String firstName;
    String lastName;

    public Person(String firstName, String lastName){
        super();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }


    @Override
    public String toString() {
//        return super.toString();
        return "Person name is " + firstName + " " + lastName;
    }
}
