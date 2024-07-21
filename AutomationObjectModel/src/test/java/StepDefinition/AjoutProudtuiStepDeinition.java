package StepDefinition;

import org.openqa.selenium.WebDriver;

import Hooks.Setup;
import PageObject.PageHome;
import PageObject.PageProduit;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AjoutProudtuiStepDeinition {
	WebDriver driver = Setup.driver;
	PageProduit PP = new PageProduit(driver);

	@Then("cliquer sur bt produit")
	public void cliquer_sur_bt_produit() {
		PP.cliquer_bt_Prdcts();

	}

	@Given("passer la souris sur produit1 et cliquer sur Add to cart")
	public void passer_la_souris_sur_produit1_et_cliquer_sur_add_to_cart() {
		PP.ajout_prd1();

	}

	@Given("Cliquer sur boutton Continue Shopping")
	public void cliquer_sur_boutton_continue_shopping() {
		PP.cliquer_C_S();

	}

	@Given("passer la souris sur produit2 et cliquer sur Add to cart")
	public void passer_la_souris_sur_produit2_et_cliquer_sur_add_to_cart() {
		PP.ajout_prd2();

	}
	@Given("cliquer sur le booutton view cart")
	public void cliquer_sur_le_booutton_view_cart() {
	    PP.cliqueer_view_cart();
	}


	@Given("verifier l ajout de deux produit {string} et {string}")
	public void verifier_l_ajout_de_deux_produit_et(String string, String string2) {

	}

	@Given("verifier le prix {string} {string} , quantité {string} {string}")
	public void verifier_le_prix_quantité(String string, String string2, String string3, String string4) {

	}
	

	@Given("le prix total {string} {string}")
	public void le_prix_total(String string, String string2) {

	}

	@Given("Cliquer sur bt prceed to checkout")
	public void cliquer_sur_bt_prceed_to_checkout() {
		PP.cliquer_bt_checkout();

	}

	@Given("entrer la description {string} et click sur bt Place Order")
	public void entrer_la_description_et_click_sur_bt_place_order(String string) {
		PP.descrp(string);
		PP.clq_place_order();

	}

}
