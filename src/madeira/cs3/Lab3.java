package madeira.cs3;

import java.util.Scanner;

        /**
         * Author: SAANVI_PALADUGU
         * 9/17/2020
         **/d

        public class Lab3 {
            /*
                Grades and comments below
                -------------------------
                Saanvi -
                Good work here. The first two parts are great. Well organized code.
                To get extra fancy next time, try allowing the user to input
                lowercase or all uppercase months. For the last part, I mentioned in class
                that the goal was to calculate the number of days they've lived based on the current
                date, not to repeat the calculation from the last lab.


            */
            public static void main(String [] args) {

                // Part I code below

                Scanner scan = new Scanner(System.in);
                System.out.print("Enter your age: ");
                int Age = scan.nextInt();
                 if(Age >= 16) {
                     System.out.println("Congrats! You are permitted to drive!");
                 }
                 else if(Age <= 16)
                     System.out.println("Sorry! You are not permitted to drive.");
                 if(Age >= 18) {
                     System.out.println("Congrats! You are permitted to get a tattoo!");
                 }
                 else if(Age <= 18)
                     System.out.println("Sorry! You are not permitted to get a tattoo.");
                 if(Age >= 35) {
                     System.out.println("Congrats! You are permitted to run for President of the United States!");
                 }
                 else if(Age <= 35)
                     System.out.println("Sorry! You are not permitted to run for President of the United States.");

                 // Part II code below

                System.out.print("Enter your birthday month: ");
                String Birth = scan.next();
                if(Birth.equals("January")){
                    System.out.println("Your zodiac sign is Capricorn.");
                    System.out.println("The season of your birthday month is Winter.");
                    System.out.println("There are 31 days in your birthday month.");
                }
                else if(Birth.equals("February")){
                    System.out.println("Your zodiac sign is Aquarius.");
                    System.out.println("The season of your birthday month is Winter.");
                    System.out.println("There are 28 (or 29 on Leap Year) days in your birthday month.");
                }
                else if(Birth.equals("March")){
                    System.out.println("Your zodiac sign is Pisces.");
                    System.out.println("The season of your birthday month is Spring.");
                    System.out.println("There are 31 days in your birthday month.");
                }
                else if(Birth.equals("April")){
                    System.out.println("Your zodiac sign is Aries.");
                    System.out.println("The season of your birthday month is Spring.");
                    System.out.println("There are 30 days in your birthday month.");
                }
                else if(Birth.equals("May")){
                    System.out.println("Your zodiac sign is Taurus.");
                    System.out.println("The season of your birthday month is Spring.");
                    System.out.println("There are 31 days in your birthday month.");
                }
                else if(Birth.equals("June")){
                    System.out.println("Your zodiac sign is Gemini.");
                    System.out.println("The season of your birthday month is Summer.");
                    System.out.println("There are 30 days in your birthday month.");
                }
                else if(Birth.equals("July")){
                    System.out.println("Your zodiac sign is Cancer.");
                    System.out.println("The season of your birthday month is Summer.");
                    System.out.println("There are 31 days in your birthday month.");
                }
                else if(Birth.equals("August")){
                    System.out.println("Your zodiac sign is Leo.");
                    System.out.println("The season of your birthday month is Summer.");
                    System.out.println("There are 31 days in your birthday month.");
                }
                else if(Birth.equals("September")){
                    System.out.println("Your zodiac sign is Virgo.");
                    System.out.println("The season of your birthday month is Autumn.");
                    System.out.println("There are 30 days in your birthday month.");
                }
                else if(Birth.equals("October")){
                    System.out.println("Yor zodiac sign is Libra.");
                    System.out.println("The season of your birthday month is Autumn.");
                    System.out.println("There are 31 days in your birthday month.");
                }
                else if(Birth.equals("November")){
                    System.out.println("Your zodiac sign is Scorpio.");
                    System.out.println("The season of your birthday month is Autumn.");
                    System.out.println("There are 30 days in your birthday month.");
                }
                else if(Birth.equals("December")){
                    System.out.println("Your zodiac sign is Saggitarius.");
                    System.out.println("The season of your birthday month is Winter.");
                    System.out.println("There are 31 days in your birthday month.");
                }

                // Part III code below
                /*

                    Like I mentioned in class, the goal was not to calculate age * 365
                    You were meant to compare the age to the current date and
                    find a more accurate estimate than age * 365

                */
                System.out.println("You have been alive for "+Age*365+ " days. :)");

            }

}


