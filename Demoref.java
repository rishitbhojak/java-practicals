class callbyref{
    int num1 = 20;
    int num2 = 20;
    void chData(callbyref obj, int n1, int n2)
    {
        obj.num1+=n1;
        obj.num2+=n2;
    }
}
public class Demoref{
    public static void main(String[] args) {
        callbyref callobj = new callbyref();
        System.out.println(callobj.num1);
        System.out.println(callobj.num2);
        callobj.chData(callobj, 20, 20);
        System.out.println("After chdata()....");
        System.out.println(callobj.num1);
        System.out.println(callobj.num2);
    }
}