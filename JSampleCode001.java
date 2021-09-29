/*An electronic shop has announced the special discount on purchase of laptops as given below:

Category Discount on laptop
UptoRs 25000 5.0%
25001 – 50000 7.5%
50001 - 1,00,000 10.0%
More than 1,00,000 15.0%

Define a class laptop described as below:
Data Members/Instant variables: Name, price, dis, amt
Member Methods:
I. An input method to initialize the data members.
II. To compute the discount
III. To display the name, discount and amount to be paid after discount.?*/
import java.util.Scanner;

class tech
{
    String Name;
    int price;
    double dis, amt;
    void input(String a, int b)
    {
        Name = a;
        price = b;
    }
    void calculate()
    {
        if(price<=25000)
        {
            dis = 5;
        }
        else if(price>25000 && price<=50000)
        {
            dis = 7.5;
        }
        else if(price>50000 && price<= 100000)
        {
            dis = 10;
        }
        else if(price > 100000)
        {
            dis = 15;
        }
        amt = price - ((dis/100)*price);
    }
    void display()
    {
            System.out.println("Name: "+Name);
            System.out.println("Discount: "+dis+"%");
            System.out.println("Amount to be paid after discount: "+amt);
    }
}
public class JSampleCode001
{
    public static void main(String[] args)
    {
        tech obj = new tech();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String x = sc.nextLine();
        System.out.print("Enter price: ");
        int y = sc.nextInt();
        obj.input(x,y);
        obj.calculate();
        obj.display();
    }
}
