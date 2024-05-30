package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static stepdefinitions.LoginSD.driver;

public class UserRegistration {


    @Given("I am on user registration page")
    public void i_am_on_user_registration_page() {

        System.out.println("I am on user registration page");


        driver.get("https://demo.automationtesting.in/Register.html");

    }
    @When("I enter below Data")
    public void i_enter_below_data(DataTable dataTable) {

        List<List<String>> data = dataTable.asLists();

        System.out.println("first name="+data.get(0).get(0));
        System.out.println("last name="+data.get(0).get(1));
        System.out.println("address="+data.get(0).get(2));
        System.out.println("email="+data.get(0).get(3));
        System.out.println("phone="+data.get(0).get(4));

        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(data.get(0).get(0));
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(data.get(0).get(1));
        driver.findElement(By.xpath("//textarea")).sendKeys(data.get(0).get(2));
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys(data.get(0).get(3));
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(data.get(0).get(4));
    }
    @When("I click on submit button")
    public void i_click_on_submit_button() {

        System.out.println("I click on submit button");
       }
    @Then("user should be added")
    public void user_should_be_added() {
        System.out.println("user should be added");
      }

    @When("I enter {} , {} , {} , {} , {}")
    public void iEnter(String arg0, String arg1, String arg2, String arg3, String arg4) {

        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(arg0);
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(arg1);
        driver.findElement(By.xpath("//textarea")).sendKeys(arg2);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys(arg3);
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(arg4);

    }
}
