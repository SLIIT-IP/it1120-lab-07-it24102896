import java.util.Scanner;

public class IT24102896Lab7Q1A
{
  public static void main(String[] args)
  {

Scanner marks = new Scanner(System.in);

int subject1,subject2,subject3,subject4;
double average;


System.out.print("enter Subject mark 1 : ");
subject1 = marks.nextInt();

System.out.print("enter Subject mark 2 : ");
subject2 = marks.nextInt();

System.out.print("enter Subject mark 3 : ");
subject3 = marks.nextInt();

System.out.print("enter Subject mark 4 : ");
subject4 = marks.nextInt();

System.out.println();

average = (subject1 + subject2 + subject3 + subject4) / 4;
System.out.println("average marks : " + average);


if(average>=75)
{
System.out.println("overall grade is : Distination");
}
else if(average>=50)
{
System.out.println("overall grade is : Credit");
}
else if(average>=0)
{
System.out.println("overall grade is : Fail");
}

}
   }

 