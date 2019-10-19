package testRunner;

import common.CommonAPI;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue= {"stepDefinations"})

public class NetflixTestRunner extends CommonAPI {

}
