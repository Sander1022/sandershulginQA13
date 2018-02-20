import org.openqa.selenium.firefox.FirefoxOptions;
<<<<<<< HEAD
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
=======
import org.testng.annotations.*;
>>>>>>> origin/master

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

<<<<<<< HEAD
public class LoginTrelloTest {
    FirefoxDriver wd;
    
    @BeforeClass
    public void setUp() throws Exception {
        wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
=======
public class LoginTrelloTest extends TestBase {

>>>>>>> origin/master
    @Test
    public void LoginTrelloTest() {
        clickLogInButton();
        enterUserName("elena.telran@yahoo.com");
        enterPassword("12345.com");
        confirmLogInButton();
        logout();

    }

}