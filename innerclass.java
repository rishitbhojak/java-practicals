class outer
{
    int outer=10;
    void test()
    {
        System.out.println("Value of Outer class value is: "+outer);
    }
    class Inner
    {
        int inner = 30;
        void display()
        {
            System.out.println("Value of inner class value is: "+inner);
        }
    }
}
public class innerclass 
{
   public static void main(String[] args) 
   {
       outer o = new outer();
       outer.Inner i = o.new Inner();
       o.test();
       i.display();
   } 
}
