class student {
    int age;
    int roll_no;
    String name;

    student(int age, int roll_no) {// creating a constructor
        this.age = age;
        this.roll_no = roll_no;
        System.out.println("paremeterized constructor");

    }

    student(int age, String name, int roll_no) {
        this.age = age;
        this.roll_no = roll_no;
        this.name = name;
        System.out.println("paremeterized constructor2");

    }

    student() {
        System.out.println("default constructor");

    }
}

public class constructor {
    public static void main(String[] args) {
        // calling paremeterized constructor
        student s1 = new student(11, 4);
        student s2 = new student();// calling default constructor
        student s3 = new student(11, "abhi", 4);
    }
}