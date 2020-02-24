import java.util.*;
import java.util.Collections;
public class ListManager2{
    public static ArrayList<String> getArrayList(String a[]){
        ArrayList<String> ar = new ArrayList<String>(Arrays.asList(a));
        Collections.sort(ar);
        return ar;
    }
    public static void main(String...args){
        String a[] = {"kay","jay","may","man"};
        System.out.println(getArrayList(a));
    }
}