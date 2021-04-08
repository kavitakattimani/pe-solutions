package allProblemsTests;

import allProblems.ProjectEulerImpl2;
import org.junit.Assert;
import org.junit.Test;


public class ProjectEuler2Tests {

    @Test
    public void testProject1RunMethod() {
        Assert.assertEquals ("863833348", new ProjectEulerImpl2 ().run ());
    }
}
