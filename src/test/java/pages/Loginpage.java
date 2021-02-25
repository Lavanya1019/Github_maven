package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver driver;
	
	@FindBy(xpath="//a[@href='/login']")
	WebElement lnkLogin;
	
	
	@FindBy(name="login")
	WebElement editUserName;
	
	@FindBy(name="password")
	WebElement editPwd;
	
	@FindBy(className="rememberMe")
	WebElement chkBox;
	
	@FindBy(name="commit")
	WebElement btnPwd;
	
	
	
	
	public Loginpage(WebDriver testdriver) 
	{
		this.driver=testdriver;
		
		PageFactory.initElements(driver,this);
	}
	
	public void Login(String UserName,String password) {
		
		//WebElement lnkLogin=driver.findElement(By.xpath("//a[@href='/login']"));
		
		lnkLogin.click();
		
        WebElement editUserName=driver.findElement(By.name("login"));
        editUserName.sendKeys(UserName);
        
        WebElement editPwd=driver.findElement(By.name("password"));
        editPwd.sendKeys(password);
        
        WebElement btnPwd=driver.findElement(By.name("commit"));
       // chkBox.click();
        btnPwd.click();
	}
	
	
	
	

}
