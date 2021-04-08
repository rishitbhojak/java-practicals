class lang
{
    String lang = "Javascript";
}
class prog extends lang
{
    String lang ="Typescript";
    void display()
    {
        System.out.println("The name of child class' lang is:"+ lang);
        System.out.println("The name of parent class' lang is:"+ super.lang);
    }
}
 
public class superkeyword
{
    public static void main(String[] args)
    {
        prog d = new prog();
        d.display();
    }
}
