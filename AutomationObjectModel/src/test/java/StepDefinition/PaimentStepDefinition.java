package StepDefinition;

import org.openqa.selenium.WebDriver;

import Hooks.Setup;
import PageObject.PageHome;
import PageObject.PagePaiement;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaimentStepDefinition {
	WebDriver driver=Setup.driver;
	PagePaiement Ppaiment = new PagePaiement(driver);

	@When("Entree Name Cart {string}")
	public void entree_name_cart(String string) {
		Ppaiment.saisir_Name_Cart(string);
	    
	}

	@When("Entree Cart Number {string}")
	public void entree_cart_number(String string) {
		Ppaiment.saisir_Cart_Number(string);
	    
	}

	@When("Entree CVC et la date d Expiration {string} le mois {string} et annee {string}")
	public void entree_cvc_et_la_date_d_expiration_le_mois_et_annee(String string, String string2, String string3) {
		Ppaiment.saisir_CVC(string);
		Ppaiment.saisir_D_E_Mois(string2);
		Ppaiment.saisir_D_E_Annee(string3);
	    
	}

	@When("cliquer sur bt Pay and Confirm Order")
	public void cliquer_sur_bt_pay_and_confirm_order() {
		Ppaiment.App_sur_Confirm_Order();
	  
	}

	@Then("verif le message {string}")
	public void verif_le_message(String string) {
	    
	}
}
