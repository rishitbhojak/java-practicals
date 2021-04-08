import java.util.Scanner;
class area
{
int radius;

double area(int radius)
{
return 3.14*radius*radius;
}
}

class Main
{
public static void main (String[] args)
{
area area1=new area();



System.out.println("Enter radius of the Circle: ");

Scanner sc=new Scanner(System.in);
area1.radius=sc.nextInt();
System.out.println(area1.area(area1.radius));
sc.close();
}
}