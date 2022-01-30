public class Anujbhaiya_oops_6_Abstraction {
    public static void main(String[] args) {
        // Car c1 = new Car(); //It will be an error beacause Car is an Abstract Class
        // don't accessable.
        // c1.start();

        Audi ad = new Audi();
        ad.start();

        BMW bw = new BMW();
        bw.start();
    }
}

abstract class Car { // Abstract Class in Java
    int price;

    abstract void start(); // Abstract Function in Java

    // void test(){ //Not error in Abstract Calss
    // System.out.println("Error testing");
    // }
}

class Audi extends Car {
    void start() {
        System.out.println("Audi is Starting.");

    }

}

class BMW extends Car {
    void start() {
        System.out.println("BMW is Starting.");

    }

}