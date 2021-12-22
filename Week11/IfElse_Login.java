package Week11;

import java.util.Scanner;

public class IfElse_Login {
    public static void main(String[] args) {
        
        String username_db = "root";
        String password_db = "5555";

        Scanner kb = new Scanner(System.in);

        System.out.print("Enter Username : ");
        String username = kb.nextLine();

        System.out.print("Enter Password : ");
        String password = kb.nextLine();
        
        if (username.equals(username_db) && password.equals(password_db) ) {
            System.out.println("Login complete");
        } else {
            System.out.println("Login not complete");
        }
        kb.close();
    }
}
