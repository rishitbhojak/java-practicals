//recursion practical
public class factorial {
    int fact(int n)
    {
        int result;
        if(n==1)
        
            return 1;
            result=fact(n-1)*n;
            return result;

        
    }
}
class Maain{
    public static void main(String[] args) {
        factorial f = new factorial();
        System.out.println("The factorial of given no. is " + f.fact(5) );
    }
}
