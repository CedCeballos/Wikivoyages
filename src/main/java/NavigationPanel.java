import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationPanel {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"n-mainpage\"]/a")
    private WebElement accueil;


    public NavigationPanel(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public HomePage returnHomePage () {
        accueil.click();
        return new HomePage(driver);
    }
}
