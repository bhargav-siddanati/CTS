import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class DayFinder {
    public static void main(String... args) {
        ArrayList<String> ar = new ArrayList<String>();
        ArrayList<String> day = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {

            String s = sc.next();
            ar.add(s);
            try {
                Date d = new SimpleDateFormat("yyyy-MM-dd").parse(s);
                String st[] = d.toString().split(" ");
                switch (st[0]) {
                case "Mon":
                    day.add("Monday");
                    break;
                case "Tue":
                    day.add("Tuesday");
                    break;
                case "Wed":
                    day.add("Wedencesday");
                    break;
                case "Thu":
                    day.add("Thuesday");
                    break;
                case "Fri":
                    day.add("Friday");
                    break;
                case "Sat":
                    day.add("Saturday");
                    break;
                case "Sun":
                    day.add("Sunday");
                    break;
                }

            } catch (ParseException e) {

            }
        }
System.out.println(day);
    }
}