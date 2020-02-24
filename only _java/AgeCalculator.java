import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class AgeCalculator {
    public static int calculateAge(String s,SimpleDateFormat sm){
        // sm.setLenient(false);
         try{
             Date d = sm.parse(s);
             Calendar dob = Calendar.getInstance();
             dob.setTime(d);
             int date = dob.get(Calendar.YEAR);
             Calendar present = Calendar.getInstance();
             int todate = present.get(Calendar.YEAR);
             return (todate - date);
         }
         catch(ParseException e){
             System.out.println("non");
             return 0;
         }
         
        
    }
    public static void main(String... args) {
        String s = "02/2/1994";
        SimpleDateFormat sm = new SimpleDateFormat("dd/mm/yyyy");
        System.out.println(calculateAge(s,sm));
    }
}