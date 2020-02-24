import java.util.*;

public class chessboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt(), flag = 0, count = 0;
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 ) {
                    arr[i][j] = 1;
                    count++;
                    System.out.print(arr[i][j] + " ");
                } else {
                    arr[i][j] = 1;
                    count++;
                    int k = i - 1, l = j + 1;
                    while ( k >= 0 && l < n ) { 
                        if (arr[k][l] == arr[i][j]) {
                            // System.out.print("*");
                            arr[i][j] = 0;
                            flag = 1;
                            count--;
                            break;
                        } else {
                            k--;
                            l++;
                        }
                    }
                    if (flag != 1) {
                        int m = i - 1, o = j - 1;
                        while ( m >= 0 && o >= 0) {    
                            if (arr[m][o] == arr[i][j]) {
                                // System.out.print("*");
                                arr[i][j] = 0;
                                flag = 1;
                                count--;
                                break;
                            } else {
                                m--;
                                o--;
                            }
                        }
                    }
                    flag = 0;
                    // System.out.println(i+"  --  "+flag);
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("count "+count);
    }
}