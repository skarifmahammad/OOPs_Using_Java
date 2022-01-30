abstract class Animal {
    abstract void walk();

    public void eat() {
        System.out.println("Animal eats.");
    }
}

class Horse extends Animal {
    public void walk() {
        System.out.println("Horse walk on 4 legs.");
    }
}

class Hen extends Animal {
    public void walk() {
        System.out.println("Hen walk on 2 legs.");
    }
}

public class Abstract_Class_in_Java {
    public static void main(String[] args) {
        Horse hs = new Horse();
        hs.walk();
        hs.eat();

        Hen hn = new Hen();
        hn.walk();
        hn.eat();

        // Animal an = new Animal(); // Cannot instantiate the type Animal
        // beacause it's a 'abstract' class. // Runtime Error
        // an.walk();
    }
}
