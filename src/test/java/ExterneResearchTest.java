import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExterneResearchTest {
    WebDriver driver;
    String recherche;

    @Before
    public void init(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.wikivoyage.org/");
    }

    @Test
    public void ExterneResearch(){
        recherche = System.getProperty("recherche");
        PrincipalPage principalPage = new PrincipalPage(driver);
        principalPage.Research(recherche);
    }

}

