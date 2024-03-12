import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assigment {
  public static void main(String[] args) {
    // Set the path to your ChromeDriver executable
    System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

    // Create a new instance of the ChromeDriver
    WebDriver driver = new ChromeDriver();

    // Navigate to the MakeMyTrip railways page
    driver.get("https://www.makemytrip.com/railways/");

    // Check if you have landed on the correct page
    String expectedTitle = "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday";
    if (driver.getTitle().equals(expectedTitle)) {
      System.out.println("Landed on the correct page");
    } else {
      System.out.println("Not on the expected page");
    }

    // Print the URL and Title of the page
    System.out.println("Current URL: " + driver.getCurrentUrl());
    System.out.println("Current Title: " + driver.getTitle());

    // Click on FROM and enter the city (assuming there's an element with id
    // 'fromCity')
    WebElement fromElement = driver.findElement(By.id("fromCity"));
    fromElement.click();
    fromElement.sendKeys("DELHI");

    // Click on TO and enter the city (assuming there's an element with id 'toCity')
    WebElement toElement = driver.findElement(By.id("toCity"));
    toElement.click();
    toElement.sendKeys("LUCKNOW");

    // Click on Travel Date and select a date (assuming there's an element with id
    // 'travelDate')
    WebElement travelDateElement = driver.findElement(By.id("travelDate"));
    travelDateElement.click();
    // Code to select the date from the date picker

    // Click on class and select a class from dropdown (assuming there's an element
    // with id 'classDropdown')
    WebElement classDropdown = driver.findElement(By.id("classDropdown"));
    Select select = new Select(classDropdown);
    select.selectByVisibleText("Third AC");

    // Click on SEARCH Button (assuming there's an element with id 'searchButton')
    WebElement searchButton = driver.findElement(By.id("searchButton"));
    searchButton.click();

    // Close the browser
    driver.quit();
  }
}
