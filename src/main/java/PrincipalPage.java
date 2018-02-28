import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrincipalPage {
    WebDriver driver;

    @FindBy (id="searchInput")
    private WebElement searchInput;

    @FindBy (id="searchButton")
    private WebElement searchButton;

    @FindBy (className="central-featured")
    private WebElement languageChoice;

    public PrincipalPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public DestinationPage Research(String research){
        searchInput.sendKeys(research);
        searchButton.click();
        return new DestinationPage(driver);
    }

    public HomePage OpenFrPage(){
        languageChoice.findElement(By.className("lang4")).click();
        return new HomePage(driver);
    }

    public void OpenEsPage(){
        languageChoice.findElement(By.className("lang3")).click();
    }

    public void OpenEnPage(){
        languageChoice.findElement(By.className("lang1")).click();
    }

}
