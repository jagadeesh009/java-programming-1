/*Write a program, creating a class containing the generic method which accepts only numbers,
 generating a custom exception when passed with the String value.The functionality of the
  generic method is to print the 2/3 of the passed value.*/

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Method {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n= sc.nextInt();
        ArrayList<Integer> list= new ArrayList<>(n);
        int a;
        for(int i=1;i<=n;i++) {
            try
            {
                a=sc.nextInt();
            }catch (InputMismatchException e) {
                System.out.println("enter only Integer values");
                break;
            }
            list.add(a);
        }
        for (Integer integer : list)
        {
           
            System.out.println((0.67)*integer + " ");
        }
    }
}
