class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println("Your name : " + this.name);
        System.out.println("You are " + this.age + " years old.");
    }

    Student() {

    }

    Student(Student st2) { // Copy Constructer
        this.name = st2.name;
        this.age = st2.age;
    }
}

public class Copy_Constructer_in_Java {

    public static void main(String[] args) {
        Student st1 = new Student();
        st1.name = "Arif";
        st1.age = 19;

        Student st2 = new Student(st1);
        st2.printInfo();
    }
}
