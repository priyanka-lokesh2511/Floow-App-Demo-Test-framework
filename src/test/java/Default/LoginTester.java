package Default;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class LoginTester {
	
	public AndroidDriver<MobileElement> driver;
	
	By alreadyRegistered = By.id("com.thefloow.thefloowltd.floowdrive.app:id/btn_already_registered");
	By emailIDRegister = By.id("com.thefloow.thefloowltd.floowdrive.app:id/register_email_address");
	By password = By.id("com.thefloow.thefloowltd.floowdrive.app:id/register_password");
	By repeatPassword = By.id("com.thefloow.thefloowltd.floowdrive.app:id/register_confirm_password");
	By firstName = By.id("com.thefloow.thefloowltd.floowdrive.app:id/register_forename");
	By surName = By.id("com.thefloow.thefloowltd.floowdrive.app:id/register_surname");
	
	public MobileElement getAlreadyRegisteredButton()
	{
		return driver.findElement(alreadyRegistered);
	}
	
	public MobileElement getEmailIDRegisterField()
	{
		return driver.findElement(emailIDRegister);
	}
	
	public MobileElement getPassword()
	{
		return driver.findElement(password);
	}
	
	public MobileElement getRepeatPassword()
	{
		return driver.findElement(repeatPassword);
	}
	
	public MobileElement getFirstName()
	{
		return driver.findElement(firstName);
	}
	
	public MobileElement getSurName()
	{
		return driver.findElement(surName);
	}
	

	public LoginTester(AndroidDriver<MobileElement> driver) {
		super();
		this.driver = driver;
		
	}

}
