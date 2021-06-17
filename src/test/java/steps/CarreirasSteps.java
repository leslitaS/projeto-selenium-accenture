package steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;

public class CarreirasSteps {
	WebDriver driver = Hooks.getDriver();
	
	@Dado("clico no menu carreiras")
	public void clico_no_menu_carreiras() {
		driver.findElement(By.xpath("//div[@aria-label='Careers']")).click();
	}
	
	@Dado("clico no item do menu vagas em tecnologia")
	public void clico_no_item_do_menu_vagas_em_tecnologia() {
		WebElement vagasEmTecno = driver.findElement(By.xpath("//a[@aria-label='Vagas em tecnologia']"));
				
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(vagasEmTecno));
		
		vagasEmTecno.click();
	}
	
	@Então("devo ver o titulo {string}")
	public void devo_ver_o_titulo(String string) {
		WebElement areaInterest = driver.findElement(By.className("area-of-interest-title"));
	    assertEquals(string, areaInterest.getText());
	}
}
