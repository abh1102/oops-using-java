class A {
    void methodA() {
        System.out.println("method of class A");
    }

}

class B extends A {
    void methodb() {
        System.out.println("method of class b");
    }
}

class c extends B {
    void methodc() {
        System.out.println("method of class c");
    }
}

public class multileevelinheritence {
    public static void main(String[] args) {
        c obj = new c();
        obj.methodA();
        obj.methodb();
        obj.methodc();
    }
}
