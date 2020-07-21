package utilities;

import org.openqa.selenium.Dimension;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;

public class Scroll {
    AndroidDriver driver;

	public void scrolldown() {
		Dimension dimension = driver.manage().window().getSize();
		//scroll start
		Double screenHeightStart = dimension.getHeight() * 0.5;
        int scrollStart = screenHeightStart.intValue();
        //scroll End
        Double screenHeightEnd = dimension.getHeight() * 0.2;
        int scrollEnd = screenHeightEnd.intValue();
        
        
	}

}
