package Advanced_Java_Programming_LL.Synchronized_Methods.ThreadDeadlock;

public class Kitchen {
    public static Object spoon = new Object();
    public static Object bowl = new Object();


    public static void main(String[] args) {
        Thread cook1 = new Thread(() -> {
            synchronized (spoon) {
                System.out.println("Cook1: Holding the spoon....");
                System.out.println("Cook1: Waiting for the bowl...");
                synchronized (bowl) {
                    System.out.println("Cook1: Holding the spoon and bowl");
                }
            }
        });
        Thread cook2 = new Thread(() -> {
            synchronized (bowl) {
                System.out.println("Cook2: Holding the bowl....");
                System.out.println("Cook2: Waiting for the Spoon...");
                synchronized (spoon) {
                    System.out.println("Cook2: Holding the spoon and bowl");
                }
            }
        });
//        replace spoon and bowl in above code with each other -> a way to fix htis deadlock

        cook1.start();
        cook2.start();
    }
}
