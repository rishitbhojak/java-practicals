public class recfactorial {
    public static void main(String args[])
    {
        System.out.println("Factorial of 5 is " + factorial(5) );
    }
    
    public static int factorial(int i)
    {
        if( i == 1 )    
        {
            return 1;
        }
    
        return i * factorial(i - 1); 
    } 
}
