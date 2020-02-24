import java.util.*;

public class CharacterCounter {
    public static void countCharacter(String str,char ch,int pos){
        System.out.println(str.substring(0,pos)+""+ch+""+str.substring(pos,str.length()));
    }
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine() ;
        System.out.println("Enter Character");
        char ch = sc.next().charAt(0);
        System.out.println("Enter number");
        int pos = sc.nextInt() ;
        countCharacter(str,ch,pos);
    }
}