import java.util.*;

public class palindrom {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println("Enter the number");
        int b = sc.nextInt(), sum = 0;
        for (int i = a; i <= b; i++) {

            String s = String.valueOf(i);
            StringBuffer sk = new StringBuffer(s);
            if(s.equals(sk.reverse().toString())){
                System.out.print(i + " ");
                sum += i;
            }
           
        }
        System.out.println(sum);
    }
}