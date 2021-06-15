import java.io.Console;

class Readstring {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.println();
        System.out.println("Enter your college name :");
        String s = c.readLine();
        System.out.println("Welcome to " + s);
    }
}