import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DestinationPage {
    WebDriver driver;

    @FindBy(id="Comprendre")
    private WebElement Comprendre;
    public Header header;
    public NavigationPanel navigationPanel;

    public DestinationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        header = new Header(driver);
        navigationPanel = new NavigationPanel(driver);
        WebDriverWait wait10 = new WebDriverWait(driver, 10);
        wait10.until(ExpectedConditions.visibilityOf(Comprendre));
    }
}
