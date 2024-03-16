package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SectionPage {


    public SectionPage(){
        PageFactory.initElements( utilities.Driver.getDriver(),this);

    }
    @FindBy(xpath= "(//a[@class='btn btn-yellow btn-sm'])[3]")
    public WebElement login;
   @FindBy(xpath = "//input[@id='username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='button']")
    public WebElement LoginButton;

    @FindBy(xpath = "//div[@class='toast toast-error']")
    public WebElement inCorrectYaziElementi;

    @FindBy(xpath = "(//a[@class='nav-link has-submenu'])[5]")
    public WebElement productsElementi;

    @FindBy(xpath = "(//a[@class='nav-link has-submenu'])[6]")
    public WebElement industries;

    @FindBy(xpath = "(//a[@class='nav-link has-submenu'])[7]")
    public WebElement resources;

    @FindBy(xpath = "(//a[@class='nav-link has-submenu'])[8]")
    public WebElement company;

    @FindBy(xpath = "(//a[@class='nav-link'])[2]")
    public WebElement devoloperElementi;

    @FindBy(xpath = "//a[@class='btn btn-white btn-xl btn-outline']")
    public WebElement startIntegrationElementi;

    @FindBy(xpath = "//a[text()='General Informations ']")
    public WebElement genaralInformation;

}
