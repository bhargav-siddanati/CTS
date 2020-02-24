import java.util.*;
public class string_case16{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String input = sc.nextLine(),s2,s3; 
        System.out.println("Enter string");
        s2 = sc.nextLine();
        System.out.println("Enter string");
        s3 = sc.nextLine();
        if(input.indexOf(s2) < input.indexOf(s3) )
        System.out.println("1");
        else
        System.out.println("2");
    }
}