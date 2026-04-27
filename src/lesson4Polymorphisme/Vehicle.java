package lesson4Polymorphisme;

/**
 * Create a new package under the src folder named polymorphismExample.
 * Create a new class called Vehicle in the polymorphismExample package.
 * Add the following variables: protected String start;, protected String stop;, protected String speed;, protected String direction;
 * Add a constructor that sets the variables.
 * Add the following methods
 * public void start() { System.out.println(start); }, public void stop() { System.out.println(stop); }, public void speed() { System.out.println(speed); }, public void direction() {System.out.println(direction); }
 */

public abstract class Vehicle {
    protected String start;
    protected String stop;
    protected String direction;

    public Vehicle(){
        super();
    }
    public Vehicle(String start, String stop, String direction){
        this.start = start;
        this.stop = stop;
        this.direction = direction;
    }


    public void start(){
        System.out.println(start);
    }

    public void stop(){
        System.out.println(stop);
    }

    public void direction(){
        System.out.println(direction);
    }

    public abstract void speed();

}
