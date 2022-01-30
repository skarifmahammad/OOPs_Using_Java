public class Anujbhaiya_oops_4_Default_Constructer_with_Static_Keyword {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Arif";
        p1.age = 25;

        Person p2 = new Person();
        p2.name = "Sunny";
        p2.age = 19;

        // System.out.println(p1.name + " " + p2.age);
        // System.out.println(p2.name + " " + p1.age);
        p1.eat();
        p2.walk();
        p1.walk(34);
        System.out.println(Person.count);
    }
}

class Person {
    String name;
    int age;

    static int count; // Static Keyword in java

    public Person() {
        count++;
        System.out.println("Hello");
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
