package opi;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String section;
        System.out.println("Enter Section: ");
        section = input.nextLine();
        System.out.println("Section: "+section);
        Info info = new Info();
        System.out.println("Name: "+info.name);
        System.out.println("ID: "+info.id);
        Hobby hobby = new Hobby();
        System.out.println("Hobby: "+hobby.hobbyName);
    }
}
/*
    Maherab Hossen Opi
    2012020104
    C
    cse_2012020104@lus.ac.bd
    16 july 2021
 */