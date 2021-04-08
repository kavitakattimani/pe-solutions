package allProblems;

import util.ReadFile;
import java.util.Collections;
import java.util.List;

 /*
 *
 * Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.

 * For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.

 * What is the total of all the name scores in the file?
 *
 */

public final class ProjectEulerImpl2 implements ProjectEuler {

    public String run() {
        long startTime = System.nanoTime();
        //Read from file the names and put into list
        List<String> names = ReadFile.getnames ("/projects/pe/src/main/resources/names.txt");
        //Sort the list using inbuilt functions
        Collections.sort(names);
        int sum = 0;
        System.out.println("\nSize of List is " + names.size ());
        for (int i = 0; i < names.size (); i++) {
            int value = 0;
            //Find each name sum by iterating through each char
            for (int j = 0; j < names.get(i).length (); j++)
                value += names.get(i).charAt (j) - 'A' + 1;
            //Total sum calculated
            sum += value * (i + 1);
        }
        long endTime = System.nanoTime();
        long durationInNano = (endTime - startTime);  //in millis
        System.out.println ("\nTime Taken in nano"+ durationInNano);
        return Integer.toString (sum);
    }
}