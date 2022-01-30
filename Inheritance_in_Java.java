class Shape {
    String colour;

    public void Colour() {
        System.out.println("Colour : ");
    }
}

class Triangle extends Shape { // 'extends' -> used for access permition.
    // colour automatically access from perent class
}

class Rectangle extends Shape {
    // colour automatically access from perent class
}

public class Inheritance_in_Java {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.colour = "red";

        Rectangle r1 = new Rectangle();
        r1.colour = "blue";
    }
}
