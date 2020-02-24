import java.util.*;
public class series {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt(),i = 1;
        while(i != n+1){
            int k = (i % 2 == 0)? -i : i;
            System.out.print(k + "  ");
            i++;
        }
    }
}