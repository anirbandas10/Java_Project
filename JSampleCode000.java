/*Define a class Employee described as below:
Data members/ Instant Variable : name , empno, basic, da, hra, pf, gross, net
Member’s methods:
I. A input method to initialize the data members
II. To compute the gross salary and net salary as:
Da= 30% of basic , Hra= 15% of basic
Pf= 12% of basic ,Gross= basic + hra + da.
Net= gross - pf
III. To display the name, empno, gross salary, net salary.
Write a main method to create an object of a class and call the above member methods.?*/
import java.util.Scanner;

class emp
{
    String name;
    int empno;
    double basic, da, hra, pf, gross, net;
    void input(String a, int b, double c)
    {
        name = a;
        empno = b;
        pf = c;
        basic = c;
    }
    void calculate()
    {
        da = (30*basic)/100;
        hra = (15*basic)/100;
        pf = (12*basic)/100;
        gross = basic + da + hra;
        net = gross - pf;
    }
    void display()
    {
            System.out.println("Name: "+name);
            System.out.println("Employee Number: "+empno);
            System.out.println("Gross Salary: "+gross);
            System.out.println("Net Salary: "+net);
    }
}
public class JSampleCode000
{
    public static void main(String[] args)
    {
        emp obj = new emp();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String x = sc.nextLine();
        System.out.print("Enter employee number: ");
        int y = sc.nextInt();
        System.out.print("Enter basic: ");
        double z = sc.nextDouble();
        obj.input(x,y,z);
        obj.calculate();
        obj.display();
    }
}