import java.util.*;
public class string_case24{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.length() <= 2){
            System.out.println(s+""+s+""+s);
        }
        else if(s.length() >= 3){
            System.out.println(s.substring(0,3)+""+s.substring(0,3));
        }
    }
}