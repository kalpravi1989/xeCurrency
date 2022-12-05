package pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.BaseClass;

public class Chart_page extends BaseClass {

	public Chart_page(WebDriver driver) {

		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(text(),'Charts')]")
	WebElement chartTab;

	public void MovetoChartTab() {
		chartTab.click();
	}

	@FindBy(xpath = "//input[@id='midmarketFromCurrency']")
	WebElement from;

	@FindBy(xpath = "//ul[@id='midmarketFromCurrency-listbox']/li/div/span[@class='description']/parent::div")
	List<WebElement> fromList;

	@FindBy(xpath = "//input[@id='midmarketToCurrency']")
	WebElement to;

	@FindBy(xpath = "//ul[@id='midmarketToCurrency-listbox']/li/div/span[@class='description']/parent::div")
	List<WebElement> toList;

	@FindBy(xpath = "//button[contains(text(),'View chart')]")
	WebElement submit;

	public void selectfromAndTOCurrency(String fromCur, String toCur) throws InterruptedException {

		Thread.sleep(1000);
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

	public void clickSumbit() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		submit.click();
	}

	@FindBy(xpath = "//div[@class='currency-charts__ChartHeader-sc-1kf16vc-2 loAEFi']/div[2]/div")
	WebElement conversionrate1;

	public double getConversionRate() throws InterruptedException {


		Thread.sleep(1000);
		String rate = conversionrate1.getText();
		System.out.println(rate);
		String[] ans = rate.split("=");
		rate = ans[1].replaceAll("[^0-9.]", "");
		double chartRate = Double.valueOf(rate);
		System.out.println(chartRate);
		return chartRate;
	}
}
