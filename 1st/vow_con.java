import java.util.*;

public class vow_con {
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter alphabet");
        char a = sc.next().charAt(0);
        char c = Character.toLowerCase(a);
        String s = ( (c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u'))?"Vowel":"Consonent";
        System.out.println(s);

    }
}
