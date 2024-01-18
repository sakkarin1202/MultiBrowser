import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class TestGoogleWebsite {

	@Test
	void testSearchByKeyword() {
		WebDriver driver = null;
        System.setProperty("webdriver.gecko.driver", "D:\\webdriver\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        
        WebElement search_box = driver.findElement(By.name("q"));
        search_box.sendKeys("NPRU");
        search_box.sendKeys(Keys.ENTER);
        
        String title = driver.getTitle();
        assertEquals("Google",title);
        
        driver.close();
        
	}


	@Test
	void testSearchByKeyword2() {
		WebDriver driver = null;
        System.setProperty("webdriver.edge.driver", "D:\\webdriver\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get("https://www.google.com");
        
        WebElement search_box = driver.findElement(By.name("q"));
        search_box.sendKeys("NPRU");
        search_box.sendKeys(Keys.ENTER);
        
        String result = driver.findElement(By.className("VuuXrf")).getText();
        assertEquals("มหาวิทยาลัยราชภัฏนครปฐม",result);
        
        driver.close();
        
	}
	
	@Test
	void testSearchByKeyword3() {
		WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        
        WebElement search_box = driver.findElement(By.name("q"));
        search_box.sendKeys("NPRU");
        search_box.sendKeys(Keys.ENTER);
        
        String result = driver.findElement(By.className("VuuXrf")).getText();
        assertEquals("มหาวิทยาลัยราชภัฏนครปฐม",result);
        
        driver.close();
        
	}

}
