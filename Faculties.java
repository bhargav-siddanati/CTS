import java.util.*;

abstract class Faculty{
    String name,course;
    int age,id,salary;

}

class PermanentFaculty extends Faculty{
    int bonus,hra;
    public void addpermanent(PermanentFaculty perfaculty){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Name");
        perfaculty.name = sc.next();
        System.out.println("Enter Employee course");
        perfaculty.course = sc.next();
        System.out.println("Enter Employee age");
        perfaculty.age = sc.nextInt();
        System.out.println("Enter Employee Id");
        perfaculty.id = sc.nextInt();
        System.out.println("Enter Employee salary");
        perfaculty.salary = sc.nextInt();
        System.out.println("Enter Employee bonus");
        perfaculty.bonus = sc.nextInt();
        System.out.println("Enter Employee hra");
        perfaculty.hra = sc.nextInt();
        
       
    }
    public void totalCountPermanent(){
        System.out.println("Enter Employee Name");
        System.out.println("Enter Employee course");
        System.out.println("Enter Employee age");
        System.out.println("Enter Employee Id");
        System.out.println("Enter Employee salary");
        System.out.println("Enter Employee bonus");
    }
}

class TemporaryFaculty extends Faculty{
    String duration;
    public void totalCountTemporary(){

    }
}

public class Faculties{
    
    public static void main(String...bhargav){
        PermanentFaculty perfaculty[] = new PermanentFaculty[3];
        // Faculty temfaculty = new TemporaryFaculty();
        ArrayList<PermanentFaculty> ar = new ArrayList<PermanentFaculty>();
        for(int i = 0; i < 2; i++){
            perfaculty[i] = new PermanentFaculty();
            perfaculty[i].addpermanent(new PermanentFaculty());
        }
        for( int i = 0; i < 2; i++){
            perfaculty[i].totalCountPermanent();
        }

    }
}
