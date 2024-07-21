package StepDefinition;

import org.openqa.selenium.WebDriver;

import Hooks.Setup;
import PageObject.PageHome;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class authentifi {
	WebDriver driver=Setup.driver;
	PageHome Home = new PageHome(driver);
	

	@When("saisir lemail adress {string}")
	public void saisir_lemail_adress(String string) {
		Home.Saisir_Email(string);
	    
	}

	@When("saisire le mot de passe {string}")
	public void saisire_le_mot_de_passe(String string) {
	   Home.ajouter_mdp(string);
	}

	@When("cliquer sur la boutton login")
	public void cliquer_sur_la_boutton_login() {
	    Home.App_sur_bt();
	
	}

	@Then("verifier le nom {string}")
	public void verifier_le_nom(String string) {
	    
	}

}
