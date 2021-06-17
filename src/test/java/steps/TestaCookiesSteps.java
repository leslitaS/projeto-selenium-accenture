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

public class TestaCookiesSteps {
	
	WebDriver driver = Hooks.getDriver();
	
	@E("abro as configurações de cookies")
	public void abro_as_configurações_de_cookies() {
		driver.findElement(By.id("onetrust-pc-btn-handler")).click();
	}

	@E("clico em Confirmar minhas escolhas")
	public void clico_em_confirmar_minhas_escolhas() {
		driver.findElement(By.xpath("//*[@id=\"onetrust-pc-sdk\"]/div[3]/div[1]/button[1]")).click();
	}

	@E("clico em configurações de cookie")
	public void clico_em_configurações_de_cookie() {
		driver.findElement(By.id("optanon-minimize-button")).click();
	}
	
	@Então("deve fechar o modal")
	public void deve_fechar_o_modal(){
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String esperado = "";
	    By locator = By.id("pc-title");
	    String atual = driver.findElement(locator).getText();  	   
	    
	 
	    Assert.assertEquals("O modal não foi fechado!", esperado, atual);
	}
	
	@Então("devo ver o item de {string}")
	public void devo_ver_o_item_de(String suaPrivacidade) {
		WebElement element;
		element = driver.findElement(By.id("privacy-text"));
		element.click();
		String atualPrivacidade = element.getText();

	    Assert.assertEquals("Erro nas Configurações de Cookies", suaPrivacidade, atualPrivacidade);
	}

	@Então("devo ver {string}")
	public void devo_ver(String esperado) {
		WebElement elemento = null;
		WebElement elementoTitulo = null;
		By locator = By.id("");
		
	    if(esperado.equals("Cookies estritamente necessárias")) {
	    	elemento = driver.findElement(By.id("ot-header-id-1"));
	    	elemento.click();
	    	locator = By.id("ot-desc-id-1");
	    }
	    
	    if(esperado.equals("Cookies Analíticos de Primeira Parte")) {
	    	elemento = driver.findElement(By.id("ot-header-id-2"));
	    	elemento.click();
	    	locator = By.id("ot-desc-id-2");
	    }
	    
	    if(esperado.equals("Cookies de Desempenho e Cookies Funcionais")) {
	    	elemento = driver.findElement(By.id("ot-header-id-3"));
	    	elemento.click();
	    	locator = By.id("ot-desc-id-3");
	    }
	    
	    if(esperado.equals("Cookies de Publicidade e Redes Sociais")) {
	    	elemento = driver.findElement(By.id("ot-header-id-4"));
	    	elemento.click();
	    	locator = By.id("ot-desc-id-4");
	    }
	    
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    elementoTitulo = driver.findElement(locator);
	    String atual = elementoTitulo.findElement(By.tagName("h3")).getText();
	    Assert.assertEquals("Erro nas Configurações de Cookies", esperado, atual);
	}
}
