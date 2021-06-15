class threaddemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current Thread : " + t);
        t.setName("1st thread ");
        System.out.println("After manipulating : " + t);
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}