import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResearchTest {
    WebDriver driver;

    @Before
    public void init(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.wikivoyage.org/");
    }

    @Test
    public void DestinationResearchFromPrincipalPage(){
        PrincipalPage principalPage = new PrincipalPage(driver);
        principalPage.Research("Cameroun");
    }


    @Test
    public void DestinationResearchFromDestinationPage() {
        PrincipalPage principalPage = new PrincipalPage(driver);
        principalPage.Research("Cameroun").header.Research("Paris");

        /* Explication du fonctionnement de la ligne de code 26

        PrincipalPage principalPage = new PrincipalPage(driver);
        principalPage.Research("Cameroun");
        DestinationPage destinationPage = new DestinationPage(driver);
        destinationPage.searchInDestinationPage();
        Header  header = new Header(driver);
        header.Research("Paris");

         */
    }

    @Test
    public void HomePageFromDestinationPage(){
        PrincipalPage principalPage = new PrincipalPage(driver);
        principalPage.Research("Cameroun").navigationPanel.returnHomePage();
    }

    @After
    public void quit(){
        driver.quit();
    }
}
