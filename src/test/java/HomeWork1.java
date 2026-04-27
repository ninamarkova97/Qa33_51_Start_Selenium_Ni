import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWork1 {
    WebDriver wd;


    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void cssLocators() {
        // byTagName
        WebElement div = wd.findElement(By.tagName("div"));
        WebElement div1 = wd.findElement(By.cssSelector("div"));

        WebElement a = wd.findElement(By.tagName("a"));
        WebElement a1 = wd.findElement(By.cssSelector("a"));

        WebElement h1 = wd.findElement(By.tagName("h1"));
        WebElement h11 = wd.findElement(By.cssSelector("h1"));

        WebElement form = wd.findElement(By.tagName("form"));
        WebElement form1 = wd.findElement(By.cssSelector("form"));

        WebElement input = wd.findElement(By.tagName("input"));
        WebElement input1 = wd.findElement(By.cssSelector("input"));

        List<WebElement> divList = wd.findElements(By.tagName("div"));
        List<WebElement> divList1 = wd.findElements(By.cssSelector("div"));

        //by class
        WebElement navbar_component_nav = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement navbar_component_nav1 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));

        WebElement login = wd.findElement(By.className("login_login__3EHKB"));
        WebElement login1 = wd.findElement(By.cssSelector(".login_login__3EHKB"));

        WebElement container = wd.findElement(By.className("container"));
        WebElement container1 = wd.findElement(By.cssSelector(".container"));

        //by id
        WebElement root = wd.findElement(By.id("root"));
        WebElement root1 = wd.findElement(By.cssSelector("#root"));

        //by attribute
        WebElement submit = wd.findElement(By.cssSelector("[type='submit']"));

        //by one elements find attribute ==> start&end& contains value
        WebElement password = wd.findElement(By.cssSelector("[placeholder ^='Pass']"));

        WebElement password1 = wd.findElement(By.cssSelector("[placeholder='word']"));

        WebElement password2 = wd.findElement(By.cssSelector("[placeholder='sswo']"));



    }

}

