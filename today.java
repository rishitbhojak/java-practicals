class tets{
    int a;
    public int b;
    private int c;
    void setc(int i)
    {
c=1;
    }
    int getc(){
return c;
    }
}
class Today{
    public static void main(String[] args) {
        tets t1= new tets();
        t1.a=10;
        t1.b=20;
        t1.c=30;
        System.out.println("Value of a,b,c is " + t1.a + t1.b+t1.c);
    }
}