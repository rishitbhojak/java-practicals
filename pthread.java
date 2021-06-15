class THREADS extends Thread {
    public void run() {
        System.out.println("Thread name is :" + Thread.currentThread().getName());

        System.out.println("Thread priority is :" + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        THREADS t1 = new THREADS();
        THREADS t2 = new THREADS();
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}