import java.util.*;
public class MapManager{
    public static Set<Integer> getKeys(HashMap<Integer,Integer> hm){
        Set<Integer> tr = hm.keySet();
        return tr;
    }

    public static void main(String...args){
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        hm.put(1,1);
        hm.put(2,1); 
        hm.put(3,1);
        hm.put(4,1);
        hm.put(5,1);
        hm.put(6,1);
        hm.put(7,1);
        System.out.println(getKeys(hm));
    }
}