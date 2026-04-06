package lesson3Polymorphisme;

public class Car extends Vehicle{

    public Car(){
        super("Car start", "Car stop", "Car direction");
    }

    @Override
    public void speed(){
        System.out.println(
                "Speed is 25"
        );
    }

}
