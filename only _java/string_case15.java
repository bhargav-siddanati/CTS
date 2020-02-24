import java.util.*;

public class string_case15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str1 = sc.nextLine();
        System.out.println("Enter string");
        String str2 = sc.nextLine();
        String s1 = str1.toLowerCase(),s2 = str2.toLowerCase();
        int po[] = new int[str1.length()];
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if ( s1.charAt(i) == s2.charAt(j) ) {
                    po[i] = 1;
                }
            }
        }
        String str3 = "";
        for( int i = 0; i < po.length; i++ ){
            if( po[i] == 1 ){
            str3 = str3 + str1.charAt(i);
            }
            else
            str3 = str3 + "+";
        }
        System.out.println(str3);
    }
}