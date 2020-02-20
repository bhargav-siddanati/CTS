import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class as_1{
    public static ArrayList<String> sortDate(ArrayList<String> ar){
        ArrayList<String> at = new ArrayList<String>();
        for( String s : ar){

            try{
                Date d  = new SimpleDateFormat("yyyy-mm-dd").parse(s);
                DateFormat df = new SimpleDateFormat("EEEE");
                String sl = df.format(d);
                at.add(sl);
            }
            catch(ParseException e){
                System.out.println("Wrong");
            }
        }
        return at;
    }
    public static void main(String...args){
        System.out.println("Enter length");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> ar = new ArrayList<String>();
        for(int i = 0; i < n ; i++){
            ar.add(sc.next());
        }
        System.out.println(sortDate(ar));
    }
}