package Week17;

//มีการรับค่าเข้า  แต่ไม่มีการส่งค่าออก
public class Method_ex02 {
    public static void main(String[] args) {
        display("ดีใจจัง เรียนใกล้จบแล้ว");
        plus(54,24);
        display("ไปตลาดให้หน่อยลูก");
        fullname("Suda", "Mani");
    }
    
    static void display(String x) {
        System.out.println(x);
    }
    static void plus(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("ผลลัพธ์การบวก เท่ากับ "+result);
    }
    static void fullname(String fname, String lname) {
        System.out.println(fname + " " + lname);
    }


}