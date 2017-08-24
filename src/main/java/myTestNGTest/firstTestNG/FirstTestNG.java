package myTestNGTest.firstTestNG;

import org.junit.AfterClass;
import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Walter on 2017/6/19.
 */
public class FirstTestNG {
    @BeforeClass
    public void beforeClass() {
        System.out.println("this is before class");
    }

    @Test
    public void TestNgLearn() {
        System.out.println("this is TestNG test case");
        Assert.assertEquals(1, 1);
    }

    @AfterClass
    public void afterClass() {
        System.out.println("this is after class");
    }
}
