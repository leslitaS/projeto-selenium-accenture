package runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = "steps"
        //,tags = "@Test"
        //,tags = "@Site"
        //,tags = "@Vaga"
        ,plugin = {"pretty", "html:target/cucumber-reports.html"}
)
public class RunnerTeste {

}
