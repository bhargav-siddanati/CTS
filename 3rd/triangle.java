import java.util.*;

public class triangle {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}