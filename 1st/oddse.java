import java.util.*;
public class oddse{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        n = ((n+1)/2);
        System.out.println(n*n);
    }
}