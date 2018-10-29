package Steps;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import Pages.LoginPage;
import Utility.AppLauncher;
import Utility.ScrollElement;
import io.appium.java_client.MobileBy;

import org.junit.Assert;
import org.openqa.selenium.By;
import net.thucydides.core.annotations.Step;

public class LoginPageSteps extends AppLauncher{
	
	LoginPage loginPage = new LoginPage(driver);
	AppLauncher app = new AppLauncher();
	ScrollElement scrollElemt = new ScrollElement(driver);

	@Step
	public void launchApp() throws IOException, InterruptedException
	{
		driver =appLaunch();
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
		scrollElemt.scrollDown();
		//String selector = "Already registered";
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text("+selector+"))"));
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
		//driver.findElement(By.id("com.thefloow.thefloowltd.floowdrive.app:id/btn_already_registered")).click();
		//loginPage.alreadyRegistered();
		
	}
	@Step
	public void invalidemailpassWrd(String emailID,String password)
	{
		/*driver.findElement(By.id("com.thefloow.thefloowltd.floowdrive.app:id/login_email")).sendKeys(emailID);
		driver.findElement(By.id("com.thefloow.thefloowltd.floowdrive.app:id/login_password")).sendKeys(password);
		driver.hideKeyboard();
		driver.findElement(By.id("com.thefloow.thefloowltd.floowdrive.app:id/btn_login")).click();*/
		loginPage.Login(emailID, password);
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
		
	}
	
	@Step
	public void validateErrorMessage()
	{
		Assert.assertEquals("Could not log in", driver.findElement(By.id("com.thefloow.thefloowltd.floowdrive.app:id/title")).getText());
		Assert.assertEquals("Could not log in", loginPage.getErrorMessage());
	}

}
