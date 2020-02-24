import java.util.*;
public class UniqueCollection {
    public static TreeSet<String> getCollection(String a[]){
        TreeSet<String> tr = new TreeSet<String>(Arrays.asList(a));
        return tr;
    }
    public static void main(String...args){
        String a[] = {"java","java","kova","jdbc","python","python"};
        System.out.println(getCollection(a));
    }
}