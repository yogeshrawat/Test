public class Deadlock {

    public void method1() {
        synchronized (String.class) {
            System.out.println("Aquired lock on String.class object");
            synchronized (Integer.class) {
                System.out.println("Aquired lock on Integer.class object");
            }
        }
    } /* * This method also requests same two lock but in exactly * Opposite order i.e. first Integer and then String. * This creates potential deadlock, if one thread holds String lock * and other holds Integer lock and they wait for each other, forever. */

    public void method2() {
        synchronized (Integer.class) {
            System.out.println("method 2: Aquired lock on Integer.class object ");
            synchronized (String.class) {
                System.out.println("method 2: Aquired lock on String.class object ");
            }
        }
    }

    public static void main(String[] args) {
        Deadlock deadlock = new Deadlock();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                deadlock.method1();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                deadlock.method2();
            }
        });

        t1.start();
        t2.start();
    }
}

