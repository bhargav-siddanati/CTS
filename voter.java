
// import java.text.ParseException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class voter {
    public static ArrayList<String> eligible(HashMap<String, String> hm) {
        ArrayList<String> ar = new ArrayList<String>();
        Iterator<Map.Entry<String, String>> it = hm.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> m = it.next();
            String s1 = m.getKey();
            String s = m.getValue();
            try {
                Date d = new SimpleDateFormat("dd/MM/yyyy").parse(s);
                Calendar c = Calendar.getInstance();
                Calendar c1 = Calendar.getInstance();
                c.setTime(d);
                int old = c.get(Calendar.YEAR);
                int now = c1.get(Calendar.YEAR);
                int age = now-old;
                if(age>18)
                ar.add(s1);
            } catch (ParseException e) {
                System.out.println("exception");
            }

        }
        return ar;
    }

    public static void main(String... args) {
        HashMap<String, String> hm = new HashMap<String, String>();
        // Scanner sc = new Scanner(System.in);
        // int s = sc.nextInt();
        hm.put("aruna", "12/04/2012");
        hm.put("lata", "24/03/1987");
        // for( int i = 0; i < s; i++ ){
        // String s1 = sc.next();
        // String s2 = sc.next();
        // if(s2.matches("[0-9]{2}[/][0-9]{2}[/][0-9]{4}")){
        // hm.put(s1,s2);
        // }
        // else
        // break;
        System.out.println(eligible(hm));
        // }

    }
}