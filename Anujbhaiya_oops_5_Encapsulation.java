public class Anujbhaiya_oops_5_Encapsulation {
    public static void main(String[] args) {
        Laptop L1 = new Laptop();
        L1.setPrice(3222);

        System.out.println(L1.getPrice());
    }

}

class Laptop {
    int ram;
    private int price;

    public void setPrice(int price) {
        boolean isAdmin = true;
        if (!isAdmin) {
            System.out.println("You can't set price.");
        } else {
            this.price = price;
        }
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }
}