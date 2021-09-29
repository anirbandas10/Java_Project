/*Define a class Student described as below:
Data members/instance variables: name, age, m1, m2, m3 (marks in 3 subjects), maximum,
average
Member methods :
(i) A input method to accept the details of user input.
(ii) To compute the average and the maximum out of three marks.
(iii)To display the name, age, marks in three subjects, maximum and average.
Write a main method to create an object of a class and call the above member methods.?*/
import java.util.Scanner;

class Test1
{
    String name;
    int age;
    double m1, m2, m3, average, temp;
    void input(String nam, int a, double x, double y, double z)
    {
        name = nam;
        age = a;
        m1 = x;
        m2 = y;
        m3 = z;
    }
    void calculate()
    {
        average = (m1+m2+m3)/3;
        if(m1>m2 && m1>m3)
        {
            temp = m1;
        }
        else if(m2>m1 && m2>m3)
        {
            temp = m2;
        }
        else
        {
            temp = m3;
        }
    }
    void display()
    {
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
        System.out.println("Marks1 = "+m1);
        System.out.println("Marks2 = "+m2);
        System.out.println("Marks3 = "+m3);
        System.out.println("Maximum = "+temp);
        System.out.println("Average = "+average);
    }
}
public class JSampleCode004
{
    public static void main(String[] args)
    {
        Test1 obj = new Test1();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String p = sc.nextLine();
        System.out.print("Enter age: ");
        int q = sc.nextInt();
        System.out.print("Enter marks1: ");
        double r = sc.nextDouble();
        System.out.print("Enter marks2: ");
        double s = sc.nextDouble();
        System.out.print("Enter marks3: ");
        double t = sc.nextDouble();
        obj.input(p,q,r,s,t);
        obj.calculate();
        obj.display();
    }
}

