package stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {
    public static final Logger logger = LogManager.getLogger(Demo.class);

    @Test
    public void test1(){
        String name = "Apoorv";
        Assert.assertEquals("Apoorv",name);
    }
}
