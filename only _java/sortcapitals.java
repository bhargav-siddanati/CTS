import java.util.*;

class sortcapitals {
    public static HashMap<String, String> capitals(HashMap<String, String> hm) {
        List<Map.Entry<String, String>> li = new LinkedList<Map.Entry<String, String>>(hm.entrySet());
        Collections.sort(li, new Comparator<Map.Entry<String, String>>() {
            public int compare(Map.Entry<String, String> m1, Map.Entry<String, String> m2) {
                return m1.getValue().compareTo(m2.getValue());
            }
        });
        HashMap<String, String> hm1 = new LinkedHashMap<String, String>();
        for (Map.Entry<String, String> e : li) {
            hm1.put(e.getKey(), e.getValue());
        }
        return hm1;
    }

    public static void main(String... args) {
        HashMap<String, String> hm = new HashMap<String, String>();
        hm.put("TN", "Channai");
        hm.put("AP", "Am");
        hm.put("Karanataka", "Banglore");
        hm.put("Kerla", "Kochi");
        hm.put("Maharastra", "Mumbai");
        hm.put("TA", "Hyderabad");

        Map<String, String> mp = capitals(hm);
        for (Map.Entry<String, String> en : mp.entrySet()) { 
            System.out.println(en.getKey() + "    " + en.getValue()); //"Key = " +  , Value = 
        } 
    }
}