import java.util.*;
public class maxandmin{
    public static void main (String... args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of length");
        ArrayList<Integer> ar = new ArrayList<Integer>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            ar.add(sc.nextInt());
        }
        System.out.println(Collections.max(ar));
    }
}