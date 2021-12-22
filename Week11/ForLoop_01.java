package Week11;

public class ForLoop_01 {
    public static void main(String[] args) {

        // int count = 1;
        // while (count <=10 ) {
        // System.out.println("Round " +count+ " Hello"); //ค่าที่แสดง
        // count++;

        // for (int count = 1; count <= 100; count++) {
        // System.out.println("Round " +count+ " java");

        // int number = 1;
        // int sum = 0;
        // while (number <= 10) {
        // sum = sum + number;
        // System.out.println("รอบที่ " + number + " ผลบวกเท่ากับ " + sum);
        // number++;
        // System.out.println("รวมเท่ากับ " + sum);

        int sum = 0;
        for (int number = 1; number <= 10; number++) {
            sum = sum +number;
            System.out.println("Round " + number + " เท่ากับ "+sum);
        }
        System.out.println("รวมเท่ากับ "+sum);

    }
}
