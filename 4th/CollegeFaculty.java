import java.util.ArrayList;
import java.util.Scanner;

abstract class Faculty{
    String Name,course;
    int age,id,salary;
    
}

class PermanentFaculty extends Faculty{
    int bonus,hra;
    Scanner sc = new Scanner(System.in);
    public void addPermanent(){
        System.out.println("Enter the Permanent Faculty Name");
        Name = sc.next();
        System.out.println("Enter the Permanent Faculty id");
        id = sc.nextInt();
        System.out.println("Enter the Permanent Faculty age");
        age = sc.nextInt();
        System.out.println("Enter the Permanent Faculty course");
        course = sc.next();
        System.out.println("Enter the Permanent Faculty salary");
        salary = sc.nextInt();
        System.out.println("Enter the Permanent Faculty bonus");
        bonus = sc.nextInt();
        System.out.println("Enter the Permanent Faculty hra");
        hra = sc.nextInt();
    }

}

class TemporaryFaculty extends Faculty{
    int duration;   
    Scanner sc = new Scanner(System.in);
    public void addTemporary(){
        System.out.println("Enter the Temporary Faculty Name");
        Name = sc.next();
        System.out.println("Enter the Temporary Faculty id");
        id = sc.nextInt();
        System.out.println("Enter the Temporary Faculty age");
        age = sc.nextInt();
        System.out.println("Enter the Temporary Faculty course");
        course = sc.next();
        System.out.println("Enter the Temporary Faculty salary");
        salary = sc.nextInt();
        System.out.println("Enter the Temporary Faculty duration");
        duration = sc.nextInt();
    }

}

public class CollegeFaculty{
    public static void main(String...bhargav){
        ArrayList<PermanentFaculty> per = new ArrayList<PermanentFaculty>();
        ArrayList<TemporaryFaculty> tem = new ArrayList<TemporaryFaculty>();
        // System.out.println("Enter the number of permanent employ");   

        for(int i = 0; i < 2; i++){
            System.out.println("Enter " + i + " Permanent Faculty Details");
            per.add(new PermanentFaculty());
            per.get(i).addPermanent();
        }
        for(int i = 0; i < 2; i++){
            System.out.println("Enter " + i + " Temporary Faculty Details");
            tem.add(new TemporaryFaculty());
            tem.get(i).addTemporary();
        }

        for(PermanentFaculty p : per){
            System.out.println(p.Name + "  " + p.id + "  " + p.age + "  " + p.course + "  " + p.salary + "  " + p.bonus + "  " + p.hra);
        }
        for(TemporaryFaculty t : tem){
            System.out.println(t.Name + "  " + t.id + "  " + t.age + "  " + t.course + "  " + t.salary + "  " + t.duration);
        }

        System.out.println("Total number of Faculties  " + (per.size()+tem.size()));
        System.out.println("Total number of PermanentFaculties  " + per.size());
        System.out.println("Total number of TemporaryFaculties  " + tem.size());

        System.out.println(" Enter id number you want to search ");
        Scanner sc = new Scanner(System.in);
        int FacultyId = sc.nextInt(),flag = 1;

        for(PermanentFaculty p : per){
            if(FacultyId == p.id){
                System.out.println(p.Name + "  " + p.id + "  " + p.age + "  " + p.course + "  " + p.salary + "  " + p.bonus + "  " + p.hra);
                flag = 0;
            }
        }

        for(TemporaryFaculty t : tem ){
            // if(flag != 0)
            // break;
            
            if(FacultyId == t.id)
            System.out.println(t.Name + "  " + t.id + "  " + t.age + "  " + t.course + "  " + t.salary + "  " + t.duration);
        }
     
    }
}
