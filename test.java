public class test {
    int a,b;
    test(int i, int j)
    {
        a=i;
        b=j;
    }
    void meth(test o)
    {
        o.a=o.a*2;
        o.b=o.b/2;
    }
}
class Main 
{
    public static void main(String args[])
    {
        test ob = new test (15,20);
        System.out.println("Before call the value of object is: " + ob.a + " " + ob.b);
        ob.meth(ob);
        System.out.println("After call the value of object is: " + ob.a + " " + ob.b);
        
    }
}