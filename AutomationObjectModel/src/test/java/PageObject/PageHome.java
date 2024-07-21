package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageHome {

	public WebDriver driver;

	// creation de constructeur
	
	public PageHome(WebDriver driver) {
		this.driver= driver;
	    PageFactory.initElements( driver,this);
		
	}

	// identification des elements (design pattern)
	@FindBy(how = How.XPATH, using = "//a[text()=' Signup / Login']")
	public WebElement bt_signupLogin;
	@FindBy(how = How.XPATH, using = "//input[@data-qa='signup-name']")
	public WebElement name;
	@FindBy(how = How.XPATH, using = "//input[@data-qa='signup-email']")
	public WebElement Email;
	@FindBy(how = How.XPATH, using = "//button[@data-qa='signup-button']")
	public WebElement signup_bt;
	@FindBy(how = How.ID, using = "id_gender1")
	public WebElement Mr_check, Mrs_check;
	@FindBy(how = How.ID, using = "password")
	public WebElement psswrd;
	@FindBy(how = How.ID, using = "days")
	public WebElement day;
	@FindBy(how = How.ID, using = "months")
	public WebElement mois;
	@FindBy(how = How.ID, using = "years")
	public WebElement year;
	@FindBy(how = How.XPATH, using = "//input[@type='checkbox']")
	public WebElement check;
	@FindBy(how = How.ID, using = "first_name")
	public WebElement First_name;
	@FindBy(how = How.ID, using = "last_name")
	public WebElement Last_name;
	@FindBy(how = How.ID, using = "company")
	public WebElement company;
	@FindBy(how = How.ID, using = "address1")
	public WebElement adresse;
	@FindBy(how = How.ID, using = "country")
	public WebElement country;
	@FindBy(how = How.ID, using = "state")
	public WebElement le_stat;
	@FindBy(how = How.ID, using = "city")
	public WebElement le_city;
	@FindBy(how = How.ID, using = "zipcode")
	public WebElement zipcode;
	@FindBy(how = How.ID, using = "mobile_number")
	public WebElement le_phone_number;
	@FindBy(how = How.XPATH, using = "//button[@data-qa='create-account']")
	public WebElement bt_creat_account;
    @FindBy(how=How.XPATH, using ="//h2[@data-qa='account-created']")
    public WebElement txt_compte_cree;
    @FindBy(how=How.XPATH, using ="//input[@data-qa='login-email']")
    public WebElement lemail_adress;
    @FindBy(how=How.XPATH, using = "//input[@data-qa='login-password']")
    public WebElement Password;
    @FindBy(how=How.XPATH, using="//button[@data-qa='login-button']")
    public WebElement bt_lg;
	
    
	// creation des methodes
	public void GetUrl(String url) {
		driver.get(url);

	}

	public void cliquer_bt_signLogin() {
		bt_signupLogin.click();

	}

	public void saisirNom(String Name) {
		name.sendKeys(Name);
	}

	public void saisirMail(String E_mail) {

		Email.sendKeys(E_mail);
	}

	public void cliquer_sgn() {
		signup_bt.click();

	}

	public void selectionne_genre(String Mrcheck) {
		if (Mrcheck.equals("Mr")) {
			Mr_check.click();

		} else {

			Mrs_check.click();
		}

	}

	public void saisir_le_mot_de_passe(String passwrd) {
		psswrd.sendKeys(passwrd);

	}

	public void selectionne_date_mois_et_annee_(String jour, String Mois, String annee) {
		Select liste_day = new Select(day);
		liste_day.selectByValue(jour);
		Select liste_mois = new Select(mois);
		liste_mois.selectByValue(Mois);
		Select liste_year = new Select(year);
		liste_year.selectByValue(annee);

	}

	public void cocher_les_options() {
		check.click();
	}

	public void first_name_et(String FN) {

		First_name.sendKeys(FN);
	}

	public void last_name_et(String LN) {

		Last_name.sendKeys(LN);
	}

	public void saisir_le_company_et_saisir_l_adresse_et_selectionner_country(String string, String string2,
			String string3) {
		company.sendKeys(string);
		adresse.sendKeys(string2);
		Select country_list = new Select(country);
		country_list.selectByValue(string3);
	}

	public void saisir_stat(String Stat) {
		le_stat.sendKeys(Stat);
	}

	public void saisir_city(String City) {

		le_city.sendKeys(City);
	}

	public void saisir_zipcode(String Zip) {
		zipcode.sendKeys(Zip);
	}

	public void saisir_phone(String Phone) {
		le_phone_number.sendKeys(Phone);

	}

	public void cliquer_bt_creat_account() {
		bt_creat_account.click();

	}

	

	public String textAfiche() {
		String txt_obtenu = txt_compte_cree.getText();
		return txt_obtenu;
		
	}
	public void Saisir_Email(String ajmail) {
		lemail_adress.sendKeys(ajmail);
		
	}
    public void ajouter_mdp(String mdp) {
    	Password.sendKeys(mdp);
    	
    }
   public void App_sur_bt() {
	   bt_lg.click();
	   
   }
	
	

}
