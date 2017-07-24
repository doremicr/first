package sss.sss0;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException, InterruptedException {// 设置 chrome 的路径
		System.setProperty("webdriver.chrome.driver", "//Applications//Google//Chrome.app");
		// 创建一个 ChromeDriver 的接口，用于连接 Chrome
		@SuppressWarnings("deprecation")
		ChromeDriverService service = new ChromeDriverService.Builder()
				.usingDriverExecutable(new File("/Users/chenrui/chromedriver")).usingAnyFreePort().build();
		service.start();
		// 创建一个 Chrome 的浏览器实例
		WebDriver driver = new RemoteWebDriver(service.getUrl(), DesiredCapabilities.chrome());
		driver.get("https://www.baidu.com/");

		
        //在自动化测试过程中， 测试程序通常的操作页面元素步骤

        //1. 找到Web的页面元素，并赋予到一个存储对象中 (WebElement)

        //2. 对存储页面元素的对象进行操作， 例如：点击链接，在输入框中输入字符等

        //3. 验证页面上的元素是否符合预期

		
		//链接(link)
		//输入框（textbox）
		//按钮(Button)
		//下拉按钮(Select)
		//单选按钮(Radio Button)
		//多选框(check box)

		WebElement searchBox = driver.findElement(By.id("kw"));//得到百度搜索框元素id
		searchBox.sendKeys(" 测试教程");//对搜索框进行操作
		WebElement searchButton = driver.findElement(By.id("su"));//得到“百度一下”的元素id
		searchButton.submit();//对元素进行操作
		Thread.sleep(1000);//让程序等一段时间
		WebElement searchbutton1 = driver.findElement(By.id("1"));
		WebElement h3=searchbutton1.findElement(By.className("t"));
		WebElement a=h3.findElement(By.xpath("a"));
		a.click();//得到a后点击a.
		  //*[@id="1"]/h3/a                //xpath方式定位
		 //String b=a.getAttribute("href");
		//System.out.println(b);
       //driver.close();
	}
}
