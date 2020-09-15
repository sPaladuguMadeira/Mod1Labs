package madeira.cs2;

import java.util.Scanner;

        /**
        * Author: SAANVI_PALADUGU
        * 9/10/2020
        **/

public class Lab2 {
        /*
            Grades and comments

            10/10
            Well done, add comments for extra clarity
         */
        public static void main(String[] args) {

            // Part I code below

            Scanner scan = new Scanner(System.in);
            System.out.print("Enter name: ");
            String name = scan.nextLine();
            System.out.println(name);

            System.out.println("How are you " + name + "?");

            //Part II code below

            System.out.print("Enter favorite artist: ");
            String theName = scan.nextLine();
            System.out.println(theName);
            System.out.println("Silence by " + theName);

            //Part III code below

            System.out.print("Enter your age: ");
            int myAge = scan.nextInt();
            int intResult = myAge * 365;
            System.out.println(intResult);


        }
}
