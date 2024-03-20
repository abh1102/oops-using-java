
class Animal {
    void eat() {
        System.out.println("animal eating");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("dog eating");

    }

    void bark() {
        System.out.println("dog barking");

    }

    void work() {

        super.eat();
        bark();
    }

}

public class superwithfunction {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.work();
    }
}
