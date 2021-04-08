class a
{
void p1()
{
System.out.println("Message from a");
}
}
class b extends a
{
void p2()
{
System.out.println("Message from b");
}
}
class c extends b
{
void p3()
{
System.out.println("Message from c");
}
}
public class inherit
{
public static void main(String[] args)
{
c b1 = new c(); b1.p3();
b1.p1();
b1.p2();
}
}
