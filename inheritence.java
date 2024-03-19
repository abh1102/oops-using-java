class parentclass {
    void display() {
        System.out.println("my name is Abhishek jha");
    }
}

class childclass extends parentclass {
    void show() {
        System.out.println("Abhishek loves perfume");
    }
}

public class inheritence {
    public static void main(String[] args) {
        childclass child1 = new childclass();
        child1.display();
        child1.show();
    }
}