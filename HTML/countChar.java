import java.util.Scanner;

class stringOps {
    public void countString(String x) {
        int count = 0;
        int inputlenght = x.length();

        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) != ' ') {
                count = count + 1;
            }
        }

        System.out.println("Total String = " + count);
    }

    public void reverseStr(String x) {
        int leng = x.length();
        for (int i = leng - 1; i >= 0; i--) {
            System.out.print(x.charAt(i));
        }

    }

    public void isPalindromic(String x) {
        x = x.toLowerCase();
        int leng = x.length();
        String revstr = "";
        for (int i = leng - 1; i >= 0; i--) {
            revstr = revstr + x.charAt(i);
        }
        if (x.equals(revstr) == true) {
            System.out.println("Given string is Palindromic");
        } else {
            System.out.println("Given string not Palindromic");
        }

    }

    public void coutIfEvenOrOdd(int x) {// 1234
        int evencount = 0;
        int oddcount = 0;
        int rem = 0;
        while (x != 0) {

            rem = x % 10;

            if (rem % 2 == 0) {
                evencount = evencount + 1;
            }

            else {
                oddcount = oddcount + 1;
            }

            x = x / 10;
        }

        System.out.println("Evencount = " + evencount);
        System.out.println("Oddcount = " + oddcount);

    }

    public void countSumOfGivenNo(int x) {// 1234
        int totalsum = 0;
        int rem = 0;
        while (x != 0) {
            rem = x % 10;
            totalsum = totalsum + rem;
            x = x / 10;
        }

        System.out.println("countSumOfGivenNumber = " + totalsum);

    }

    public void fibonannciSeries(int x) {// 10
        int i1 = 0;
        int i2 = 1;
        int sum = 0;

        System.out.print(i1 + " | " + i2);// 0 1 1 2 3 8 11

        for (int i = 2; i < x; i++) {
            sum = i1 + i2;
            System.out.print(" | " + sum);
            i1 = i2;
            i2 = sum;
        }
    }

    public void sum(int a , long b){
        System.out.println("sum of a and b = "+(a+b));

    }

    public void sum (int a, int b, int c){
        System.out.println("sum of a,b and c ="+(a+b+c));

    }

    public void largestNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number");
        int a = sc.nextInt();
        System.out.println("Please enter secound number");
        int b = sc.nextInt();
        System.out.println("Please enter third number");
        int c = sc.nextInt();
        sc.close();

        if (a > b && a > c) {
            System.out.println("First number is largest = " + a);
        }

        else if (b > a && b > c) {
            System.out.println("Secound number is largest = " + b);

        }

        else {
            System.out.println("Secound number is largest = " + c);
        }
    }

}



public class countChar {
    public static void main(String[] args) {

        System.out.println("Please provide any value");
        Scanner sc = new Scanner(System.in);
        // String input_value = sc.nextLine();
        int input_no = sc.nextInt();
        sc.close();
        System.out.println("Given number = " + input_no);

        stringOps sops = new stringOps();
        // sops.countString(input_value);
        // sops.reverseStr(input_value);
        // sops.isPalindromic(input_value);
        // sops.coutIfEvenOrOdd(input_no);
        // sops.countSumOfGivenNo(input_no);
        //sops.fibonannciSeries(input_no);
        sops.sum(8, 8, 10);
        sops.sum(89, 100);

    }
}