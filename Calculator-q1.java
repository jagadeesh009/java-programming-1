
/*Design a Calculator class which contains four lambda methods:

a. add(a, b)
b. difference(a, b)
c. product(a, b)
d. safeDivision(a, b)
Also design the main methods which pass actual parameters to test the Calculator class.*/
import java.util.Scanner;
interface cal
{
    int operator(int a,int b);
}
class Calculator
{
    public static void main(String[] args)
    {
       
        cal addition= (int a, int b)-> a+b;
        cal difference=(int a, int b)-> a-b;
        cal product=(int a, int b)-> a*b;
        cal safeDivision=(int a, int b)-> a/b;

        System.out.println("1.Addition\n2.Difference\n3.Product\n4.SafeDivision");
        System.out.println("Enter the number to choose the operation");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n)
        {
            case 1:System.out.println("Addition = "+addition.operator(10,4));
            break;
            case 2:System.out.println("Difference = "+difference.operator(18,13));
            break;
            case 3:System.out.println("Product = "+product.operator(7,6));
            break;
            case 4:System.out.println("SafeDivision = "+safeDivision.operator(25,5));
            break;
        }
    }
}
