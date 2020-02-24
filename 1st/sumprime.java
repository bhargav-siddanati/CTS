import java.util.*;
import java.math.*;
public class sumprime {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.println("Enter number");
        int m = sc.nextInt(),sum = 0;
        for( int i = n; i <= m ; i++){
            BigInteger b = new BigInteger(String.valueOf(i));
            if(b.isProbablePrime(1)){
                sum += i;
                System.out.print(i + "  ");
            }     
        }
        System.out.println(sum);
    }
}