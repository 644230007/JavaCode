package Week12;

public class nestedLoop01 {
    public static void main(String[] args) {
        //int n = 2;
        for (int i = 2; i <= 12; i++) { // แม่สูตร 
            for (int j = 1; j <= 12; j++) { //จำนวนครั้ง
                System.out.println(i+"x"+j+"="+(i*j));
            }
        }
    }
}
