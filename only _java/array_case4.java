import java.util.*;
public class array_case4{
    public static void main(String...args){
        System.out.print("Enter the size number  :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),sum = 0;
        int arr[] = new int[a];
        for(int i=0; i<a; i++){
            System.out.println("Enter number");
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<a;i++){
            if(i%2 == 0){
                sum += i*arr[i];
            }
        }
        System.out.println(sum);
    }
}