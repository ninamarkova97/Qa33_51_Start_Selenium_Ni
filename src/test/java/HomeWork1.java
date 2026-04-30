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
    public void classwork2(){
        WebElement button = wd.findElement(By.cssSelector("[name='login'"));
        String text = button.getText();
        System.out.println(text);

        WebElement form = wd.findElement(By.xpath("//form"));
        String textForm = form.getText();

        System.out.println("******************");
        System.out.println(textForm);

        WebElement html = wd.findElement(By.tagName("html"));
        String textAll = html.getText();
        System.out.println("****************");
        System.out.println(textAll);

            WebElement br = wd.findElement(By.tagName("br"));
        System.out.println("************");
        System.out.println("text br --->" + br.getText());
    }

    @Test
            public void classwork(){
        //parent
        WebElement el = wd.findElement(By.xpath("//h1/parent::*"));
        WebElement el1 = wd.findElement(By.xpath("//h1/parent::div"));
        WebElement el2 = wd.findElement(By.xpath("//h1/.."));

        //ancestor
        WebElement el13 = wd.findElement(By.xpath("//h1/ancestor::*")); //all
        WebElement el14 = wd.findElement(By.xpath("//h1/ancestor::div"));// two options
        WebElement el15 = wd.findElement(By.xpath("//h1/ancestor::div[1]")); // one options

        WebElement el16 = wd.findElement(By.xpath("//h1/ancestor-or-self::*"));
        List<WebElement>list = wd.findElements(By.xpath("//h1/ancestor-or-self::*"));
        //following-sibling
        List<WebElement> list1 = wd.findElements(By.xpath("//h1/following-sibling::a"));

        //preceding-sibling
        WebElement el17 = wd.findElement(By.xpath("//a[3]/preceding-sibling::a[2]"));
        List<WebElement> list2 = wd.findElements(By.xpath("//a[3]/preceding-sibling::*"));


    }


    @Test
    public void cssLocators() {
        // byTagName
        WebElement div = wd.findElement(By.tagName("div"));
        WebElement div1 = wd.findElement(By.cssSelector("div"));
        WebElement div2 = wd.findElement(By.xpath("//div"));

        WebElement h1 = wd.findElement(By.tagName("h1"));
        WebElement h11 = wd.findElement(By.cssSelector("h1"));
        WebElement h1_2 = wd.findElement(By.xpath("//h1"));

        WebElement a = wd.findElement(By.tagName("a"));
        WebElement a1 = wd.findElement(By.cssSelector("a"));
        WebElement a2 = wd.findElement(By.xpath("//a"));
        List<WebElement> list_a = wd.findElements(By.cssSelector("a"));
        List<WebElement> list_a1 = wd.findElements(By.xpath("//a"));

        WebElement a3_css = wd.findElement(By.cssSelector("a:nth-child(3)"));
        WebElement a3 = wd.findElement(By.xpath("//a[3]"));


        WebElement form = wd.findElement(By.tagName("form"));
        WebElement form1 = wd.findElement(By.cssSelector("form"));

        WebElement input = wd.findElement(By.tagName("input"));
        WebElement input1 = wd.findElement(By.cssSelector("input"));

        WebElement button = wd.findElement(By.tagName("button"));
        WebElement button1 = wd.findElement(By.cssSelector("button"));


        List<WebElement> divList = wd.findElements(By.tagName("div"));
        List<WebElement> divList1 = wd.findElements(By.cssSelector("div"));

        //by class
        WebElement container = wd.findElement(By.className("container"));
        WebElement container1 = wd.findElement(By.cssSelector(".container"));
        WebElement el2 = wd.findElement(By.xpath("//div[@class = 'container']"));

        WebElement navbar_component_nav = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement navbar_component_nav1 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement navbar_component_xpath = wd.findElement(By.xpath("//div[@class='navbar-component_nav__1X_4m']"));

        WebElement login = wd.findElement(By.className("login_login__3EHKB"));
        WebElement login1 = wd.findElement(By.cssSelector(".login_login__3EHKB"));
        WebElement login_xpath = wd.findElement(By.xpath("//div[@class ='login_login__3EHKB']"));



        //by id
        WebElement root = wd.findElement(By.id("root"));
        WebElement root1 = wd.findElement(By.cssSelector("#root"));
        WebElement el16 = wd.findElement(By.xpath("//*[@id='root']"));

        //by attribute
        WebElement hrefHome = wd.findElement(By.cssSelector("[href = '/home'"));
        WebElement el17 = wd.findElement(By.xpath("//*[@href = '/home']"));

        WebElement hrefAbout = wd.findElement(By.cssSelector("[href = '/about'"));
        WebElement hrefAboutXpath = wd.findElement(By.xpath("//*[@href='/about']"));

        WebElement submit = wd.findElement(By.cssSelector("[type='submit']"));
        WebElement submitXpath = wd.findElement(By.xpath("//button[@type='submit']"));

        WebElement el10 = wd.findElement(By.cssSelector("[name = 'email']"));
        WebElement el11 = wd.findElement(By.name("email"));
        WebElement el13 = wd.findElement(By.xpath("//*[@name='email']"));

        WebElement el12 = wd.findElement(By.cssSelector("[placeholder = 'Password']"));
        WebElement el14 = wd.findElement(By.xpath("//*[@placeholder = 'Password']"));

        //by one elements find attribute ==> start&end& contains value
        //start
        WebElement password = wd.findElement(By.cssSelector("[placeholder ^='Pass']"));
        WebElement pass_xpath = wd.findElement(By.xpath("//input[starts-with(@placeholder, 'Pa')]"));
        //end
        WebElement password1 = wd.findElement(By.cssSelector("[placeholder$='word']"));
        WebElement pass_xpath1 = wd.findElement(By.xpath("//*[contains(@placeholder, 'rd')]"));
        //contains
        WebElement password2 = wd.findElement(By.cssSelector("[placeholder*='sswo']"));
        WebElement pass_xpath2 = wd.findElement(By.xpath("//*[contains(@placeholder, 'wo')]"));


    }

}

