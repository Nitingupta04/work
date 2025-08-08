import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt(); 
        System.out.println("Enter the String value");
        String s = sc.nextLine();
        StringBuffer sb1 = new StringBuffer(s);
        System.out.println(sb1.reverse());        
        
        /*int r = 0; // 30
        while(n!=0){
            r = r * 10 + n%10;
            n= n/10;
        }

        System.out.println(r);*/

        //StringBuffer sb = new StringBuffer(String.valueOf(n));
        //System.out.println("Reverse No "+sb.reverse());
        
        

    }
    
}
