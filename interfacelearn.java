import java.util.*;

//creating interface of vehicle

interface vehicle {
    public void color();
}

// creating class using interface
class electriccar implements vehicle {
    // implementing the method of vehicle class
    public void color() {
        System.out.println("Color of car is black");

    }
}

// creating second class
class diselcar implements vehicle {
    public void color() {
        System.out.println("color of car is white");
    }
}

public class interfacelearn {
    public static void main(String[] args) {
        // We can't create object using interface
        vehicle tesla = new electriccar();
        vehicle scorpio = new diselcar();// vehicle=class,scorpio=object,new=mwmory allocation,diselcar()=class
        tesla.color();
        scorpio.color();
    }

}
