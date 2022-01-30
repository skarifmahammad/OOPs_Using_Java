public class Anujbhaiya_oops_7_Interfaces implements Car, Person {
    public static void main(String[] args) {
        Anujbhaiya_oops_7_Interfaces aaa = new Anujbhaiya_oops_7_Interfaces();
        aaa.start();
        aaa.walk();
    }

    @Override
    public void start() {
        System.out.println("My car is starting.");
    }

    @Override
    public void walk() {
        System.out.println("I am walking.");

    }
}

interface Car {
    void start();
}

interface Person {
    void walk();

    // void test(){ // It will an error in Interface
    // System.out.println("Error testing.");
    // }
}