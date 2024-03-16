package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.SectionPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class SectionStepdefinations {
    SectionPage sectionPage = new SectionPage();


    @Given("kullanici sanctionScannerUrl anasayfaya gider")
    public void kullanici_section_scanner_url_anasayfaya_gider() {
        utilities.Driver.getDriver().get(ConfigReader.getProperty("sectionScannerUrl"));
    }

    @Given("Login tusuna basar")
    public void login_tusuna_basar() {
        ReusableMethods.bekle(3);
        sectionPage.login.click();
    }

    @Given("Username ve password girer")
    public void username_ve_password_girer() {
        sectionPage.userName.click();
        sectionPage.userName.sendKeys("askfedakarlikister@gmail.com");
        sectionPage.password.click();
        ReusableMethods.bekle(2);
        sectionPage.password.sendKeys("12345678");
        sectionPage.LoginButton.click();
    }

    @Then("Dogru password ve mail olmadan giris yapamadigini dogrular")
    public void dogru_password_ve_mail_olmadan_giris_yapamadigini_dogrular() {
        sectionPage.inCorrectYaziElementi.getText();
        ReusableMethods.bekle(2);
    }

    @Then("Sayfa kapatılır")
    public void sayfa_kapatılır() {
        ReusableMethods.bekle(2);
        Driver.closeDriver();
    }

    @Given("Basliklarin gorunurluk  test eder")
    public void basliklarin_aktif_oldugunu_test_eder() {
       sectionPage.productsElementi.isDisplayed();
       sectionPage.industries.isDisplayed();
       sectionPage.resources.isDisplayed();
       sectionPage.company.isDisplayed();

        }
    @Given("Developer linkine tiklar")
    public void developer_linkine_tiklar() {

        sectionPage.devoloperElementi.click();
    }
    @Given("Start integration a tiklar")
    public void start_integration_a_tiklar() {

        sectionPage.startIntegrationElementi.click();
    }
    @Then("Developer sayfasinda oldugunu test eder")
    public void developer_sayfasinda_oldugunu_test_eder() {


        sectionPage.genaralInformation.isDisplayed();



    }

}
