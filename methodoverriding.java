class p
{
    void funccall()
    {
        System.out.println("Call from a");
    }
}
class q extends p
{
    void funccall()
    {
        System.out.println("call from q");
    }
}
class r extends p
{
    void funccall()
    {
        System.out.println("call from r");
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
