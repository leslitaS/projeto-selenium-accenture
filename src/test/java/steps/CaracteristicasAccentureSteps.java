package steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;

public class CaracteristicasAccentureSteps {
	WebDriver driver = Hooks.getDriver();
	
	@E("clico no menu sobre a accenture")
	public void clico_no_menu_sobre_a_accenture() {

	    driver.findElement(By.xpath("//div[@id='navigation-menu']/div[5]/div/span")).click();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); 
		    
	}
	
	@E("clico no item do menu sobre a accenture")
	public void clico_no_item_do_menu_sobre_a_accenture() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement elemento = driver.findElement(By.xpath("//a[contains(@data-analytics-link-name, 'sobre a accenture')]"));
		wait.until(ExpectedConditions.visibilityOf(elemento));
		
		elemento.click();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); 
	}
	
	@Então("devo ver o destaque em {string}")
	public void devo_ver_o_destaque_em(String resultadoEsperado) {		
		Assert.assertTrue((driver.findElement(By.tagName("h3")).getText().contains("Nosso propósito:")));
		System.out.println(driver.findElement(By.tagName("h3")).getText());	
	}
	
	
}
