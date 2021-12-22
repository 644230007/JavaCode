package Week17;

//มีการรับค่าเข้า  แต่ไม่มีการส่งค่าออก
public class Method_ex03 {
    public static void main(String[] args) {
        int  phone = getPhoneNumber();
        System.out.println(getPhoneNumber());
        
        int lucky = 999;
        int newphone = phone+lucky;
        System.out.println(newphone);
     }
 
     static int getPhoneNumber(){
         return 982466872;
     }
}