package StepDefinition;

import org.openqa.selenium.WebDriver;



import Hooks.Setup;
import PageObject.PageHome;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;



public class CreationCompteStepDef {
	WebDriver driver=Setup.driver;
	PageHome Home = new PageHome(driver);
	
	@Given("acceder a url {string} de la page")
	public void acceder_a_url_de_la_page(String string) {
		Home.GetUrl(string);
	   
	}

	@When("cilquer sur sgn\\/log")
	public void cilquer_sur_sgn_log() {
		Home.cliquer_bt_signLogin();
	    
	}

	@When("saisir le nom {string} et l mail {string}")
	public void saisir_le_nom_et_l_mail(String string, String string2) {
	    Home.saisirNom(string);
	    Home.saisirMail(string2);
	}

	@When("cliquer sur sgn")
	public void cliquer_sur_sgn() {
		Home.cliquer_sgn();
	   
	}

	@When("je selectionne le genre :{string}")
	public void je_selectionne_le_genre(String string) {
		Home.selectionne_genre(string);
	  
	}

	@When("saisir le mot de passe {string}")
	public void saisir_le_mot_de_passe(String string) {
		Home.saisir_le_mot_de_passe(string);
	    
	}

	@When("selectionne la date {string} ,le mois {string} et l annee {string} de naissance")
	public void selectionne_la_date_le_mois_et_l_annee_de_naissance(String string, String string2, String string3) {

	   Home.selectionne_date_mois_et_annee_(string2, string2, string3);
	}

	@When("cocher les options")
	public void cocher_les_options() {
		Home.cocher_les_options();
	    
	}

	@When("saisir first name {string} et last name {string}")
	public void saisir_first_name_et_last_name(String string, String string2) {
	Home.first_name_et(string);
	Home.last_name_et(string2);

	}

	@When("saisir le company {string} et saisir l adresse {string} et selectionner country {string}")
	public void saisir_le_company_et_saisir_l_adresse_et_selectionner_country(String string, String string2, String string3) {
	   Home.saisir_le_company_et_saisir_l_adresse_et_selectionner_country(string, string2, string3);
	}

	@When("saisir le stat {string} le city {string} et zipcode {string}")
	public void saisir_le_stat_le_city_et_zipcode(String string, String string2, String string3) {
		Home.saisir_stat(string);
		Home.saisir_city(string2);
		Home.saisir_zipcode(string3);
	  
	}

	@When("saisir le phone number {string}")
	public void saisir_le_phone_number(String string) {
		Home.saisir_phone(string);
	   
	}

	@When("cliquer sur creat account")
	public void cliquer_sur_creat_account() {
		Home.cliquer_bt_creat_account();
	  
	}

	
	@Then("verifier que le mssg {string}")
	public void verifier_que_le_mssg(String string) {
	 Assert.assertEquals(string, Home.textAfiche());
	 
	   
	}
	
	
	
}
