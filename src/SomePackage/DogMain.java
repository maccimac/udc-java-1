package SomePackage;

public class DogMain {

    public static void main(String[] args) {
        Dog ginny = new Dog("Bichon",
                "Ginny",
                "#fff",
                15
                );
        System.out.println(ginny.toString());


        Dog josh = new Dog("Retrieve",
                "Kevin",
                "#000",
                99);

        Dog kevin = new Dog("Retrieve",
                "Kevin",
                "#000",
                99);

        System.out.println(josh == kevin);
        System.out.println(josh.getDogName() == kevin.getDogName());

    }
}

