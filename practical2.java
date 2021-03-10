public class practical2 {
    int sum = 0;
    public int sumFunction(int a, int b)
    {
        sum= a+b;
        return sum;
    }
}

class Addition{
    public static void main(String[] args) {
        practical2 add = new practical2();
        int s = add.sumFunction(1, 2);
        System.out.println("Sum of values a and b:"+ s); 
    }
}
