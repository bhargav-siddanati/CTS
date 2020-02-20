import java.text.SimpleDateFormat;
import java.util.*;
public class DataGenerator{
    public static String getDate(SimpleDateFormat sm){
        Date d = new Date();
        return (sm.format(d));
    }
    public static void main(String...args){
        String s = "dd/MM/yyyy";
        SimpleDateFormat sm = new SimpleDateFormat(s);
        System.out.println(getDate(sm));
    }
}

