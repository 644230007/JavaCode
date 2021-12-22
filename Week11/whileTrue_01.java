package Week11;

public class whileTrue_01 {
    public static void main(String[] args) {

        int count = 0;
        while (true) {
            count++;
            System.out.println("Round " + count + " Hello"); // ค่าที่แสดง
            if (count == 1000) {
                break;
            }
        }
    }
}
