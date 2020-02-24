import java.util.*;
public class oddreven{
    public static void main(String...args){
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String result = (num % 2 == 0)?"even":"odd";
        System.out.println(result);
    }
}