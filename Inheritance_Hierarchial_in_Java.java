class Shape {
    public void area() {
        System.out.print("Display area : ");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println((l * h) / 2);
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println(3.14 * r * r);
    }
}

public class Inheritance_Hierarchial_in_Java {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area();
        t1.area(3, 7);

        Circle cr1 = new Circle();
        cr1.area();
        cr1.area(2);
    }
}
