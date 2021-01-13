package com.tts;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        // write your code here
 /*       {
 /*         System.out.println("This is working so far");
            Scanner input = new Scanner(System.in);
 /*           System.out.println("Please enter your name:");
            String name = input.nextLine();
            */

            System.out.println("***Let's see some Ascii Values***");



        {
            char AsciiChars  = 'A';
            int n = AsciiChars;
            System.out.println("Let's start with the Ascii Values of capital A-Z ");// + " it will be: " + n);
           Scanner input = new Scanner(System.in);

            char CapitalChar = 'A';
            char SmallChar = 'a';

            // finding the ascii value from A-Z

            for (int i = 'A'; i <= 'Z'; i++) {
                System.out.println((CapitalChar + " : " + (i)));
                CapitalChar++;
                System.out.println("Upper Case Letter Ascii Value: ");
            }
            System.out.println("***End of Upper Case Values***");
            System.out.println("");
            // finding the ascii value from a-z
            System.out.println("...Lower Case Values Start Here... ");
            for (int i = 'a'; i <= 'z'; i++) {
                System.out.println(SmallChar + " : " + (i));
                SmallChar++;

            }
            System.out.println("...Lower Case Letter Values End Here...");
            System.out.println("");
            {

                System.out.println("Please enter your name:");
                String name = input.nextLine();
                System.out.printf("Hello %s!\n", name);
            }
            {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Would you like to continue to the interactive portion?");
                String someString = scanner.next();

                //boolean Question1 = true;
                //System.out.println(Question1);

                //answerQuestion(String answer) {
                String msg = "";
                switch (someString) {
                    case "y":
                    case "Y":
                        msg = "Take me to the next section ";
                        break;
                    case "n":
                    case "N":
                        msg = "Thanks anyway ";
                        break;
                    default:
                        msg = "You chose not to continue ";
                        break;
                }
                System.out.println(msg);
                {
                    Scanner userInput = new Scanner(System.in);
                    System.out.println("What is your lucky number? ");
                    String name = userInput.nextLine();
                    System.out.println("What is the jersey number of your favorite quaterback? ");
                    String jersey = userInput.nextLine();
                    System.out.println("What is the two-digit model of your car? ");
                    String car = userInput.nextLine();
                    System.out.println("What is the first name of your favorite actor or actress? ");
                    String actor = userInput.nextLine();
                    System.out.println("Enter a random number between 1 and 50 ");
                    String number = userInput.nextLine();
                }
                System.out.println("");
                System.out.println("Here are your LUCKY lottery numbers:");
                    Random random = new Random();
                    int aa = random.nextInt(75);


                int a = random.nextInt(65) +1;
                int b = random.nextInt(65) +1;
                int c = random.nextInt(65) +1;
                int d = random.nextInt(65) +1;
                int e = random.nextInt(65) +1;
                    System.out.printf("This is your Magic Ball first %s!\n", aa);
                    System.out.println(a);
                    System.out.println(b);
                    System.out.println(c);
                    System.out.println(d);
                    System.out.println(e);


            }
        }
    }
}





