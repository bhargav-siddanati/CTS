import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class age{
    public static ArrayList<String> aged(HashMap<String,String> hm){
        ArrayList<String> ar = new ArrayList<String>();
        Iterator<Map.Entry<String,String>> it = hm.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String,String> en = it.next();
            String s = en.getValue();
            try{
                Date d = new SimpleDateFormat("dd/MM/yyyy").parse(s);
                Calendar c = Calendar.getInstance();
                c.setTime(d);
                int last = c.get(Calendar.YEAR);
                Calendar c1 = Calendar.getInstance();
                int now = c1.get(Calendar.YEAR);
                if((now-last) > 18){
                    ar.add(en.getKey());
                }
            }catch(ParseException e){
                System.out.println("not crt");
            }
            
        }
        return ar;
    }
    public static void main(String...args){
        HashMap<String,String> hm = new HashMap<String,String>();
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++ ){
            System.out.println("Enter String key");
            String st = sc.next(); 
            System.out.println("Enter String Value");
            String st1 = sc.next();
            hm.put(st,st1);
        }
        
        System.out.println(aged(hm));
    }
}