package util;

import org.junit.Assert;
import org.junit.Test;

public class HelpersTest {

    @Test
    public void isPrime() {
       Assert.assertTrue (Helpers.isPrime (2));
    }

    @Test
    public void isNotPrime() {
        Assert.assertFalse (Helpers.isPrime (20));
    }

    @Test
    public void isOnePrime() {
        Assert.assertTrue (Helpers.isPrime (1));
    }
}
