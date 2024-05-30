package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import static stepdefinitions.LoginSD.driver;
public class Hooks {


    @Before
    public void beforeScenario()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Before ("@login")
    public void beforeLogin()
    {

    }

    @After
    public void afterScenario()
    {
        driver.close();
    }
}
