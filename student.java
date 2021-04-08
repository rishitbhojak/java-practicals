public class student {
    int rollno;
    String name;
    static String college = "LDRO";
    student(int r, String n)
    {
        rollno = r;
        name = n;
    }
    void displaystu()
    {
        System.out.println("Student info " + rollno + name + college);
    }
}
class Stu{
    public static void main(String[] args) {
        
    }
}