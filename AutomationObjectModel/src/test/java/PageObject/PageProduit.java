package PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Hooks.Setup;

public class PageProduit {
	public WebDriver driver;

	public PageProduit(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//a[@href='/products']")
	public WebElement bt_Product;

	@FindBy(how = How.XPATH, using = "//div[@class='productinfo text-center']")
	public List<WebElement> Produit1;

	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-default add-to-cart']")
	public  List<WebElement> bt_Add_cart1;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Continue Shopping']")
	public WebElement bt_C_S;



	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Blue Top']")
	public WebElement Blue_Top;

	@FindBy(how = How.XPATH, using = "//u[normalize-space()='View Cart']")
	public WebElement bt_view_cart;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='1']")
	public WebElement Qtt;

	@FindBy(how = How.XPATH, using = "//p[@class='cart_total_price']")
	public WebElement PT;

	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-default check_out']")
	public WebElement bt_prceed_to_checkout;

	@FindBy(how = How.XPATH, using = "//textarea[@class='form-control']")
	public WebElement la_description;

	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-default check_out']")
	public WebElement bt_Place_Order;

	// creation des methodes

	public void GetUrl(String url) {
		driver.get(url);
	}

	public void cliquer_bt_Prdcts() {

		bt_Product.click();

	}

	public void ajout_prd1() {
		Actions action2 = new Actions(driver);
		action2.moveToElement(Produit1.get(0));
		bt_Add_cart1.get(0).click();
	}

	public void cliquer_C_S() {
		bt_C_S.click();

	}

	public void ajout_prd2() {
		Actions action = new Actions(driver);
		action.moveToElement(Produit1.get(2));
		bt_Add_cart1.get(2).click();
	}

	public void cliqueer_view_cart() {
		bt_view_cart.click();

	}

	/*
	 * public void verf_l_ajou_de_produit() { if (.equals(Blue_Top)) {
	 * 
	 * }
	 * 
	 * }
	 * 
	 * public void verf_Pr_etQuan() { }
	 */

	public void cliquer_bt_checkout() {
		bt_prceed_to_checkout.click();

	}

	public void descrp(String desc) {
		la_description.sendKeys(desc);

	}

	public void clq_place_order() {
		bt_Place_Order.click();

	}

}
