import java.math.BigInteger;
import java.util.*;
public class Prime{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n1 = sc.nextInt();
        System.out.println("Enter number");
        int n2 = sc.nextInt();

        for(int i = n1; i <= n2; i++){
            BigInteger b = new BigInteger(String.valueOf(i));
            if(b.isProbablePrime(1)){
                System.out.print(i + " ");
            }
        }
    }
}