import java.util.*;
public class bill{
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date from 1 to 31");
        int date = sc.nextInt();
        System.out.println("Enter bill number");
        int bill = sc.nextInt();

        if( (date > 0 && date <= 31) && ((bill % 100) == date)  || (date > 0 && date <= 31) && ((bill % date) == 0)){
            System.out.println("Lucky");
        }
        else {
            System.out.println("Try another time");
        }

    }
}