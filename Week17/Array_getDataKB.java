package Week17;

import java.util.Scanner;

public class Array_getDataKB {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int [] number = new int [3];
        for (int i = 0; i < number.length; i++) {
            System.out.print("Enter number = ");
            number[i] =kb.nextInt();
        }
            int sum = 0;
            System.out.print("{");
        for (int j : number) {
            if(sum<=j){
                System.out.print(j+",");
            }else{
                System.out.print(j);
            }

          sum = sum + j;
        }
            System.out.println("}");
            System.out.println(sum);
        kb.close();
    }
}
