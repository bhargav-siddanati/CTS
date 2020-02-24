import java.util.*;
import java.math.*;
public class substract{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = String.valueOf(n),lol = "";
        int i =0,j = 1;
        while(i < s.length() && j < s.length()){
            int k = (s.charAt(i) - s.charAt(j));
            lol = lol + Math.abs(k);
            j++;
            i++;
        }
        lol = lol + s.charAt(s.length() - 1);
        System.out.println(lol);
    }
}