class Cellphone{
       public void ringing(){
           System.out.println("ringing...");
       }
       public void vibrating(){
           System.out.println("vibrating...");
       }
}


public class CellphoneDemoClass {
    public static void main(String[] args) {
        Cellphone samsung=new Cellphone();
        samsung.ringing();
        samsung.vibrating();
    }
}
