import java.util.*;
public class Counter{
    public static int counter(String str,char ch){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ch)
                count++;
        }
        return count;
    }
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine() ;
        System.out.println("Enter Character");
        char ch = sc.next().charAt(0);
        System.out.println(counter(str,ch));
    }
}