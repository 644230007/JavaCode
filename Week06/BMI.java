package Week06;
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        
        System.out.print("weight(kg): ");
        float weight = kb.nextFloat();

        System.out.print("high(cm): ");
        float high = kb.nextFloat();

        high/= 100;
        float bmi = weight/(high*high);
        
        System.out.println("BMI : "+bmi);
        
        kb.close();
    }
}
