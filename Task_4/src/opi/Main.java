package opi;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner opi=new Scanner(System.in);
        MyCalculator myCalculator=new MyCalculator();
        System.out.print("Enter the any number to find divisor sum: ");
        int n=opi.nextInt();
        System.out.print("Enter the any number to find Factorial: ");
        int f=opi.nextInt();
        System.out.println("Sum of Divisor "+ n + " is : " +myCalculator.divisorSum(n));
        System.out.println("The Factorial is : "+myCalculator.findFactorial(f));
    }
    /*
    Name: Maherab Hossen Opi
    Id: 2012020104
    Section : C
    Email : cse_2012020104@lus.ac.bd
    Date: 16 October 2021
     */
}
