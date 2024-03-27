class student {
    private String name;
    private int age;
    private int roll_no;

    public String getName() {
        return name;
    }

    public int getroll_no() {
        return roll_no;

    }

    public int getage() {
        return age;
    }

    public void setName(String name) {
        this.name = name;

    }

    public void setage(int age) {
        this.age = age;

    }

    public void setroll_no(int roll_no) {
        this.roll_no = roll_no;
    }
}

public class encapsulation {
    public static void main(String[] args) {

        student obj = new student();
        obj.setName("abhishek");
        obj.setage(21);
        obj.setroll_no(88);
        System.out.println(obj.getName());
        System.out.println(obj.getage());
        System.out.println(obj.getroll_no());

    }
}
