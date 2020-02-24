import java.util.*;
public class array{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        int a = sc.nextInt();
        
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for(int i = 0; i < a; i++){
            System.out.println("Enter number");
            ar.add(sc.nextInt());
        }
        System.out.println("Enter target");
        int b = sc.nextInt();
        System.out.println(ar);
        // if(ar.get(ar.size() - 1) <= b){
        //     if(ar.contains(b)){
        //         ar.indexOf(b);
        //     }
        //     else{
        //         for()
        //     }
        // }
        // else if(ar.get(ar.size() - 1) > b){
        //     System.out.println(ar.size());
        // }

        for(int k : ar){
            if(b == k){
                System.out.println(ar.indexOf(k));
                break;
            }
            else if(b > k){
                System.out.println(ar.indexOf(b-1));
                break;
            }
            else if(b < k){
                System.out.println(ar.indexOf(b+1));
                break;
            }
        }
    }
}