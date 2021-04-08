class pl
{
    final String js = "Javascript";
}
class cl extends pl
{
    void display()
    {
        System.out.println("the name of value initialized in parent class is:" + js);
    }
}
public class finalkeyword
{
    public static void main(String[] args)
    {
        cl cl1 = new cl();
        cl1.display();
    }
}
