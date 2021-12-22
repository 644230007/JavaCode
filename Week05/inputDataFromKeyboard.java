package Week05;
import java.util.Scanner;
public class inputDataFromKeyboard {
    public static void main(String[] args) {
        //nextByte 
        //nextShort 
        //nextInt 
        //nextLong 
        //nextFloat 
        //nextDouble
        Scanner kb = new Scanner(System.in);
        
        System.out.println("============================");
        System.out.print("Your ID : ");
        String id =  kb.nextLine();
        
        System.out.println("===============================");
        System.out.print("Name/surname : ");
        String name = kb.nextLine();

        System.out.println("===============================");
        System.out.print("Your GPA : ");
        Float gpa = kb.nextFloat();

        System.out.println("===============================");
        System.out.print("Birth year : ");
        int year = kb.nextInt();

        int age = 2564-year;//ส่วนของการคำนวน
        
        System.out.println("===============================");
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("GPA : "+gpa);
        System.out.println("===============================");

        kb.close();
        
    }
}
