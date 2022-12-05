package xeCurrency_pro;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.Chart_page;
import pages.Convert_page;

public class Stepdefinition {

	private WebDriver driver = Hooks.driver;

	double conversionValue;
	double chartConversionValue;
	String title;

	@Given("^open the webpage and check title$")
	public void open_the_webpage_and_check_title() throws Throwable {
		title = driver.getTitle();
		System.out.println(driver.getTitle());

	}

	@Given("^The title should contain \"([^\"]*)\"$")
	public void the_title_should_contain(String arg1) throws Throwable {

		Assert.assertEquals(title, arg1);
	}

	@When("^set \"([^\"]*)\" value   and \"([^\"]*)\" value in convert page$")
	public void set_value_and_value_in_convert_page(String arg1, String arg2) throws Throwable {
		Convert_page cp = new Convert_page(driver);
		System.out.println(arg1 + "  " + arg2);
		cp.selectfromAndTOCurrency(arg1, arg2);
	}

	@When("^click convert button$")
	public void click_convert_button() throws Throwable {
		Convert_page cp = new Convert_page(driver);
		cp.clickConvertbtn();
	}

	@Then("^get convertion value$")
	public void get_convertion_value() throws Throwable {
		Convert_page cp = new Convert_page(driver);
		conversionValue = cp.getConversionRate();

	}

	@Then("^Go to chart page$")
	public void go_to_chart_page() throws Throwable {
		Chart_page ch = new Chart_page(driver);
		ch.MovetoChartTab();
	}

	@Then("^set \"([^\"]*)\" value   and \"([^\"]*)\" value in chart page$")
	public void set_value_and_value_in_chart_page(String arg1, String arg2) throws Throwable {
		Chart_page ch = new Chart_page(driver);
		ch.selectfromAndTOCurrency(arg1, arg2);
	}

	@Then("^click view chart button$")
	public void click_view_chart_button() throws Throwable {
		Chart_page ch = new Chart_page(driver);
		ch.clickSumbit();
	}

	@Then("^get conversion value from chart page$")
	public void get_conversion_value_from_chart_page() throws Throwable {
		Chart_page ch = new Chart_page(driver);
		chartConversionValue = ch.getConversionRate();
	}

	@Then("^compare conversion value from convert and chart pages$")
	public void compare_conversion_value_from_convert_and_chart_pages() throws Throwable {
		if (conversionValue == chartConversionValue) {
			System.out.println("both values are same");
		} else if (conversionValue > chartConversionValue) {
			System.out.println("both values are different by " + (conversionValue - chartConversionValue));
		} else if (conversionValue < chartConversionValue) {
			System.out.println("both values are different by " + (chartConversionValue - conversionValue));
		}
	}

}
