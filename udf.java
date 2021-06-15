import java.util.Scanner;

public class udf {
    static void func(int salary) {
        if (salary < 10000) {
            throw new ArithmeticException("You are poor");

        } else {
            System.out.println("you are maybe idk");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary :");
        int sal = sc.nextInt();
        func(sal);
        sc.close();
    }
}