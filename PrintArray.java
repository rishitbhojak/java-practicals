import java.util.Scanner;
class PrintArray
{
int val[];
void arr (int i)
{
val = new int[i];
}
void printarray (int i)
{
if (i == 0)
return;
else
printarray (i - 1);
System.out.println ("array element :" + val[i - 1]);
}
}

class Maaain
{
public static void main (String[]args)
{
Scanner s = new Scanner (System.in);
System.out.println ("Enter size of an array :");
int p = s.nextInt ();
arr a1 = new arr (p);
int i;
for (i = 0; i < p; i++)

{
System.out.println ("Enter Element Of An Array :");
s = new Scanner (System.in);
a1.val[i] = s.nextInt ();
}
a1.printarray (p);
}
}