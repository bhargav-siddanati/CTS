import java.util.*;
public class keyandvalue{
    public static void main(String...args){
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Integer,Integer> link = new LinkedHashMap<Integer,Integer>();
        link.put(12,90);
        link.put(35,90);
        link.put(33,90);
        link.put(56,88);
        System.out.println(link);
        int sum = 0,k = 0;
      Iterator<Map.Entry<Integer,Integer>> it = link.entrySet().iterator();

      while(it.hasNext()){
        Map.Entry<Integer,Integer> map = it.next();
        if(map.getKey() % 2 != 0){
            sum += map.getValue();
            k++;
        }
      }
      System.out.println(sum/k);
    }
}