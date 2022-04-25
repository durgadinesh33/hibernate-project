
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoAutomation {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("durgadinesh039@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("dinesh2344");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(Keys.ENTER);
		// login
		Thread.sleep(3000);
		Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='j83agx80 cbu4d94t ew0dbk1b irj2b8pg']/div/span/span[text()='Dinesh Diamond']")));
		driver.findElement(By.xpath("//div[@class='j83agx80 cbu4d94t ew0dbk1b irj2b8pg']/div/span/span[text()='Dinesh Diamond']")).click();

		Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='oajrlxb2 qu0x051f esr5mh6w e9989ue4 r7d6kgcz p7hjln8o f1sip0of n00je7tq arfg74bv qs9ysxi8 k77z8yql abiwlrkh p8dawk7l lzcic4wl dwo3fsh8 g5ia77u1 mf7ej076 goun2846 ccm00jje s44p3ltw mk2mc5f4 rt8b4zig n8ej3o3l agehan2d sk4xxmp2 rq0escxv gmql0nx0 nhd2j8a9 kvgmc6g5 cxmmr5t8 oygrvhab hcukyx3x jb3vyjys rz4wbd8a qt6c0cv9 a8nywdso l9j0dhe7 i1ao9s8h esuyzwwr tkr6xdv7 pq6dq46d bzsjyuwj cb02d2ww j1lvzwm4']/div/span[text()='Friends']")));
		Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='oajrlxb2 qu0x051f esr5mh6w e9989ue4 r7d6kgcz p7hjln8o f1sip0of n00je7tq arfg74bv qs9ysxi8 k77z8yql abiwlrkh p8dawk7l lzcic4wl dwo3fsh8 g5ia77u1 mf7ej076 goun2846 ccm00jje s44p3ltw mk2mc5f4 rt8b4zig n8ej3o3l agehan2d sk4xxmp2 rq0escxv gmql0nx0 nhd2j8a9 kvgmc6g5 cxmmr5t8 oygrvhab hcukyx3x jb3vyjys rz4wbd8a qt6c0cv9 a8nywdso l9j0dhe7 i1ao9s8h esuyzwwr tkr6xdv7 pq6dq46d bzsjyuwj cb02d2ww j1lvzwm4']/div/span[text()='Friends']")));
		driver.findElement(By.xpath("//a[@class='oajrlxb2 qu0x051f esr5mh6w e9989ue4 r7d6kgcz p7hjln8o f1sip0of n00je7tq arfg74bv qs9ysxi8 k77z8yql abiwlrkh p8dawk7l lzcic4wl dwo3fsh8 g5ia77u1 mf7ej076 goun2846 ccm00jje s44p3ltw mk2mc5f4 rt8b4zig n8ej3o3l agehan2d sk4xxmp2 rq0escxv gmql0nx0 nhd2j8a9 kvgmc6g5 cxmmr5t8 oygrvhab hcukyx3x jb3vyjys rz4wbd8a qt6c0cv9 a8nywdso l9j0dhe7 i1ao9s8h esuyzwwr tkr6xdv7 pq6dq46d bzsjyuwj cb02d2ww j1lvzwm4']/div/span[text()='Friends']")).click();

		//List<WebElement> friends = driver.findElements(By.xpath("//div[@class='buofh1pr hv4rvrfc']/div[1]/a/span"));
		//System.out.println("Total friends "+ friends.size());
		//for (WebElement e : friends) {
			//System.out.println(e.getText());

		//}
		
		
		  while (true) {
	      List<WebElement> friendListBeforeScrolling = driver.findElements(By.xpath("//div[@class='j83agx80 btwxx1t3 lhclo0ds i1fnvgqd']/div/div/div/a/span"));
		  System.out.println("Total friends " + friendListBeforeScrolling.size());
		  Thread.sleep(3000);
		  WebElement lastFriend = friendListBeforeScrolling.get(friendListBeforeScrolling.size()-1); 
		  int y =lastFriend.getLocation().y; 
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("window.scrollTo(0,"+y+")");
		  Thread.sleep(3000);
		  List<WebElement> friendListAfterScrolling = driver.findElements(By.xpath("//div[@class='j83agx80 btwxx1t3 lhclo0ds i1fnvgqd']/div/div/div/a/span"));
		  
		  if (friendListBeforeScrolling.size() == friendListAfterScrolling.size()) {
		  break;
		  }
		  for (WebElement e : friendListAfterScrolling) {
				System.out.println(e.getText());

	}
		 
	}
	}
}

