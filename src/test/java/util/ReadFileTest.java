package util;

import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;

public class ReadFileTest {

    @Test
    public void testGetNames() {
       Assert.assertTrue (!ReadFile.getnames ("/projects/pe/src/main/resources/names.txt").isEmpty ());
    }

    @Test(expected = FileNotFoundException.class)
    public void testGetNamesException() {
        ReadFile.getnames ("/projects/pe/src/main/resources/names3.txt");
    }

}
