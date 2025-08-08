// Example using single thread

class JtcThread1 extends Thread // Here we have created a Thread by extending Thread
{
    JtcThread1(String name) {
        super(name);
    }

    JtcThread1(ThreadGroup tg, String name) {
        super(tg, name);
    }

    public void run() {
        System.out.println("-- Here the void run() started --");
        for (int i = 0; i < 5; i++) {
            System.out.println("Value of i = " + i);
            ThreadGroup tg = getThreadGroup();
            System.out.println("-- getName()" + tg.getName() + "--");
            System.out.println("-- getPriority()" + i + "\t" + tg.getPriority() + "--");
        }
    }
}

class HelloStudent {
    public void finalize() {
        System.out.println("-- Here void finalize () started --");
        Thread th = Thread.currentThread();
        ThreadGroup tg = th.getThreadGroup();
        System.out.println("-- getName() --" +th.getName());
        System.out.println("-- getPriority() --" +th.getPriority());
        JtcThread1 jth1 = new JtcThread1("JSP");
        jth1.start();
        ThreadGroup tg1 = new ThreadGroup("JTC");
        JtcThread1 jth2 = new JtcThread1(tg1,"-WS");
        jth2.start();
    }    
}

public class Jtc10 // ELC
{
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("B10-12");
        JtcThread1 jth1 = new JtcThread1(tg,"Java");
        
        JtcThread1 jth2 = new JtcThread1("Java");
        jth2.setPriority(9);

        JtcThread1 jth3 = new JtcThread1("EJB");
        jth3.setPriority(2);

        JtcThread1 jth4 = new JtcThread1("XML");
        new HelloStudent();
        System.gc();
        jth1.start();
        jth2.start();
        jth3.start();
        jth4.start();   

    }
}