//Example using demon thread

class JtcThread1 extends Thread {
    HelloJtc h = null;

    JtcThread1(HelloJtc h) {
        this.h = h;
    }

    public void run() {
        for (int i = 0; i < 152; i++) {
            h.val = i;
            System.out.println("-- Sorting the data \t" + i + "\t" + isDaemon() + "--");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}

class HelloJtc {
    int val;
}

class Employee {
    public void finalize() {
        Thread th = Thread.currentThread();
        for (int i = 100; i < 900; i++) {
            System.out.println(th.getName() + "\t" + th.isDaemon() + "\t" + i);
        }
        try {
            Thread.sleep(100);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

public class Jtc8 {
    public static void main(String[] args) {
        HelloJtc h = new HelloJtc();
        JtcThread1 jth = new JtcThread1(h);
        jth.setDaemon(true);
        jth.start();
        new Employee();
        System.gc();
        Thread th = Thread.currentThread();
        for (int i = 0; i < 15; i++) {
            System.out.println("-- In main\t:" + h.val + "\t" + th.isDaemon());
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}