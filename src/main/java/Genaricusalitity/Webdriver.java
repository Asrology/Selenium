package Genaricusalitity;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webdriver {
	public void maximizeWindow(WebDriver driver) {	
		
		driver.manage().window().maximize();
		
		

		}
		public void waitForPageload(WebDriver driver) {
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
		}
		
		
		public void HandleDropDown(WebElement element,int index) {
		Select s= new Select(element);
		s.selectByIndex(index);	
		}
		public void handleDropDown(WebElement element,String value) {
			Select sel=new Select(element);
			sel.selectByValue(value);
			
			}
		
	    public void handleDropDown(String visibletext,WebElement element) {
	    	Select sel=new Select(element);
	    sel.selectByVisibleText(visibletext);
	   }
	    public void mouseoverAction(WebElement element,WebDriver driver) {
	    	Actions act=new Actions(driver);
	    	act.moveToElement(element).perform();
	    
	       }
		
		public void rightclickaction(WebDriver driver,WebElement element) {
			Actions act =new Actions(driver);
			act.contextClick().perform();
		}
		
			public void rightclickAction(WebDriver driver, WebElement element) { 
			Actions act = new Actions(driver);
			act.contextClick().perform();
		}
		
		public void doubleclickAction(WebDriver driver) {
			Actions act=new Actions(driver);
			act.doubleClick().perform();
			
		}
		public void doubleclickAction(WebDriver driver,WebElement element) {
			Actions act=new Actions(driver);
			act.doubleClick(element).perform();
			
		}
		public void draganddropAction(WebDriver driver,WebElement src,WebElement dest) {
			Actions act=new Actions(driver);
			act.dragAndDrop(src,dest).perform();
			
		}
		public void dragAndDropAction(WebDriver driver,WebElement src,int x,int y) {
			Actions act=new Actions(driver);
			act.dragAndDropBy(src,x,y).perform();
			
		}
		public void switchTo(WebDriver driver,int index) {
			driver.switchTo().frame(index);
			
		}
		public void switchTOFrame(WebDriver driver,WebElement element) {
			driver.switchTo().frame(element);
			
		}
		public void switchToparentFrame(WebDriver driver) {
			driver.switchTo().parentFrame();
			
		}
		public void switchTODefanceFrame(WebDriver driver) {
			driver.switchTo().defaultContent();
			
		}
		public void acceptAlert(WebDriver driver) {
			driver.switchTo().alert().accept();
			
		}
		public void dismissAlert(WebDriver driver) {
			driver.switchTo().alert().dismiss();
			
		}
		public void getalertTextString(WebDriver driver) {
			driver.switchTo().alert().getText();
			
			
		}
		
	}

	


