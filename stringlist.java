import java.util.*;
public class stringlist{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the array");
        int n = sc.nextInt();
        String st = "\"";
        ArrayList<String> ar = new ArrayList<String>();
        for(int i = 0; i < n; i++){
            System.out.println("Enter element");
            String s = sc.next();
            ar.add(s);
            // if( i == 0)
            //     st = st + s;
            // else if( i == n-1)
            //     st = st + "," + s + "\"";
            // else
            //     st = st + "," + s; 
        }
        String l = String.join(",",ar);
        System.out.println(l);
    }
}