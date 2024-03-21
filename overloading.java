public class overloading {
 public static int sum(int a,int b){
    return a+b;
 }
 public static int sum(int a,int b,int c){
    return a+b+c;//same function name but different parameter
 }

public static String sum(String a,String b){
    return a+b;

}


    public static void main(String[] args) {
        System.out.println(sum(4,89));//we have to declared sum as static because main is static
        System.out.println(sum(4,89,45));
        System.out.println(sum("aj"," pragya")); 
    }
}
