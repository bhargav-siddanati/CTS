import java.util.*;
public class Duplicate_Character{
    public static void main(String...bhargav){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the name");
        String st = sc.next();
        LinkedHashMap<Character,Integer> link = new LinkedHashMap<Character,Integer>();
        for(int i = 0; i < st.length(); i++){
            if(link.containsKey(st.charAt(i))){
                int k = link.get(st.charAt(i));
                k++;
                link.put(st.charAt(i), k);
            }
            else
                link.put(st.charAt(i), 1);
        }
        for(Map.Entry entry:link.entrySet()){
            if( ((int) entry.getValue()) == 1) {
                System.out.println(st.indexOf(entry.getKey().toString()));
                break;
            }
        }
        System.out.println(link);
        
    }
}

