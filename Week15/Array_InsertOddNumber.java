package Week15;

public class Array_InsertOddNumber {
    public static void main(String[] args) {
        int n[] = new int[10];

        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " "); // แสดงผลอาเรย์ก่อนเพิ่มข้อมูล
        }

        // เริ่มเพิ่มข้อมูลเข้าไปในอาเรย์ทั้ง 10 ช่อง
        int number = 1;
        for (int i = 0; i < n.length; i++) {
            n[i] = number;
            number = number + 2;
        }
        System.out.println();
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " "); // แสดงผลอาเรย์หลังเพิ่มข้อมูล
        }

    }
}