class animal {
    String color = "Black";
}

class cow extends animal {
    String color = "white";

    public void color() {
        System.out.println(color);
        System.out.println(super.color);//calling color of parent class
    }
}

public class superwithvariable {
    public static void main(String[] args) {
        cow c1 = new cow();
        c1.color();
    }
}
