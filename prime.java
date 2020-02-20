import java.util.*;
public class prime{
    public static void met(int n){
        int arr[] = new int[n];
        int c = 0;
        int flag;
        for(int i = 1; i <= n; i++ ){
            if(i == 1 || i == 0)
            continue;
            flag = 1;
            for(int j = 2; j <= i/2; j++){
                if( i % j == 0){
                    flag = 0;
                    break;
                } 
            }
            if(flag == 1){
                arr[c] = i;
                c++;
            }
        }

        for(int i = 0; i <= c; i = i+2){
            System.out.println(arr[i]);
        }
    }
    public static void main(String [] args){
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        prime.met(num);

    }
}