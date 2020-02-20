import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class validateTime{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Time 00:00 AM/PM");
        String s = sc.nextLine();
        DateFormat d = new SimpleDateFormat("hh:mm aa");
        try{
            d.parse(s);
            System.out.println("successfully validate");
        }
        catch(ParseException e){
            System.out.println("Wrong date entered");
        }

    }
}