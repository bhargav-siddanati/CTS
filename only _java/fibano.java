import java.util.*;
public class fibano{
    public static void main(String[] args){
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int f = 0,f1 = 1,f2;
        for(int i = 2; i < num; i++){
            f2 = f + f1;
            f = f1;
            f1 = f2;
        }
        System.out.print(f1+ " ");
    }
}