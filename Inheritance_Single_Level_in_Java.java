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

public class Inheritance_Single_Level_in_Java {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area();
        t1.area(6, 2);
    }
}
