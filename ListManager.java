import java.util.*;
public class ListManager{
    public static ArrayList<Integer> removeElements(ArrayList<Integer> a, ArrayList<Integer> b){
        a.removeAll(b);
        return a;
    }
    public static void main(String...args){
        ArrayList<Integer> a =new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        b.add(3);
        b.add(9);
        b.add(1);
        b.add(10);
        System.out.println(removeElements(a,b));
    }
}