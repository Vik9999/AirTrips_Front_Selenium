package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumTest {
	public static void main(String[] args) {



			System.setProperty("webdriver.chrome.driver", "/Users/Victor.Irimies/Downloads/chromedriver_win32/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://localhost:3000");
			roundTripBookFlight(driver);
		    //oneWayBookFlight(driver);

		}

		public static void roundTripBookFlight(WebDriver driver){
			WebElement roundTripButton = driver.findElement(By.xpath("/html/body/div/section/main/div/div[2]/form/div/div[1]/div/div[1]/div/label/span/input"));
			roundTripButton.click();

			WebElement originBar = driver.findElement(By.xpath("/html/body/div/section/main/div/div[2]/form/div/div[2]/div/div/div[1]/div/div/div[1]/div/div[1]/span"));
			originBar.click();

			WebElement originCountry = driver.findElement(By.xpath("/html/body/div[2]/div/div[13]/span"));
			originCountry.click();

			WebElement dest = driver.findElement(By.xpath("/html/body/div[1]/section/main/div/div[2]/form/div/div[2]/div/div/div[2]/div/div/div[2]/div/input"));
			dest.sendKeys("Changwon");

			WebElement dest2 = driver.findElement(By.cssSelector("#destination-id-listbox > div > span"));
			dest2.click();

			WebElement calendar = driver.findElement(By.xpath("/html/body/div[1]/section/main/div/div[2]/form/div/div[2]/div/div/div[3]/div/div"));
			calendar.click();

			WebElement departureDate = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div[2]/div[1]/div[2]/div/div[2]/div[6]/div/span"));
			departureDate.click();

			WebElement returnDate = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div[2]/div[1]/div[2]/div/div[3]/div[4]/div/span"));
			returnDate.click();

			WebElement okButton = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/button"));
			okButton.click();

			WebElement searchButton = driver.findElement(By.xpath("/html/body/div/section/main/div/div[2]/form/div/div[3]/button"));
			searchButton.click();
		}



	/*public static void oneWayBookFlight(WebDriver driver){
		WebElement roundTripButton = driver.findElement(By.name("/html/body/div/section/main/div/div[2]/form/div/div[1]/div/div[2]/div/label/span"));
		roundTripButton.click();

			WebElement originBar = driver.findElement(By.xpath("/html/body/div/section/main/div/div[2]/form/div/div[2]/div/div/div[1]/div/div/div[1]/div/div[1]/span"));
			originBar.click();

			WebElement originCountry = driver.findElement(By.xpath("/html/body/div[2]/div/div[13]/span"));
			originCountry.click();

			WebElement dest = driver.findElement(By.xpath("/html/body/div[1]/section/main/div/div[2]/form/div/div[2]/div/div/div[2]/div/div/div[2]/div/input"));
			dest.sendKeys("Changwon");

			WebElement dest2 = driver.findElement(By.cssSelector("#destination-id-listbox > div > span"));
			dest2.click();

		WebElement calendar = driver.findElement(By.xpath("/html/body/div[1]/section/main/div/div[2]/form/div/div[2]/div/div/div[3]/div/div"));
		calendar.click();

		WebElement departureDate = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div[2]/div[1]/div[2]/div/div[4]/div[2]"));
		departureDate.click();


		WebElement okButton = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/button"));
		okButton.click();

		WebElement searchButton = driver.findElement(By.xpath("/html/body/div/section/main/div/div[2]/form/div/div[3]/button"));
		searchButton.click();
	}

	 */




	}


