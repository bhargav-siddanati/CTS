import java.util.*;

public class arrangement {
    public static void main(String... args) {
        HashMap<String, String> hm = new HashMap<String, String>();
        LinkedHashMap<String, String> lm = new LinkedHashMap<String, String>();
        hm.put("TN", "Chennai");
        hm.put("AP", "Am");
        hm.put("TA", "Hyd");
        ArrayList<String> ls = new ArrayList<String>();
        for (Map.Entry e : hm.entrySet()) {
            String st = e.getValue().toString();
            ls.add(st);
        }
        Collections.sort(ls);
        System.out.println(ls);
        // int i = 0;
        for(int i = 0; i < ls.size();i++ ){
        Iterator<Map.Entry<String, String>> it = hm.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> e = it.next();
            
            if(ls.get(i).equals(e.getValue())){
                lm.put(e.getKey(),ls.get(i));
                System.out.println(e.getKey()+ "  " + ls.get(i));
            }
        }
    }
    System.out.println(lm);
    }
}