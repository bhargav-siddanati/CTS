import java.util.*;
public class string_case11{
    public static int met(String a[]){
        int s = 0;
        for( int i = 0; i < a.length; i++ ){
            if( Integer.valueOf(a[i]) > 0 && Integer.valueOf(a[i]) < 255 ){
                s ++;
            }
            else{
                s = 0;
                break;
            }
        }
        if( s == a.length)
        return 1;
        else
        return 2;
    }
    public static void main(String [] args){
        System.out.println("Enter IP address");
        Scanner sc =  new Scanner(System.in);
        String s = sc.nextLine();
        String[] ar = s.split("\\.");
        int value = met(ar);
        System.out.println( value);

    }
}