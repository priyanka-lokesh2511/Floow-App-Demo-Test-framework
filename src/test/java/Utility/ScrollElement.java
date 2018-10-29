package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ScrollElement extends AppLauncher {

	

	public ScrollElement(AndroidDriver<MobileElement> driver) {
		this.driver = driver;

	}

	public MobileElement scrollToExactElement(MobileElement ele, String str) {
		return ((FindsByAndroidUIAutomator<MobileElement>) ele).findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollIntoView(" + "new UiSelector().text(\"" + str + "\"));");
	}

	public void scrollDown() {

		int pressX = driver.manage().window().getSize().width / 2;

		int bottomY = driver.manage().window().getSize().height * 4 / 5;

		int topY = driver.manage().window().getSize().height / 8;

		int i = 0;

		do {

			boolean isPresent = driver
					.findElements(By.id("com.thefloow.thefloowltd.floowdrive.app:id/btn_already_registered"))
					.size() > 0;
			if (isPresent) {
				MobileElement we = driver
						.findElement(By.id("com.thefloow.thefloowltd.floowdrive.app:id/btn_already_registered"));
				we.click();
				break;
			} else {
				scroll(pressX, bottomY, pressX, topY);
			}
			i++;

		} while (i <= 4);
	}

	private void scroll(int fromX, int fromY, int toX, int toY) {
	    TouchAction touchAction = new TouchAction(driver);
	    try{
	    	touchAction.longPress(fromX, fromY).moveTo(toX, toY).release().perform();
	    }
	    catch(WebDriverException wd){
	    	 }
	    

	}

	

}

