package Week12;

public class Ex_WhileLoop01 {
    public static void main(String[] args) {
        int j = 1;
        while (j <= 10) {
            j += 3;
            System.out.print(j + " ");
        }
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            // (int i = 1; i <= 10; i=i+2)
            // (int i = 1; i <= 10; i+=2)
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}
