import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MobilePayment {


    By phoneNumber = By.xpath("//input[@data-qa-node='phone-number']");
    By amount = By.xpath("//input[@data-qa-node='amount']");
    By debitCard = By.xpath("//input[@data-qa-node='numberdebitSource']");
    By expiredDate = By.xpath("//input[@data-qa-node='expiredebitSource']");
    By cvv = By.xpath("//input[@data-qa-node='cvvdebitSource']");
    By firstName = By.xpath("//input[@data-qa-node='firstNamedebitSource']");
    By lastName = By.xpath("//input[@data-qa-node='lastNamedebitSource']");
    By submitButton = By.xpath("//button[@data-qa-node='submit']");




 @Test
 public void checkMinPaymentSum() {
  System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

  driver.get("https://next.privat24.ua/mobile");
  driver.findElement(phoneNumber).sendKeys("686979712");
  driver.findElement(amount).clear();
  driver.findElement(amount).sendKeys("1");
  driver.findElement(debitCard).sendKeys("44159115449003");
  driver.findElement(expiredDate).sendKeys("1224");
  driver.findElement(cvv).sendKeys("123");
  driver.findElement(firstName).sendKeys("Philipp");
  driver.findElement(lastName).sendKeys("McCauley");
  driver.findElement(submitButton).submit();








 }
}
