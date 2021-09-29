/*Write a class program with the following specification:
Class name : Profit_Loss
Data members/instant Variable : double cp, sp
Member methods:
input () : to initialize cp, sp
void calculate () : to calculate either profit percent or loss percentage.
void display() : to display either profit percentage or loss percentage.
Write a main method to create an object of a class and call the above member methods.?*/
import java.util.Scanner;

class Test2
{
    int cp, sp, num;
    double temp;
    void input(int c, int s)
    {
        cp = c;
        sp = s;
    }
    void calculate()
    {
        num = sp - cp;
        temp = (num*100)/cp;
    }
    void display()
    {
        if(num>0)
        {
            System.out.println("Profit Percentage: "+temp+"%");
        }
        else
        {
            System.out.println("Loss Percentage: "+temp+"%");
        }
    }
}
public class JSampleCode002
{
    public static void main(String[] args)
    {
        Test2 obj = new Test2();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost prize: ");
        int a = sc.nextInt();
        System.out.print("Enter the selling prize: ");
        int b = sc.nextInt();
        obj.input(a,b);
        obj.calculate();
        obj.display();
    }
}
