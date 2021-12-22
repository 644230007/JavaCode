package Week13;

public class StringMethod_StartEnd {
    public static void main(String[] args) {
        String fullname = "นายสมชาย ชาตรี";

        // หาตำแหน่งของคำจากด้านหน้า .startWith()
        boolean result = fullname.startsWith("นาย");
        if (result) {
            System.out.println(fullname + " เพศชาย");
        } else {
            System.out.println(fullname + " เพศหญิง");

        }
        // หาตำแหน่งของคำจากด้านหลัง .endWith()
        String code = "356278TH";
        boolean result1 = code.endsWith("TH");
        if (result1) {
            System.out.println("สินค้า" + code + " มาจากไทย");
        } else {
            System.out.println("สินค้า" + code + " ไม่ได้มาจากไทย");
        }
    }
}
