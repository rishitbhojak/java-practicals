class NewThread extends Thread {
    Thread t;

    NewThread() {
        t = new Thread(this, "Demo Thread");
        System.out.println("Child Thread : " + t);
        t.start();
    }

    public void run() {
        try {
            for (int n = 5; n > 0; n--) {
                System.out.println("Child Thread : " + n);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Exiting from Child Thread ...");
    }
}

class Thread1 {
    public static void main(String[] args) {
        new NewThread();
        try {
            for (int n = 5; n > 0; n--) {
                System.out.println("Main Thread : " + n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Exiting From Main Thread ....");
    }
}