import java.util.*;

public class valuesort {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ar = new ArrayList<String>();
        Map<String, Integer> link = new LinkedHashMap<String, Integer>();
        System.out.println("Enter the length");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            ar.add(s);
            String st[] = s.split("#");
            int j = 1, sum = 0;
            while (j < st.length) {
                sum += Integer.valueOf(st[j]);
                j++;
            }
            link.put(st[0], sum);
        }
        
        System.out.println(link);
        List<Map.Entry<String,Integer>> ll = new LinkedList<Map.Entry<String,Integer>>(link.entrySet());
        Collections.sort(ll , new Comparator<Map.Entry<String,Integer>>() {
            public int compare(Map.Entry<String,Integer> m1,Map.Entry<String,Integer> m2){
                return m2.getValue() - m1.getValue();
            }
        });
        for(Map.Entry<String,Integer> e : ll){
            System.out.println(e.getKey());
            break;
        }
    }
}