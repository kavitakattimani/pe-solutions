package util;

public class Helpers {

    public static boolean isPrime(int no) {
        if (no > 2) {
            for (int j = 2; j <= (int) Math.sqrt (no); j++)
                if (no % j == 0)
                    return false;

            return true;
        }
        else
        return true;
    }
}
