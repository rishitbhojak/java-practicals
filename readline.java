import java.io.*;

public class readline {
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new

        InputStreamReader(System.in));

        String s1;
        System.out.println("Enter the String : ");
        do {
            s1 = b.readLine();
            System.out.println(s1);
        } while (!s1.equals("stop"));
    }
}