package Default;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


import Utility.AppLauncher;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;


public class Tester extends AppLauncher {

	/*public static void swipeVertical(AndroidDriver<MobileElement> driver, double startPercentage, double finalPercentage, double anchorPercentage, int duration) throws Exception {
        Dimension size = driver.manage().window().getSize();
        System.out.println(size);
        int anchor = (int) (size.width * anchorPercentage);
        int startPoint = (int) (size.height * startPercentage);
        int endPoint = (int) (size.height * finalPercentage);
        new TouchAction(driver).press(anchor, startPoint).waitAction(Duration.ofMillis(duration)).moveTo(anchor, endPoint).release().perform();
    }*/
	
	public static void main(String[] args) throws Exception {
 
		AppLauncher app = new AppLauncher();
		driver= app.appLaunch();
		LoginTester lt = new LoginTester(driver);
		Thread.sleep(20000);
		lt.getAlreadyRegisteredButton().click();
		/*lt.getEmailIDRegisterField().sendKeys("green@youtube.com");
		driver.hideKeyboard();
		lt.getPassword().sendKeys("Dummy1234");
		driver.hideKeyboard();
		lt.getRepeatPassword().sendKeys("Dummy1234");
		driver.hideKeyboard();
		lt.getFirstName().sendKeys("Green");
		driver.hideKeyboard();
		lt.getSurName().sendKeys("Color");
		driver.hideKeyboard();*/
		
		/*MobileElement element = driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"com.thefloow.thefloowltd.floowdrive.app:id/btn_already_registered\")).getChildByText("
				+ "new UiSelector().className(\"android.widget.Button\"), \"Already registered\")"));
		
		element.click();*/
		//swipeVertical(driver,0.1,0.9,0.5,3000);
		
				
		
		

		/*WebElement element = driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"com.thefloow.thefloowltd.floowdrive.app:id/btn_already_registered\")).scrollIntoView("
				+ "new UiSelector().text(\"Already registered\"))"));
System.out.println(element.getLocation());
element.click();*/
		
		/*TouchActions action = new TouchActions(driver);
		WebElement scrollView = driver.findElement(By.id("io.appium.java_client.android.AndroidDriver cannot be cast to org.openqa.selenium.interactions"));
		action.scroll(scrollView,700,200);
		action.perform();


		/*ScrollElement se = new ScrollElement(driver);
		MobileElement scrollView = driver.findElement(By.className("android.widget.ScrollView"));
		MobileElement alReg = se.scrollToExactElement(scrollView, "Already registered");
		alReg.click();*/ 
		/*
	
	
	/*public void testScroll()throws Exception
    {
        	WebElement element = driver.findElement(MobileBy.AndroidUIAutomator(
        				"new UiScrollable(new UiSelector().resourceId(\"com.thefloow.thefloowltd.floowdrive.app:id/btn_already_registered\")).scrollIntoView("
        				+ "new UiSelector().text(\"Already registered\"))"));
        System.out.println(element.getLocation());
        element.click();
    }*/
	
	}

}
