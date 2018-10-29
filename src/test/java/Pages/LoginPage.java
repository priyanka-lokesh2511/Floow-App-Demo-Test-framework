package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Utility.AppLauncher;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage extends AppLauncher {
	
	public LoginPage(AndroidDriver<MobileElement> driver) {
		driver = this.driver;
		// TODO Auto-generated constructor stub
	}

	/*@AndroidFindBy(id="com.thefloow.thefloowltd.floowdrive.app:id/btn_already_registered")
	private MobileElement alreadyRegistered;
	
	@AndroidFindBy(id="com.thefloow.thefloowltd.floowdrive.app:id/login_email")
	private MobileElement emailId;
	
	@AndroidFindBy(id="com.thefloow.thefloowltd.floowdrive.app:id/login_password")
	private MobileElement passWord;
	
	@AndroidFindBy(id="com.thefloow.thefloowltd.floowdrive.app:id/btn_login")
	private MobileElement loginButton;
	
	@AndroidFindBy(id="com.thefloow.thefloowltd.floowdrive.app:id/title")
	private MobileElement errorMessage;*/
	
	
	
	 By alreadyRegistered = By.id("com.thefloow.thefloowltd.floowdrive.app:id/btn_already_registered");
	 By emailId = By.id("com.thefloow.thefloowltd.floowdrive.app:id/login_email");
	 By password = By.id("com.thefloow.thefloowltd.floowdrive.app:id/login_password");
	 By loginButton = By.id("com.thefloow.thefloowltd.floowdrive.app:id/btn_login");
	 By errorMessage = By.id("com.thefloow.thefloowltd.floowdrive.app:id/title");
	 
	

	public MobileElement getAlreadyRegisteredButton()
	{
		return driver.findElement(alreadyRegistered);
	}
	
	public MobileElement getEmailId()
	{
		return driver.findElement(emailId);
	}
	
	public MobileElement getpassword()
	{
		return driver.findElement(password);
	}
	
	public MobileElement getLoginbutton()
	{
		return driver.findElement(loginButton);
	}
	
	public MobileElement getErrorMessageText()
	{
		return driver.findElement(errorMessage);
	}
	    
	public void alreadyRegistered()
	{
	getAlreadyRegisteredButton().click();
	}
	
	
	public void Login(String emailID, String password)
	{
	
        getEmailId().sendKeys(emailID);
        getpassword().sendKeys(password);
        driver.hideKeyboard();
        getLoginbutton().click();
	}
	
	public String getErrorMessage()
	{
		return getErrorMessageText().getText();
	}
	
	
	
	
	

}
