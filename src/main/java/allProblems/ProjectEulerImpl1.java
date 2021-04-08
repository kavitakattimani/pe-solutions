package allProblems;

 /*
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 */

import util.peConstants;

public class ProjectEulerImpl1 implements ProjectEuler {

    public String run() {
        long startTime = System.nanoTime ();
        int sum = 0;
        for (int i = 0; i <= peConstants.LIMIT; i++)
            //Check if the numbers are divisible by 3 or 5 and add to sum
            if (i % 3 == 0 && i % 5 == 0)
                sum += i;
        long endTime = System.nanoTime ();
        long durationInNano = (endTime - startTime);  //in millis
        System.out.println ("\nTime Taken in nano" + durationInNano);
        return Integer.toString (sum);

    }
}

