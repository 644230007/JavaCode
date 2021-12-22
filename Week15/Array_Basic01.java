package Week15;

public class Array_Basic01 {
    public static void main(String[] args) {
        // กำหนดสมาชิก
        int[] number = { 1, 22, 3, 44, 5, 66, 7, 88, 9 };
        int size = number.length;

        System.out.println(size);
        System.out.println(number.length);// หาความยาวของArray
        System.out.println(number[3]); // การเข้าถึงตัวแปร

        // การเปลี่ยนค่าข้อมูลตัวแปร
        number[3] = 88;
        System.out.println(number[3]);

        //กำหนดขนาด
        char [] alphabet = new char[26];
        alphabet[0] = 'a';
        alphabet[1] = 'b';
        alphabet[2] = 'c';

        System.out.println(alphabet[2]);
        System.out.println(alphabet[25]);
        System.out.println(alphabet.length);

        int []num = new int [10];
        System.out.println(num[9]);

        
        //char [] alphabet = new char[26];
        //char [] alphabet = {'a','b','b','d'};
    }
}
