interface i1 {
    void class1();

    void class2();
}

abstract class ac1 implements i1 {
    public void class1() {
        System.out.println("Class 1 function invoked");
    }
}

class l1 extends ac1 {
    public void class2() {
        System.out.println("Class 2 function invoked");
    }
}

class partialimplementation {
    public static void main(String[] args) {
        l1 ob = new l1();
        ob.class1();
        ob.class2();
    }
}