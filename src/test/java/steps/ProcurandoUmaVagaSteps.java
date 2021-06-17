package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;

public class ProcurandoUmaVagaSteps {
	WebDriver driver = Hooks.getDriver();
	
	@E("acessa a área de carreiras")
	public void acessa_a_área_de_carreiras() {
		driver.findElement(By.xpath("//div[contains(@data-analytics-link-name, 'carreiras')]")).click();
	}

	@E("clica em procure por vagas")
	public void clica_em_procure_por_vagas() {
		driver.findElement(By.xpath("//a[contains(@data-analytics-link-name, 'procure por vagas')]")).click();
	}

	@E("digite no campo de busca {string}")
	public void digite_no_campo_de_busca(String string) {
		driver.findElement(By.id("job-search-hero-bar")).sendKeys("desenvolvedor");
	}

	@E("clico no botão procurar")
	public void clico_no_botão_procurar() {
		driver.findElement(By.xpath("//button[contains(@data-analytics-link-name, 'search')]")).click();
	}

	@Então("devo encontrar vagas para programadores")
	public void devo_encontrar_vagas_para_programadores() {
		assertEquals("Search Jobs | Accenture", driver.getTitle());
	}
}
