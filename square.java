import java.util.*;
public class square{
    public static void main(String [] args){
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int square = sc.nextInt();
        int mod = square % 4;
        System.out.println("remaining sticks after making squares = "+mod);
        int sub = square - mod;
        System.out.println(sub*2);
    }
}