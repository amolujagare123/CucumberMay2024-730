package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSD {
    public static WebDriver driver;
    @Given ("I am on login page")
    public void onLoginPage()
    {
        System.out.println("I am on login page");

        driver.get("https://stock.scriptinglogic.in/");


    }

    @When("I enter correct username and password")
    public void i_enter_correct_username_and_password() {
        System.out.println("I enter correct username and password");

        driver.findElement(By.id("login-username")).sendKeys("admin");
        driver.findElement(By.id("login-password")).sendKeys("admin");
    }

    @When("I click on login button")
    public void i_click_on_login_button() {
        System.out.println("I click on login button");
        driver.findElement(By.name("submit")).click();
    }

   @Then("I should be on dashboard")
    public void i_should_be_on_dashboard() {
        System.out.println("I should be on dashboard");

        String expected = "https://stock.scriptinglogic.org/dashboard.php";
        String actual = driver.getCurrentUrl();

        Assert.assertEquals("This is not a dashboard",expected,actual);

    }

    @When("I enter incorrect username and password")
    public void iEnterIncorrectUsernameAndPassword() {
        driver.findElement(By.id("login-username")).sendKeys("dsdsd");
        driver.findElement(By.id("login-password")).sendKeys("dsdsds");

    }

    @Then("I should get an error message")
    public void iShouldGetAnErrorMessage() {
        String expected = "POSNIC - Login to";
        String actual = driver.getTitle();

        Assert.assertEquals("incorrect or no error message",
                expected,actual);
    }

    @When("I enter blank username and password")
    public void iEnterBlankUsernameAndPassword() {

        driver.findElement(By.id("login-username")).sendKeys("");
        driver.findElement(By.id("login-password")).sendKeys("");

    }



    @When ("I enter {string} and {string} as username and password")
    public void enterUsernamePassword(String username,String password)
    {
        driver.findElement(By.id("login-username")).sendKeys(username);
        driver.findElement(By.id("login-password")).sendKeys(password);
    }

    @Given("I open the browser")
    public void iOpenTheBrowser() {
        driver = new ChromeDriver();
    }

    @And("I maximize it")
    public void iMaximizeIt() {
        driver.manage().window().maximize();
    }
}
