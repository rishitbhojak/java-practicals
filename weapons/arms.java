package weapons;

public class arms implements ammo {
    public void sniper() {
     System.out.println("Magnum Sniper");
    }
    public void rifle() {
     System.out.println("Sub Machinegun");
    }
    public int noOfBullets() {
     return 0;
    }
    public static void main(String args[]) {
     arms m = new arms();
     m.sniper();
     m.rifle();
    }
   }
