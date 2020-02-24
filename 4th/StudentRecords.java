import java.util.*;
interface Records{

    void SetRecord();
    void DisplayRecord();
    void SearchRecord(String course);
}
public class StudentRecords implements Records{
    String StudentName,StudentCourseName;
    int StudentMarks;
    ArrayList<Records> course = new ArrayList<Records>();

    Scanner sc = new Scanner(System.in);
    public void SetRecord(){
        System.out.println("Enter the Name");
        StudentName = sc.nextLine();
        System.out.println("Enter the CourseName");
        StudentCourseName = sc.nextLine();
        System.out.println("Enter the Marks");
        StudentMarks = sc.nextInt();
    }
    public void DisplayRecord(){
        System.out.println(StudentName + "  " + StudentCourseName +"  " + StudentMarks);
    }
   
    public void sorting(ArrayList<Records> rec){
        course.addAll(rec);
        Collections.sort(course, new Comparator<Records>() {
            public int compare(Records r1, Records r2){
                return ((StudentRecords)r2).StudentMarks - ((StudentRecords)r1).StudentMarks;
            }
        });
        // for(Records r: course){
        //     System.out.println(((StudentRecords)r).StudentName);
        // }
        // System.out.println(course);
    }
    public void SearchRecord(String courses){
        Records r = course.get(0);
        System.out.println(((StudentRecords)r).StudentName);
     }
    public static void main(String...bhargav){
        Records records = new StudentRecords();
        System.out.println("Enter the number of Records");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<Records> rec = new ArrayList<Records>();
        for(int i = 0; i < num; i++){
            rec.add(new StudentRecords());
            rec.get(i).SetRecord();
        }
        for(Records st : rec){
            st.DisplayRecord();
        }
        
        System.out.println("Enter the CourseName");
        String course = sc.next();
        ArrayList<Records> courses = new ArrayList<Records>();
        for(Records st : rec){
            if(((StudentRecords) st).StudentCourseName.equals(course)){
                // System.out.println(((StudentRecords) st).StudentCourseName);
                courses.add(st);
            }
        }

     ((StudentRecords) records).sorting(courses);

        records.SearchRecord(course);
        
    }
}