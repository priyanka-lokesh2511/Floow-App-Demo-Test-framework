package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class AppLauncher {
	
	public static AndroidDriver<MobileElement> driver;
	DesiredCapabilities cap = new DesiredCapabilities();
	public Properties prop;
	
	public AndroidDriver<MobileElement> appLaunch() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("D:/SeleniumProjectDevelopment/workspace/FloowMobileAppTesting/src/test/resources/Config/Data.properties");
		prop.load(fis);
		
		File appDir = new File("D:/SeleniumProjectDevelopment/workspace/FloowMobileAppTesting/src/test/resources/Apks");
		File app = new File(appDir, "FlowwApp.apk");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, prop.getProperty("Device"));
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, prop.getProperty("PlatformVersion"));
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "500");
		//cap.setCapability("noReset", true);//App is not resetting.
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		return driver = new AndroidDriver<MobileElement>(new URL(prop.getProperty("URL")), cap);
	}

}
