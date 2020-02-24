import java.util.*;
public class string_hashmap{
    // static{
    //     System.out.println("1");
    // }
    // static{
    //     System.out.println("2");
    // }
    // static{
    //     System.out.println("3");
    // }
    // static{
    //     System.out.println("4");
    // }
    // {
    //     System.out.println("1");
    // }
    // {
    //     System.out.println("2");
    // }
    // {
    //     System.out.println("3");
    // }
    // {
    //     System.out.println("4");
    // }
    public static void main(String...args){
        HashMap<String,String> hm = new HashMap<String,String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value");
        // string_hashmap lol = new string_hashmap();
        int n = sc.nextInt();
        String st[] = new String[n];
        for(int i = 0; i < n; i ++) {
            String s = sc.next();
            st[i] = s;
            if(s.length() >= 2)
            hm.put(s.substring(0,3).toUpperCase(),s);
            
        }
        System.out.println(hm);
    }
}