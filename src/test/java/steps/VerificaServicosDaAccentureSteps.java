package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.pt.Entao;

public class VerificaServicosDaAccentureSteps {
	
	WebDriver driver = Hooks.getDriver();
	
	
	@Entao("deve mostrar os {string} abaixo")
	public void deve_mostrar_os_abaixo(String string) {
		WebElement elemento = driver.findElement(By.cssSelector("#primaryLink2_Servios > div > div > ul > li:nth-child(22)"));

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(elemento));
		
		
			Assert.assertTrue((driver.findElement(By.cssSelector("#primaryLink2_Servios > div > div > ul > li:nth-child(1)")).getText().contains("Accenture Strategy")));
			System.out.println(driver.findElement(By.cssSelector("#primaryLink2_Servios > div > div > ul > li:nth-child(1)")).getText());
			Assert.assertTrue((driver.findElement(By.cssSelector("#primaryLink2_Servios > div > div > ul > li:nth-child(2)")).getText().contains("Application Services")));
			System.out.println(driver.findElement(By.cssSelector("#primaryLink2_Servios > div > div > ul > li:nth-child(2)")).getText());
		    Assert.assertTrue((driver.findElement(By.cssSelector("#primaryLink2_Servios > div > div > ul > li:nth-child(3)")).getText().contains("Artificial Intelligence")));
			System.out.println(driver.findElement(By.cssSelector("#primaryLink2_Servios > div > div > ul > li:nth-child(3)")).getText());
		    Assert.assertTrue((driver.findElement(By.cssSelector("#primaryLink2_Servios > div > div > ul > li:nth-child(4)")).getText().contains("Automation")));
			System.out.println(driver.findElement(By.cssSelector("#primaryLink2_Servios > div > div > ul > li:nth-child(4)")).getText());
			Assert.assertTrue((driver.findElement(By.cssSelector("#primaryLink2_Servios > div > div > ul > li:nth-child(5)")).getText().contains("Business Process Services")));
			System.out.println(driver.findElement(By.cssSelector("#primaryLink2_Servios > div > div > ul > li:nth-child(5)")).getText());
		    Assert.assertTrue((driver.findElement(By.cssSelector("#primaryLink2_Servios > div > div > ul > li:nth-child(6)")).getText().contains("Change Management")));
			System.out.println(driver.findElement(By.cssSelector("#primaryLink2_Servios > div > div > ul > li:nth-child(6)")).getText());
			Assert.assertTrue((driver.findElement(By.cssSelector("#primaryLink2_Servios > div > div > ul > li:nth-child(7)")).getText().contains("Cloud")));
			System.out.println(driver.findElement(By.cssSelector("#primaryLink2_Servios > div > div > ul > li:nth-child(7)")).getText());
		    Assert.assertTrue((driver.findElement(By.cssSelector("#primaryLink2_Servios > div > div > ul > li:nth-child(8)")).getText().contains("Customer Experience")));
			System.out.println(driver.findElement(By.cssSelector("#primaryLink2_Servios > div > div > ul > li:nth-child(8)")).getText());
			Assert.assertTrue((driver.findElement(By.cssSelector("#primaryLink2_Servios > div > div > ul > li:nth-child(9)")).getText().contains("Data & Analytics")));
			System.out.println(driver.findElement(By.cssSelector("#primaryLink2_Servios > div > div > ul > li:nth-child(9)")).getText());
		    Assert.assertTrue((driver.findElement(By.cssSelector("#primaryLink2_Servios > div > div > ul > li:nth-child(10)")).getText().contains("Ecosystem Partners")));
			System.out.println(driver.findElement(By.cssSelector("#primaryLink2_Servios > div > div > ul > li:nth-child(10)")).getText());
			Assert.assertTrue((driver.findElement(By.cssSelector("#primaryLink2_Servios > div > div > ul > li:nth-child(11)")).getText().contains("Finance Consulting")));
			System.out.println(driver.findElement(By.cssSelector("#primaryLink2_Servios > div > div > ul > li:nth-child(11)")).getText());
		    Assert.assertTrue((driver.findElement(By.cssSelector("#primaryLink2_Servios > div > div > ul > li:nth-child(12)")).getText().contains("Industry X")));
			System.out.println(driver.findElement(By.cssSelector("#primaryLink2_Servios > div > div > ul > li:nth-child(12)")).getText());
			Assert.assertTrue((driver.findElement(By.cssSelector("#primaryLink2_Servios > div > div > ul > li:nth-child(13)")).getText().contains("Infrastructure")));
			System.out.println(driver.findElement(By.cssSelector("#primaryLink2_Servios > div > div > ul > li:nth-child(13)")).getText());
		    Assert.assertTrue((driver.findElement(By.cssSelector("#primaryLink2_Servios > div > div > ul > li:nth-child(14)")).getText().contains("Marketing")));
			System.out.println(driver.findElement(By.cssSelector("#primaryLink2_Servios > div > div > ul > li:nth-child(14)")).getText());
			Assert.assertTrue((driver.findElement(By.cssSelector("#primaryLink2_Servios > div > div > ul > li:nth-child(15)")).getText().contains("Mergers & Acquisitions (M&A)")));
			System.out.println(driver.findElement(By.cssSelector("#primaryLink2_Servios > div > div > ul > li:nth-child(15)")).getText());
		    Assert.assertTrue((driver.findElement(By.cssSelector("#primaryLink2_Servios > div > div > ul > li:nth-child(16)")).getText().contains("Operating Models")));
			System.out.println(driver.findElement(By.cssSelector("#primaryLink2_Servios > div > div > ul > li:nth-child(16)")).getText());
			Assert.assertTrue((driver.findElement(By.cssSelector("#primaryLink2_Servios > div > div > ul > li:nth-child(17)")).getText().contains("Security")));
			System.out.println(driver.findElement(By.cssSelector("#primaryLink2_Servios > div > div > ul > li:nth-child(17)")).getText());
		    Assert.assertTrue((driver.findElement(By.cssSelector("#primaryLink2_Servios > div > div > ul > li:nth-child(18)")).getText().contains("Supply Chain Management")));
			System.out.println(driver.findElement(By.cssSelector("#primaryLink2_Servios > div > div > ul > li:nth-child(18)")).getText());
			Assert.assertTrue((driver.findElement(By.cssSelector("#primaryLink2_Servios > div > div > ul > li:nth-child(19)")).getText().contains("Sustainability")));
			System.out.println(driver.findElement(By.cssSelector("#primaryLink2_Servios > div > div > ul > li:nth-child(19)")).getText());
			Assert.assertTrue((driver.findElement(By.cssSelector("#primaryLink2_Servios > div > div > ul > li:nth-child(20)")).getText().contains("Technology Consulting")));
			System.out.println(driver.findElement(By.cssSelector("#primaryLink2_Servios > div > div > ul > li:nth-child(20)")).getText());
		    Assert.assertTrue((driver.findElement(By.cssSelector("#primaryLink2_Servios > div > div > ul > li:nth-child(21)")).getText().contains("Technology Innovation")));
			System.out.println(driver.findElement(By.cssSelector("#primaryLink2_Servios > div > div > ul > li:nth-child(21)")).getText());
			Assert.assertTrue((driver.findElement(By.cssSelector("#primaryLink2_Servios > div > div > ul > li:nth-child(22)")).getText().contains("Zero Based Budgeting (ZBB)")));
			System.out.println(driver.findElement(By.cssSelector("#primaryLink2_Servios > div > div > ul > li:nth-child(22)")).getText());				
	}
}
