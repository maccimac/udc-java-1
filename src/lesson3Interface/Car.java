package lesson3Interface;

public class Car implements Vehicle {

    protected String color;
    protected String type;
    protected String speed;

    public Car(){
        color = "Car color";
        type = "Car type";
        speed = "Car speed 50";

    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getSpeed() {
        return speed;
    }

    @Override
    public String getType() {
        return type;
    }
}
