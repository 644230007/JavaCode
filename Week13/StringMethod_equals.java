package Week13;

public class StringMethod_equals {
    public static void main(String[] args) {
        String lastname1 = "Kamsakorn";
        String lastname2 = "kamsakorn";

        //เปรียบเทียบเท่ากัน .equals()
        boolean result = lastname1.equals(lastname2);
        System.out.println(result);

        //ไม่สนใจตัวอักษรเล็กใหญ่
        boolean result2 = lastname1.equalsIgnoreCase(lastname2);
        if (result2) {
            System.out.println(lastname1 + " เท่ากับ " + lastname2);
        } else {
            System.out.println(lastname1 + " ไม่เท่ากับ " + lastname2);
        }
    }
}
