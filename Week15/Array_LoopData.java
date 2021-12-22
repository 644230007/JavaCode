package Week15;

public class Array_LoopData {
    public static void main(String[] args) {
        String [] car = {"BMW","FORD","TOYOTA","TESLA"};
        
            for (int i = 0; i < car.length; i++) {
                System.out.println("สมาชิกตำแหน่งที่ "+ i + " มีค่าเท่ากับ "+ car[i]);
            }

            for (int i = 0; i < car.length; i++) {
                System.out.println("สมาชิกลำดับที่ "+ (i+1) + " มีค่าเท่ากับ "+ car[i]);
            }
            //System.out.println(car[0]);
            //System.out.println(car[1]);
            //System.out.println(car[2]);
            //System.out.println(car[3]);
    }
}
