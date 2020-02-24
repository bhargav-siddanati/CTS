import java.util.*;

public class string_case21 {
    public static void main(String... args) {
        String s = "helloworld",st = "";
        int count = 1;

        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                int cnt = map.get(c);
                map.put(c, cnt+1);
                
            } else {
                map.put(c, count);
            }
        }
        // for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        //     Character key = entry.getKey();
        //     Integer value = entry.getValue();
            
        //     if( value == 2){
        //         map.remove(entry.getKey());
        //     }
        // }
        Iterator <Map.Entry<Character, Integer>> it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Character, Integer> en = it.next();
            if(en.getValue() == 2){
                it.remove();
            }
            else{
                st = st + en.getKey();
            }
        }
        System.out.println(st);
    }
}