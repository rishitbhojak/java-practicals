class thisdemo {
    void first() {
        System.out.println("Good Morning");
    }

    void second() {
        System.out.println("Good Evening");

        this.first();
    }
}

class thisFuncDemo {
    public static void main(String args[]) {
        thisdemo a = new thisdemo();
        a.second();
    }
}