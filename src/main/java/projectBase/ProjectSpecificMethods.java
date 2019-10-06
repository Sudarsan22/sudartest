package projectBase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.ReadExcel;

public class ProjectSpecificMethods {
	public String excelFileName;
	/*public String userName = null;
	public String password = null;*/
	public static ChromeDriver driver;
	@Parameters({"url"})
	@BeforeMethod
	public void startApp(String url) throws InterruptedException {
		/*userName = uName;
		password = pwd;*/
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(2000);
	}
	@AfterMethod(alwaysRun=true)
	public void closeApp() {
		driver.close();

	}
	@DataProvider(name = "fetchData")
	public Object[][] getData() throws IOException {
		return ReadExcel.readExcelData(excelFileName);

	}


}





