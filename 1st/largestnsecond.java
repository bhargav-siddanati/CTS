import java.util.*;
public class largestnsecond{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(sc.nextInt());
        ar.add(sc.nextInt());
        ar.add(sc.nextInt());
        Collections.sort(ar,Collections.reverseOrder());
        System.out.println(ar.get(0) + "  " + ar.get(1));
        
        
    }
}