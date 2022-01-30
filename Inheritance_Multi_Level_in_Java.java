class Shape {
    public void area() {
        System.out.println("Display area : ");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println((1 / 2) * l * h);
    }
}

class EquilateralTriangle extends Triangle {
    public void area(int l, int h) {
        System.out.println((1 / 2) * l * h);
    }
}

public class Inheritance_Multi_Level_in_Java {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area();
        t1.area(6, 2);

        EquilateralTriangle eq1 = new EquilateralTriangle();
        eq1.area();
        eq1.area(3, 6);
    }
}
