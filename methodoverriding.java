class p
{
    void funccall()
    {
        System.out.println("Call by a");
    }
}
class q extends p
{
    void funccall()
    {
        System.out.println("Call by q");
    }
}
class r extends p
{
    void funccall()
    {
        System.out.println("Call by r");
    }
}
public class methodoverriding
{
    public static void main(String[] args) 
    {
        p p1 = new p();
        q q1 = new q();
        r r1 = new r();
        p r;
        r=p1;
        r.funccall();
        r=q1;
        r.funccall();
        r=r1;
        r.funccall();
    }
}
