package SomePackage;

public class Dog {

	// TODO create class variables
    // for dogType, dogName, dogColor, dogAge
    private String dogType;
    private String dogName;
    private String dogColor;
    private int dogAge;

    public Dog(String dogType, String dogName, String dogColor, int dogAge) {
        super();
        this.setDogName(dogName);


    }

    // TODO create accessor and mutator for each variable
    private void setDogName(String _dogName){
        dogName = _dogName;
    }
    public String getDogName(){
        return dogName;
    }

    // TODO create toString() method
    public String toString(){
        return "Dog name is: " + this.getDogName();
    }




    public static void main(String[] args) {
        // Create a Dog object
        Dog myDog = new Dog("Chihuahua", "Tiny", "Cream", 2);

        // Print the dog's attributes
        System.out.println(myDog.toString());
    }
}

