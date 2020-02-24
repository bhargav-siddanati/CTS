import java.util.*;
public class StringManager{
    public static String insertString(String str1,String str2,char ch){
        String sk = "";
        for(int i = 0; i < str1.length(); i++){

            if(str1.charAt(i) == ch){
                sk = sk + str2;
            }
            sk = sk + str1.charAt(i);
                
        }
        return sk;
    }
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str1 = sc.nextLine() ;
        System.out.println("Enter String");
        String str2 = sc.nextLine() ;
        System.out.println("Enter Character");
        char ch = sc.next().charAt(0);
        System.out.println(insertString(str1,str2,ch));
    }
}