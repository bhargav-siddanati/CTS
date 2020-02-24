import java.util.*;
public class student{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        float total = 0;float avg = 0;String cls = "";
        int i = 0;
        while( i != 3){
            total += sc.nextInt();
            if(i == 2){
                avg = total/(i+1);
                if(avg > 60){
                    cls += "first";
                }
                else if(avg >= 50 && avg <= 60){ cls += "second"; }
                else if(avg >= 40 && avg <= 49){ cls += "pass"; }
                else if(avg <= 39){
                    cls += "fail";
                }
            }
            i++;
         }
        System.out.println(total + "  " + avg + "  " + cls);
    }
}