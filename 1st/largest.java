import java.util.*;
public class largest{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st value");
        int a = sc.nextInt();
        System.out.println("Enter 2st value");
        int b = sc.nextInt();
        System.out.println("Enter 3st value");
        int c = sc.nextInt();

        int d = (a > b)?(a > c ? a : c):((b > c ? b : c));
        System.out.println(d);

    }
}