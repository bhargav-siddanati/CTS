import java.util.*;
import java.math.*;
public class array_case3{
    public static void main(String...args){
        System.out.print("Enter array size number");
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int arr[] = new int[size];
        // for( int i = 0; i < size; i++){
        //     System.out.print("Enter number");
        //     arr[i] = sc.nextInt();
        // }
        int a[] = {1,2,3,4};int sum = 0;
        for( int i = 0; i < a.length; i++ ){
            if( i % 2 == 0){
                if(i == a.length-1)
                    System.out.print( a[i]+"^3");
                else
                System.out.print( a[i]+"^3+");
                sum += Math.pow(a[i],2);
            }
            else{
                if(i == a.length-1)
                    System.out.print(a[i]+"^2");
                else
                System.out.print(a[i]+"^2+");
                sum += Math.pow(a[i],3);
            }
        }
        System.out.println("\n"+sum);
    }
}