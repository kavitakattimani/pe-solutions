package allProblemsTests;

import allProblems.ProjectEulerImpl3;
import org.junit.Assert;
import org.junit.Test;


public class ProjectEuler3Tests {

    @Test
    public void testProject1RunMethod() {
        Assert.assertEquals ("20381", new ProjectEulerImpl3 ().run ());
    }
}
