import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    WebDriver driver;

    @FindBy(id="firstHeading")
    private WebElement firstHeading;

    public Header header;
    public NavigationPanel navigationPanel;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        header = new Header(driver);
        navigationPanel = new NavigationPanel(driver);
        WebDriverWait wait10 = new WebDriverWait(driver, 10);
        wait10.until(ExpectedConditions.visibilityOf(firstHeading));
    }
}
