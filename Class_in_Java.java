class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println("Your name : " + this.name);
        System.out.println("You are " + this.age + " years old.");
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Class_in_Java {

    // public static void main(String[] args) {
    // Student st1 = new Student();
    // st1.name = "Arif";
    // st1.age = 19;

    // st1.printInfo();
    // }

    public static void main(String[] args) {
        Student st1 = new Student("Sunny", 24);
        st1.printInfo();
    }
}
