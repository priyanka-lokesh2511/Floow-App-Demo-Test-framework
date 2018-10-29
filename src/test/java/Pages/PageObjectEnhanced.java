package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.core.pages.PageObject;

public class PageObjectEnhanced extends PageObject {

	public PageObjectEnhanced(AndroidDriver<MobileElement> driver) {
		super(driver);
		driver.manage().window().maximize();
	}

	protected MobileElement findByCSS(String css) {
		return (MobileElement) super.getDriver().findElement(By.cssSelector(css));
	}
	
	protected MobileElement findByXpath(String xpath) {
		return (MobileElement) super.getDriver().findElement(By.xpath(xpath));
	}
	
	protected MobileElement findByClass(String className) {
		return (MobileElement) super.getDriver().findElement(By.className(className));
	}
	
	protected MobileElement findById(String id) {
		return (MobileElement) super.getDriver().findElement(By.id(id));
	}
	
	//Checks that page is loaded
	
	protected void javaScriptClick(MobileElement element) {
		JavascriptExecutor myExecutor = ((JavascriptExecutor) getDriver());
		myExecutor.executeScript("arguements[0].click();",element);
	}

}
