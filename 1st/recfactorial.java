import java.util.*;
public class recfactorial {
    public static int fact(int n){
       if( n == 0 || n == 1){
           return 1;
       }
       else{
              return  n * fact(n-1);
           }
       }
 
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        if(n < 0){
        n = Math.abs(n);
        System.out.println(fact(n));
        }
        else
        System.out.println("-"+fact(n));

    }
}

