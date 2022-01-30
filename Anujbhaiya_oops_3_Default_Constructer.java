public class Anujbhaiya_oops_3_Default_Constructer {
    public static void main(String[] args) {
        Person p1 = new Person(); // Defult constructor call
        p1.name = "Arif";
        p1.age = 25;

        Person p2 = new Person(); // Defult constructor call
        p2.name = "Sunny";
        p2.age = 19;

        // System.out.println(p1.name + " " + p2.age);
        // System.out.println(p2.name + " " + p1.age);
        p1.eat();
        p2.walk();
        p1.walk(34);
    }
}

class Person {
    String name;
    int age;

    public Person() {
        System.out.println("Hello.");
    }

    void walk() {
        System.out.println(name + " is walking.");
    }

    void eat() {
        System.out.println(name + " is eating.");
    }

    void walk(int steps) {
        System.out.println(name + " walked " + steps + " Steps.");
    }
}
