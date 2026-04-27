package lesson4Polymorphisme;

public class Boat extends Vehicle{
    public Boat(){
        super(
                "Boat start",
                "Boat stop",
                "Boat direction"
        );
    }

    @Override
    public void speed(){
        System.out.println(
                "Speed is 60"
        );
    }
}

