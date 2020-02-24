import java.util.*;
public class RemoveDuplicate{
    public static void main(String...args){
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        b.add(1);
        b.add(8);
        b.add(12);
        b.add(9);
        b.add(3);
        b.add(2);
        a.retainAll(b);
        int sum = 0;
        ArrayList<Integer> c = new ArrayList<Integer>(a);
        for(int i : c){
            sum += i;
        }
        System.out.println(c+"   " +sum);
    }
}