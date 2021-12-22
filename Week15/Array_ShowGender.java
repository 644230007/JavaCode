package Week15;

public class Array_ShowGender {
    public static void main(String[] args) {

        String[] name = { "นาย ก", "นาง ข", "นาย ค", "นาง ง", "นาย จ" };
        System.out.println("มีรายชื่อทั้งหมด " + name.length + " ชื่อ ประกอบด้วย");

        for (int i = 0; i < name.length; i++) {
            boolean check = name[i].startsWith("นาย");
            if (check) {
                System.out.print(name[i] + " ==> ");
                System.out.println("เพศชาย");
            } else {
                System.out.print(name[i] + " ==> ");
                System.out.println("เพศหญิง");
            }

        }
    }
}
