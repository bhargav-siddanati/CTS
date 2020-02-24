import java.util.*;
public class string_case5{
    public static void main(String [] args){
        System.out.println("Enter data");
        Scanner sc = new Scanner(System.in);
        String st1 = sc.next();
        String d="",m="",y="";
        if(st1.contains("/")){
            String s[] = st1.split("/"); 
            for( int i = 0; i < s.length; i++){
                if( i == 0 && Integer.parseInt(s[i]) >= 0 && Integer.parseInt(s[i]) <= 31 ){
                    d = "true";
                }
                else if( i == 1 && Integer.parseInt(s[i]) >= 0 && Integer.parseInt(s[i]) <= 12 ){
                   m = "true";
                }
                else if( i == 2 && s[i].length() == 4 ){
                    y = "true";
                }
                else{
                    System.out.println("false");
                    break;
                }
            }
            if( d.equals("true") && m.equals("true") && y.equals("true") ){
                System.out.println("true");
            }
             
        }

    }
}