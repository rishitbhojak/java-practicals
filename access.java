class acccontrol
{
    int a;
    public int b;
    private int c;
    void abc(int i)
    {
       c=i;
    }
    int abc1()
    {
        return c;
    }
}
public class access
{
  public static void main(String[] args) 
  {
      acccontrol t1 = new acccontrol();
      t1.a=10;
      t1.b=20;
      t1.abc(30);
      System.out.println("the value of a , b and c is:"+t1.a+" "+t1.b+" "+t1.abc1());
  }  
}
 
