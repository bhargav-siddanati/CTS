import java.util.*;
public class string_case22{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        String s = sc.nextLine();
        System.out.println(s.charAt(s.length() - 1)+""+s.substring(1,s.length()-1)+""+s.charAt(0));
    }
}