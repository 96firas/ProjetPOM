package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import Hooks.Setup;
public class PagePaiement {
	public WebDriver driver;
	public  PagePaiement(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.NAME, using = "name_on_card")
	public WebElement NameCart;
	
	@FindBy(how = How.NAME, using = "card_number")
	public WebElement CartNumber;
	
	@FindBy(how = How.NAME, using = "cvc")
	public WebElement CVC;
	
	@FindBy(how = How.NAME, using = "expiry_month")
	public WebElement Mois;
	
	@FindBy(how = How.NAME, using = "expiry_year")
	public WebElement Annee;
	
	@FindBy(how = How.ID, using = "submit")
	public WebElement Bt_Pay_and_Confirm_Order;
	
	public void GetUrl(String url) {
		driver.get(url);
	}
	
	public void saisir_Name_Cart(String NC) {
		NameCart.sendKeys(NC);
		
	}
	public void saisir_Cart_Number(String NumC) {
		CartNumber.sendKeys(NumC);
		
	}
	public void saisir_CVC(String CvC) {
		CVC.sendKeys(CvC);
	}
	
	
	public void saisir_D_E_Mois(String DEMois) {
		Mois.sendKeys(DEMois);
		
		
	}
	public void saisir_D_E_Annee(String DAnnee) {
		Annee.sendKeys(DAnnee);
	}
	public void App_sur_Confirm_Order() {
		Bt_Pay_and_Confirm_Order.click();}
		
	}


