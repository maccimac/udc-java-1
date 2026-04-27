package lesson4Polymorphisme;

public class VehicleTester {

    public void main(){
        Vehicle[] vArr = {
                new Car(),
                new Boat(),
                new Car()
        };

        for(int i = 0; i < vArr.length; i++){
            vArr[i].speed();
        }
    }
}
