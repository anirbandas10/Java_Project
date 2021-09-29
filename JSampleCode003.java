/*Define a class Rectangle having the following description:
Instance variable: length, breadth
Member Methods:
I. A input method to accept the details of an Rectangle
II. void calculate(): To calculate the area, perimeter and diagonals of a rectangle
III. void display() : To print the output data.
Write a main method to create object of a class and call the above methods.? */
import java.util.Scanner;

class Test
{
    double length, breadth, area, perimeter, diagonal;
    void input(final double x, final double y)
    {
        length = x;
        breadth = y;
    }
    void calculate()
    {
        area = length*breadth;
        perimeter = 2*(length+breadth);
        diagonal = Math.sqrt((Math.pow(length,2))+(Math.pow(breadth,2)));
    }
    void display()
    {
        System.out.println("area = "+area);
        System.out.println("perimeter = "+perimeter);
        System.out.println("diagonal = "+diagonal);
    }
}
public class JSampleCode003
{
    public static void main(final String[] args)
    {
        Test obj = new Test();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();
        obj.input(l,b);
        obj.calculate();
        obj.display();
    }
}












