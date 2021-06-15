class NewmThread implements Runnable {
    Thread t;

    NewmThread(String s) {
        t = new Thread(this, s);
        System.out.println(t.getName() + " : " + t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(t.getName() + " : " + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println(t.getName() + "Interrupted...");
        }
        System.out.println("Exiting From " + t.getName() + "....");
    }

}

class multithread {
    public static void main(String[] args) {
        new NewmThread("One");
        new NewmThread("Two");
        new NewmThread("Three");
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted....");
        }
        System.out.println("Exiting From Main Thread...");
    }
}