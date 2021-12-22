package Week17;

public class Method_ex04 {
    public static void main(String[] args) {
        plus(5.5,9);
        System.out.println(plus(5.5,9));
        System.out.println(plus(222.2,55));
     }
     static double plus(double a,int b){
         double c = a+b;
         return c;
     }
}