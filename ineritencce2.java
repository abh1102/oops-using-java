class vehicle {
    int price;
    int milege;
    String color;

    void display() {
        System.out.println("price" + this.price);
        System.out.println("milege" + this.milege);
        System.out.println("color" + this.color);
    }
}

class car extends vehicle {
    String fueltype;
    boolean sunroof;

}

public class ineritencce2 {
    public static void main(String[] args) {
        car car1 = new car();
        car1.color = "blue";
        car1.fueltype = "diesel";
        car1.milege = 54;

        car1.price = 100000;
        car1.display();

    }

}
