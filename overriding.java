class bank {
    public void rateofinterest() {
        System.out.println("general rate of interest of bank is 7%");

    }

}

class sbi extends bank {
    public void rateofinterest() {
        System.out.println("rate of interset for sbi is 6%");

    }
}

class pnb extends bank {
    public void rateofinterest() {
        System.out.println("rate of interext for pnb iss 5%");
    }
}

public class overriding {
    public static void main(String[] args) {
        sbi obj = new sbi();
        pnb obj1 = new pnb();
        bank obj2 = new bank();
        obj1.rateofinterest();
        obj2.rateofinterest();
        obj.rateofinterest();
    }
}
