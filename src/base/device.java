package base;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import io.appium.java_client.android.AndroidDriver;

public class device {
	
	public static AndroidDriver driver; 

	@BeforeSuite
	public void Setup() throws IOException {
		DesiredCapabilities Capabilities = new DesiredCapabilities();
		Capabilities.setCapability("BROWSER_NAME", "Android");
		Capabilities.setCapability("devicename", "Mi A2");
		Capabilities.setCapability("Version", "10");
		Capabilities.setCapability("platformName", "Android");
		Capabilities.setCapability("appPackage","com.amazon.mShop.android.shopping");
		Capabilities.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), Capabilities);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

	}

}
