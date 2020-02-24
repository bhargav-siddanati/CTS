import java.util.*;
public class string_methods{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s = sc.nextLine();
        String s1 = "none", s2 = "None",ex = "java",ex1 = "java",ex2 = "javac" ;
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(ex.compareTo(ex1));
        System.out.println(ex.compareTo(ex2));
        System.out.println(ex2.compareTo(ex));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s2));
        System.out.println((s.concat(" lol")));
    }
}