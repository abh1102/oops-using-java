abstract class car {
    abstract public void fueltype();

    public void color() {
        System.out.println("black");
    }
}

class tata extends car {
    public void fueltype() {
        System.out.println("Petrol");
    }
}

public class abstraction {
    public static void main(String[] args) {
        tata nexon = new tata();
        nexon.fueltype();
        nexon.color();
    }
}
