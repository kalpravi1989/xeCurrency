package pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.BaseClass;

public class Convert_page extends BaseClass {

	public Convert_page(WebDriver driver) {

		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='midmarketFromCurrency']")
	WebElement from;

	@FindBy(xpath = "//ul[@id='midmarketFromCurrency-listbox']/li/div/span[@class='description']/parent::div")
	List<WebElement> fromList;

	@FindBy(xpath = "//input[@id='midmarketToCurrency']")
	WebElement to;

	@FindBy(xpath = "//ul[@id='midmarketToCurrency-listbox']/li/div/span[@class='description']/parent::div")
	List<WebElement> toList;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement convertBtn;

	@FindBy(xpath = "//p[@class='result__BigRate-sc-1bsijpp-1 iGrAod']")
	WebElement conversionrate;


	public void selectfromAndTOCurrency(String fromCur, String toCur) throws InterruptedException {
		Thread.sleep(5000);

		from.click();
		for (WebElement fromele : fromList) {

			if (fromele.getText().contains(fromCur)) {
				fromele.click();
				break;
			}
		}
		to.click();
		for (WebElement toele : toList) {

			if (toele.getText().contains(toCur)) {
				toele.click();
				break;
			}
		}

	}

	public void clickConvertbtn() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		convertBtn.click();
	}

	public double getConversionRate() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(conversionrate));
		Thread.sleep(5000);
		String rate = conversionrate.getText();
		System.out.println(rate);
		String rate1 = rate.replaceAll("[^0-9.]", "");
		double convertRate = Double.valueOf(rate1);
		System.out.println(convertRate);
		return convertRate;

	}

}
