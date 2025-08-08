class logical{
    public static void main(String[] args) {
        System.out.println("-- Fibonacci Sequence --");

        int a = 0;
        int b = 1;
        int next;
        int n = 100;

        while (a+b <= n) {
            next = a+b;
            System.out.print(" " +next + " | ");
            a = b;
            b = next;            
        }

    }
}