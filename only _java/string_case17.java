import java.util.*;
public class string_case17{
    public static void main(String...args){
        System.out.println("Enter string");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("Enter string");
        String s1 = sc.next();
        System.out.println("Enter integer");
        int i = sc.nextInt();

        System.out.println( (Integer.valueOf(s1.substring(s1.length()-5,s1.length())) - Integer.valueOf(s.substring(s.length()-5,s.length()))) * i );
    }
}