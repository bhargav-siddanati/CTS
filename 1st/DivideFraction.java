import java.util.*;
public class DivideFraction{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter double value");
        double num = sc.nextDouble();
        String s[] = String.valueOf(num).split(".");
        System.out.println(s[0]+"  "+s[1]);
    }
}