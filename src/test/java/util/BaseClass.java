package util;

import org.openqa.selenium.WebDriver;

public class BaseClass {

	protected static WebDriver driver;


	public BaseClass(WebDriver driver) {

		BaseClass.driver = driver;

	}


}
