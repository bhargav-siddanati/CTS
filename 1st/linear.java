import java.util.*;
public class linear {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter numbers");
        for(int i = 0; i < n; i++){
            ar[i] = sc.nextInt();
        }
        System.out.println("Enter number to be searched");
        int s = sc.nextInt();
        String st = "";
        for(int i = 0; i < n; i++){
            System.out.print(ar[i] + "  ");
            st = (ar[i] == s)?"Found":"Not Found";
        }
        System.out.println(st);
    }
}