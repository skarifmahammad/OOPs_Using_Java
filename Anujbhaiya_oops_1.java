public class Anujbhaiya_oops_1 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Arif";
        p1.age = 25;

        Person p2 = new Person();
        p2.name = "Sunny";
        p2.age = 19;
        System.out.println(p1.name + " " + p2.age);
        System.out.println(p2.name + " " + p1.age);
    }
}

class Person {
    String name;
    int age;
}
