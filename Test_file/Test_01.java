package Test_file;

import java.util.Scanner;

public class Test_01 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int[] number = new int[2];
        // System.out.println(number.length);

        for (int i = 0; i < number.length; i++) {
            System.out.print("enter number : ");
            number[i] = kb.nextInt();
        }
        int sum = 0;
        System.out.print("{");
        for (int i : number) {
            System.out.print(i + ",");
            sum = sum + i;
        }
        System.out.println("}");
        System.out.println(sum);

        kb.close();
    }
}
