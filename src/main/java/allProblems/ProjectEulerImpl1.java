package allProblems;

 /*
   * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

   * Find the sum of all the primes below two million.
 */

import util.Helpers;
import util.Constants;

public class ProjectEulerImpl1 implements ProjectEuler {

    public String run() {
        long startTime = System.nanoTime ();
        if(Constants.LIMIT >= 2) {
            int sum = 2;
            for (int i = 3; i <= Constants.LIMIT; i++)
                if (Helpers.isPrime (i))
                    sum += i;

            long endTime = System.nanoTime ();
            long durationInNano = (endTime - startTime);  //in millis
            System.out.println ("\nTime Taken in nano" + durationInNano);
            return Integer.toString (sum);
        }
        else
            return ("Give positive numbers greater than 2- Invaild LIMIT");
    }
}

