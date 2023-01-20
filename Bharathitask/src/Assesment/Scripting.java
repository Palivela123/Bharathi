package Assesment;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Scripting {

	
		public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver = new ChromeDriver();
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\bharathip\\eclipse-workspace\\chromedriver_win32");

	 

	        
	       // WebDriver.chromedriver().setup();

	 

	       // WebDriver driver = new ChromeDriver();

	 

	        driver.get("https://www.rediff.com");

	 

	        driver.manage().window().maximize();

	 

	        driver.findElement(By.xpath("//*[@id=\"signin_info\"]/a[2]")).click();
	        System.out.println( driver.getTitle());
	        //Get The Title
	        String titl=driver.getTitle();
	        //Verify The Title
	        if (titl.equals("Rediffmail Free Unlimited Storage"))
	        {
	               System.out.println("True");
	        }
	               else {
	                     System.out.println("False");
	               }
	        //Find the total no of Links
	        List<WebElement> links = driver.findElements(By.tagName("a"));
	        System.out.println("The number of links is " + links.size());
	        //Click on Terms and conditions Link
	        driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[36]/td/a[1]")).click();
	        //Navigate to child window
	        Set<String>handles=driver.getWindowHandles();
	        Iterator it=handles.iterator();
	        String parentid=(String) it.next();
	        String childid=(String) it.next();
	        driver.switchTo().window(childid);
	        driver.manage().window().maximize();
	        //Get the title of child window

	        System.out.println(driver.findElement(By.xpath("//div[@class='floatL bold']")).getText());
	        // Validate the title of the child window with the expected title.
	        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='floatL bold']")).getText(), "Terms and Conditions");
	        driver.close();
	        //Switch to the parent window
	        driver.switchTo().window(parentid);
	        //driver.quit();
	         driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("Akhil");
	        driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).sendKeys("VAM6627");

	 

	        driver.findElement(By.id("newpasswd")).sendKeys("Iloveuniverse@143");

	 

	        driver.findElement(By.id("newpasswd1")).sendKeys("Iloveuniverse@143");

	 

	        driver.findElement(By.xpath("//*[@id=\"div_altemail\"]/table/tbody/tr[1]/td[3]/input")).sendKeys("akhilnaidu211@gmail.com");

	 

	        driver.findElement(By.id("mobno")).sendKeys("9640333680");

	 


	        WebElement day = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
	        String expectedOptions [] = {"Select from the list", "What is the name of your first school?", "What is your favourite pass-time?", "What is your favourite food?", "What is your exact time of birth?"};
	           WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[2]/td[3]/select"));
	           List<WebElement> weblinks = driver.findElements(By.tagName("a"));
	        Select sel = new Select(dropdown);
	           Select day1 = new Select(day);
	           day1.selectByVisibleText("13");
	           WebElement month = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
	           Select month1 = new Select(month);
	           month1.selectByVisibleText("JUL");
	           WebElement year = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
	           Select year1 = new Select(year);
	           year1.selectByVisibleText("2004");

	 

	 

	           WebElement city = driver.findElement(By.xpath("//*[@id=\"div_city\"]/table/tbody/tr[1]/td[3]/select"));
	           Select city1 = new Select(city);
	           city1.selectByVisibleText("Chennai");
	           Thread.sleep(3000);
	           driver.findElement(By.xpath("//*[@id=\"Register\"]")).click();
	           driver.quit();

	 


	           Thread.sleep(10000);

	 

	           //List <WebElement> options=sel.getOptions();
	           //for(int i = 0; i<options.size(); i++) {
	            //   Assert.assertEquals(options.get(i).getText(), expectedOptions[i]);

	 

	 


	           }
	          // System.out.println("Hiiii.....");
	          // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	         //  driver.quit();
	       

	




	}


