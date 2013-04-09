import static org.junit.Assert.*;

import java.net.URL;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
public class ScratchCnnTest {
	@Test
public void cnnTest (){
		try {
System.setProperty("webdriver.chrome.driver", "C:\\Libs\\chromedriver.exe");
WebDriver driver = new RemoteWebDriver(new URL("http://localhost:9515"), DesiredCapabilities.chrome());
driver.get("http://www.cnn.com");
WebElement header = driver.findElement(By.id("cnn_hdr-main"));
assertTrue(header != null);
WebElement footer = driver.findElement(By.id("cnn_ftrcntnt"));
assertTrue(footer != null);
WebElement weather = driver.findElement(By.linkText("Weather"));
assertTrue(weather != null);
WebElement markets = driver.findElement(By.linkText("Markets"));
assertTrue(markets != null);
driver.quit();
		}catch (Throwable t){}
}
}