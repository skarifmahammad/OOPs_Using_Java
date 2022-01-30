class Student {
    String name;
    int age;

    // This is compile time Polymorphism
    public void printInfo(String name) { // PrintInfo is function overloading
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

public class Function_Overloading_in_Java {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.name = "Arif";
        st1.age = 20;
        st1.printInfo(st1.name);
        st1.printInfo(st1.age);
        st1.printInfo(st1.name, st1.age);
    }
}
