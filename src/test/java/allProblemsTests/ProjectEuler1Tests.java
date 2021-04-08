package allProblemsTests;

import allProblems.ProjectEulerImpl1;
import org.junit.Assert;
import org.junit.Test;


public class ProjectEuler1Tests {

    @Test
    public void testProject2RunMethod() {
       Assert.assertEquals ("33165", new ProjectEulerImpl1 ().run ());
    }
}
