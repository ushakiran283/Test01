package tests;

import java.io.IOException;
import java.net.URL;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.*;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class LoginTest {

	AndroidDriver driver;

	@BeforeMethod
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
	
	@Test
	public void testcase01() throws InterruptedException {
		driver.findElement(By.id("com.amazon.mShop.android.shopping:id/sign_in_button")).click();
		/*
		 * Set<String> contextNames = driver.getContextHandles(); for (String
		 * contextName : contextNames) { System.out.println(contextName); //prints out
		 * something like NATIVE_APP } driver.context((String)
		 * contextNames.toArray()[0]); WebElement mobile = driver.findElement(By.xpath(
		 * "//android.view.View[@text='ap_ra_email_or_phone']")); mobile.click();
		 * Thread.sleep(3000); WebElement email = driver.findElement(By.xpath(
		 * "//android.widget.TextView[@text='durgaprasad.battini@gmail.com']"));
		 * email.click();
		 * driver.findElement(By.xpath("//android.widget.Button[@text='Continue']")).
		 * click(); WebElement pwd = driver.findElement(By.
		 * xpath("//android.widget.EditText[@text='Amazon password']")); pwd.click();
		 * pwd.sendKeys("ushaprasad3");
		 * driver.findElement(By.xpath("//android.widget.Button[@text='Login']")).click(
		 * ); Thread.sleep(3000);
		 */
		
		//Search 65-inch TV(Not the first/last)
		WebElement search = driver.findElement(By.id("com.amazon.mShop.android.shopping:id/rs_search_src_text"));
		search.click();
		WebElement search1 = driver.findElement(By.id("com.amazon.mShop.android.shopping:id/rs_search_bar_with_buttons_frame"));

		search1.sendKeys("65 inch tv 4k");
		
		Thread.sleep(5000);
		
	
	}
	
	private boolean isElementPresentOnScreen(WebElement tV) {
		// TODO Auto-generated method stub
		return false;
	}

	@AfterMethod
	public void teardown() {
		//driver.quit();
	}

	public static  boolean isElementPresentOnScreen(AndroidDriver driver, By by) {
		boolean isElementAvailable = false;
		try {
			isElementAvailable = driver.findElement(by).isDisplayed();
		} catch (NoSuchElementException e) {
		} catch (AssertionError e) {
		}
		return isElementAvailable;
	}
}
