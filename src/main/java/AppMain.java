import allProblems.ProjectEulerImpl1;
import allProblems.ProjectEulerImpl2;
import allProblems.ProjectEulerImpl3;

import java.util.Scanner;

public class AppMain {

    public static void main(String[] args) {
        Boolean next = true;
        while (next) {
            System.out.println ("\nEnter you choice to execute the Euler problem [1,2 or 3]\n" +
                    "1:PE-01 -> \tMultiples of 3 and 5\n" +
                    "2:PE-22 -> \tNames scores\n" +
                    "3:PE-28 -> \tNumber spiral diagonals\n" +
                    "4:Exit\n");
            Scanner myChoice = new Scanner (System.in);
            String problemChoice = myChoice.nextLine ();
            System.out.println ("Problem choice made is: " + problemChoice);

            switch (problemChoice) {
                case "1":
                    System.out.println ("sum of all the multiples of 3 or 5 below 1000 is:" + new ProjectEulerImpl1 ().run ());
                    break;
                case "2":
                    System.out.println ("total of all the name scores in the file is:" + new ProjectEulerImpl2 ().run ());
                    break;
                case "3":
                    System.out.println (" sum of the numbers on the diagonals in a 1001 by 1001 spiral formed is:" + new ProjectEulerImpl3 ().run ());
                    break;
                case "4":
                    System.out.println ("Exiting... thank you.");
                    next = false;
                    break;
                default:
                    System.out.println ("Problem choice made is: " + "incorrect");
            }


        }
    }


}
