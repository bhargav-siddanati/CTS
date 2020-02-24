import java.util.*;
public class string_case13{
    public static void main(String [] args){
        System.out.println("Enter the string ");
        Scanner sc = new Scanner(System.in);
        String s = sc.next(), st = "";
        s = s.replace("-","");
        int count = 0;
        // String st[] = s.split("-");
        // System.out.println(st);
        for(int i = 0; i < s.length(); i++ ){
            if( i == 1 || i == 3 ){
                st = st + s.charAt(i);
                st = st + '-';
            }
            else if( i >= 4 ){
                if ( count == 3 ){
                    st = st + '-';
                    st = st + s.charAt(i);
                    count = 0;
                }
                else{
                st = st + s.charAt(i);
                count++;
                }
               
            }
            else{
                st = st + s.charAt(i);
            }
        }
        System.out.println(st);
    }
}