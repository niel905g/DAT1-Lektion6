package Mathias;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Indtast et tal");
        int tal = input.nextInt();


        if (tal % 5 == 0 && tal % 2 == 0)   {
            System.out.println(" HighTWO");

        }
        else if (tal % 5 == 0) {
            System.out.println(" HiFive");
        }

        else if (tal % 2 == 0) {
            System.out.println(" HiEven ");
        }
          else System.out.println(" Du har indtastet noget som ikke gir mening ...");













    }
}
