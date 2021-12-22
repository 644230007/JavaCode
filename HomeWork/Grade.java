package HomeWork;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("enter Score : ");
        int score = kb.nextInt();
        String result = "";
        if (score > 100) {
            result = "ไม่ตรงตามเงื่อนไข";
        }else if ((score >= 80) && (score <= 100)) {
            result = "A";
        } else if ((score >= 70) && (score <= 79)) {
            result = "B";
        } else if ((score >= 60) && (score <= 69)) {
            result = "C";
        } else if ((score >= 50) && (score <= 59)) {
            result = "D";
        } else if ((score >= 0) && (score <= 49)) {
            result = "E";
        } else  {
            result = "ไม่ตรงตามเงื่อนไข";
        }
        System.out.println("Grade = " + result);
        System.out.println("End of Program");
        kb.close();
    }

}