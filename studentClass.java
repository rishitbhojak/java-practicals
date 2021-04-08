public class studentClass {
    String name;
    int rollNumber;
    void addDetails(int roll, String n)
    {
        rollNumber = roll;
        name = n;
    }
    void display()
    {
        System.out.println("Roll no. : " + rollNumber + " \nName: " + name);
    }

}
class StudentInfo
{
    public static void main(String[] args) {
        studentClass s1 = new studentClass();
        s1.addDetails(163, "Rishit Bhojak");
        s1.display();
    }

}