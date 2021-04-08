package allProblems;


import util.peConstants;

import static java.lang.Integer.SIZE;

/*

 * From the diagram, let's observe the four corners of an n * n square (where n is odd).

 * It's not hard to convince yourself that the top right corner always has the value n^2.

 * Working counterclockwise (backwards), the top left corner has the value n^2 - (n - 1),

 * the bottom left corner has the value n^2 - 2(n - 1), and the bottom right is n^2 - 3(n - 1).

 * Putting it all together, this outermost ring contributes 4n^2 - 6(n - 1) to the final sum.

 *

 * Incidentally, the closed form of this sum is (4m^3 + 3m^2 + 8m - 9) / 6, where m = size.

 */


public class ProjectEulerImpl3 implements ProjectEuler {

    public String run() {
        long startTime = System.nanoTime ();
        long sum = 1;  // Special case for size 1
        //
        for (int n = 3; n <= peConstants.SIZE; n += 2)
            sum += 4 * n * n - 6 * (n - 1);

        long endTime = System.nanoTime ();
        long durationInNano = (endTime - startTime);  //in millis
        System.out.println ("\nTime Taken in nano" + durationInNano);
        return Long.toString (sum);

    }

}

