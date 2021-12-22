package HomeWork;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter Factorial = ");
        int n = kb.nextInt();

        int sum = 1;
        for (int number = 1; number <= n; number++) {
            sum = sum*number;
            System.out.print(number+"x ");
        }
        System.out.println("Factorial =  " + sum);
        
        kb.close();
    }
    
}