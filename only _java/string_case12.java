import java.util.*;
public class string_case12{
    public static void main(String [] args){
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String s = sc.next(),st = "";
        for( int i = 0; i < s.length(); i++ ){
            if( i % 2 != 0){
                int a = s.charAt(i);
                a++;
                st = st + (char)a;
            }
            else
                st = st + s.charAt(i);
        }
        System.out.println(st);
    }
}