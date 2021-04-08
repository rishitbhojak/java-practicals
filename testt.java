

public class testt {
    int a;
    testt(int i)
    {
        a=i;
    }
    testt incrbyten()
    {
        testt temp = new testt(a+10);
        return temp;
    }
}
class Mainn
{
    public static void main(String args[])
    {
        testt ob1 = new testt(2);
        testt ob2;
        ob2 = ob1.incrbyten();
        System.out.println("Value of ob1.a is " + ob1.a);
        System.out.println("Value of ob2.a is " + ob2.a);
        ob2 = ob2.incrbyten();
        System.out.println("Value of ob2.a aftert increment is " + ob2.a);
    }
}