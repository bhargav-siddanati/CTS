import java.util.*;
public class string_case18{
    public static void main(String...args){
        System.out.println("Enter string");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();// "hai hello hai where hai Hai";
        System.out.println("Enter string");
        String s2 = sc.nextLine();// "what hai";
        String str[] = s2.split(" ");
        String word = str[1];
        // System.out.println(word.length());
        System.out.println(s1.substring(0,word.length()));
        
        int j = 3,count = 0,i = 0;
        while( j <= s1.length() ){
            String l = s1.substring(i,j);
            if( s1.substring(i,j).equals(word) ){
                count++;
                i++;
                j++;
            }
            else{
                i++;
                j++;
            }
        }
        System.out.println(count);
    }
}