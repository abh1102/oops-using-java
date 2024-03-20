//creating first parent class using interface
interface a {
    public void run();
}

interface b {
    public void run();
}

class c implements a, b {
    public void run() {
        System.out.println("class c run method");
    }

}

public class multipleinheritence {
    public static void main(String[] args) {
        c obj = new c();
        obj.run();
    }
}
