class A{
    public void print(){
        System.out.println("method of grandparent class");
    
    }
    }
    class B extends A{
        public void printb(){
            System.out.println("method of parent class");
        }
    }
    class c extends A{
        public void printc(){
            System.out.println("method of child class");
    
        }
    }
    
    
    class Main{
        public static void main(String[] args) {
            
            B obj=new B();
            obj.printb();
            A obj1=new A();
            obj1.print();
            
    
            
        }
        
    }
    