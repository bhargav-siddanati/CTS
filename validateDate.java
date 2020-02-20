import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class validateDate{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date dd/mm/yyyy");
        String s = sc.next();
        DateFormat d = new SimpleDateFormat("dd/MM/yyyy");
        try{
            d.parse(s);
            System.out.println("successfully validate");
        }
        catch(ParseException e){
            System.out.println("Wrong date entered");
        }

    }
}