package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class ClicarNoServicoCloudSteps {
	WebDriver driver = Hooks.getDriver();
   
    @Dado("que eu estou no site da accenture")
    public void que_eu_estou_no_site_da_accenture() {
        Hooks.abrirUrl("https://www.accenture.com/br-pt");
		driver = Hooks.getDriver();
    }
    
    @Quando("clico no <menu> serviços")
    public void clico_no_menu_serviços() {
       driver.findElement(By.xpath("//*[@id=\"navigation-menu\"]/div[2]/div[1]")).click();
          	
    }

    @Quando("clico no item do menu cloud")
    public void clico_no_item_do_menu_cloud() {
        WebElement cloud = driver.findElement(By.xpath("//*[@id=\"primaryLink2_Servios\"]/div/div/ul/li[7]/a"));

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(cloud));

        cloud.click();
    }


    @Então("devo encontrar o título {string}")
    public void devo_encontrar_o_título(String string) {
        WebElement servicosCloud = driver.findElement(By.xpath("//*[@id=\"full-width-text-container\"]/div/article/div/h1"));
        assertEquals(string, servicosCloud.getText());
    }

}


