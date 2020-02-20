import java.util.*;
public class matrix{
    public static void main(String [] args){
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int arr[][] = new int[input][input];
        int count = 0,flag = 0;
        for(int i = 0; i < arr.length; i++){
            for( int j = 0; j < arr[i].length; j++){
                if(i == 0){
                    arr[i][j] = 1;
                    System.out.print(arr[i][j]+ " ");
                }
               if(i > 0){
                   arr[i][j] = 1;
                  int k = i-1, l = j+1; 
                   while((k != -1 && l != arr.length) || (k != arr.length && l != -1)){
                       if(arr[i][j] == arr[k][l]){
                           arr[i][j] = 0;
                           flag = 1;
                        System.out.println("attack");
                        break;
                       }
                       else{
                        count++;
                        k--;
                        l++;
                       }
                   }
                   int m = i - 1,n = j - 1;
                   while(flag != 1 || (k != -1 && l != arr.length) || (k != arr.length && l != -1)){
                       
                   }
               }
            }
            System.out.print("\n");

        }

    }
}