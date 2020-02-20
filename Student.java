import java.util.Scanner;

//Write a program which accepts Student name and 5 subject marks for 1
//semester calculate average and total
class Student
{
String name;
int marks[][]=new int[3][];
float average[]=new float[3];
float total[]=new float[3];

void accept()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Student name");
name=sc.nextLine();
// System.out.println("Enter the number of subjects");
// int n=sc.nextInt();
//marks=new int[n];
//or
//marks=new int[5];
for(int i=0;i<marks.length;i++)
{
System.out.println("Enter the number of Subjects ");
int n=sc.nextInt();
marks[i]=new int[n];
System.out.println("Enter the marks for each semester"+(i+1));

for(int j=0;j<marks[i].length;j++)
{
System.out.println("Enter the subject marks");
marks[i][j]=sc.nextInt();
total[i]+=marks[i][j];
}
average[i]=total[i]/marks[i].length;

}
}
void display()
{
System.out.println("Student name"+name);
System.out.println("Entered marks are");
for(int i=0;i<marks.length;i++)
{
System.out.println("semester score");
for(int j=0;j<marks[i].length;j++)
{
System.out.println("Subject Score "+marks[i][j]);
}
System.out.println("Total"+total[i]);
System.out.println("Average"+average[i]);

}
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter Number of Students");
int n=sc.nextInt();
Student s[]=new Student[n];//Object Array
for(int i=0;i<s.length;i++)
{
s[i]=new Student();
s[i].accept();
}
for(int i=0;i<s.length;i++)
{
s[i].display();
}
}
}