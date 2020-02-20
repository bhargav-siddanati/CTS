import java.util.*;
public class UserMainCode{
    public static ArrayList<Integer> sortMergedArrayList(ArrayList<Integer> a1,ArrayList<Integer>a2){
        a1.addAll(a2);
        Collections.sort(a1);
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(a1.get(2));
        a.add(a1.get(6));
        a.add(a1.get(8));
        return a;
    }
    public static void main(String...args){
        
        ArrayList<Integer> ar1 = new ArrayList<Integer>();
        ArrayList<Integer> ar2 = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first array 5 elements");
        for(int i = 0; i < 5; i++ ){
            System.out.println("Enter elemnent");
            ar1.add(sc.nextInt());
        }
        System.out.println("Enter second array 5 elements");
        for(int i = 0; i < 5; i++ ){
            System.out.println("Enter elemnent");
            ar2.add(sc.nextInt());
        }
        System.out.println(sortMergedArrayList(ar1,ar2));
    }
}