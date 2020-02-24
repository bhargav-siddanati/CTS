import java.util.*;
public class collection9{
    public static String returnString(ArrayList<String> a){
        String s = "";
        for(String st : a){
            s = s + st.charAt(st.length()-1);
        }
        return s;
    }
    public static void main(String...args){
        ArrayList<String> a = new ArrayList<String>();
        ArrayList<String> b = new ArrayList<String>();
        a.add("ab");
        b.add("car");
        a.add("a");
        b.add("java");
        a.add("abcd");
        b.add("mat");
        System.out.println(returnString(a));
        System.out.println(returnString(b));
    }
}