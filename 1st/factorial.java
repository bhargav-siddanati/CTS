import java.util.*;

public class factorial {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt(), re = 1;
        if(n == 0 || n == 1){
            System.out.println(1);
        }
        else{
            while(n != 1){
                re = re * n;
                n--; 
            }
            System.out.println(re);
        }
    }
}
