import java.util.*;
public class string_case14{
    public static void main(String[]args){
        System.out.println("Enter String");
        Scanner sc = new Scanner(System.in);
        String s = sc.next(), st = "";
        for(int i = 0; i < s.length(); i++ ){
            if( i % 2 == 0){
                if( s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' ){
                    
                } 
                else{
                    st = st + s.charAt(i);
                }
            }
            else{
                st = st + s.charAt(i);
            }
        }
        System.out.println(st);
    }
}