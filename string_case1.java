import java.util.*;
public class string_case1{
    public static void main(String [] args){
        System.out.println("This is the String_case1 program");
        String given_String = "Welcome to Java World";
        System.out.println(" 1.1 " + given_String.charAt(5));
        System.out.println(" 1.2 " + given_String.compareTo("Welcome"));
        System.out.println(" 1.2 " + given_String.compareToIgnoreCase("Welcome"));
        System.out.println(" 1.2 " + given_String.equals("Welcome"));
        System.out.println(" 1.2 " + given_String.equalsIgnoreCase("Welcome"));
        System.out.println(" 1.3 " + (given_String + " - Let us learn"));
        System.out.println(" 1.4 " + given_String.indexOf("a"));
        System.out.println(" 1.5 " + given_String.replace('a','e'));
        System.out.println(" 1.6 " + given_String.substring(4,10));
        // System.out.println(" 1.7 " + );
    }
}