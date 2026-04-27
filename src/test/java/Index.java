import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Index {
    private static final Logger log = LoggerFactory.getLogger(Index.class);
    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("file:///C:/Users/Nina/Downloads/21.index%201.html");
    }

    @Test
    public void tableTest(){
        //Canada
        WebElement canada = wd.findElement(By.cssSelector("tr:nth-child(3) td:last-child"));
        Assert.assertEquals(canada.getText(),"Canada");
    }


    @Test
    public void cssLocators() {
        //by tagName
        WebElement button = wd.findElement(By.tagName("button"));
        WebElement button1 = wd.findElement(By.cssSelector("button"));

        List<WebElement> list = wd.findElements(By.tagName("a"));
        int i = list.size();
        List<WebElement> list1 = wd.findElements(By.cssSelector("a"));

        // by class
        WebElement divContainer = wd.findElement(By.className("container"));
        WebElement divContainer1 = wd.findElement(By.cssSelector(".container"));

        List<WebElement> navList = wd.findElements(By.className("nav-item"));
        List<WebElement> navList1 = wd.findElements(By.cssSelector(".nav-item"));

        // by id;

        WebElement nav = wd.findElement(By.id("nav"));
        WebElement nav1 = wd.findElement(By.cssSelector("#nav"));

        //by attribute
        WebElement inputEmail = wd.findElement(By.cssSelector("[placeholder = 'Type your name']"));
        // start
        WebElement inputEmail1 = wd.findElement(By.cssSelector("[placeholder^='Type']"));
        // end
        WebElement inputEmail2 = wd.findElement(By.cssSelector("[placeholder$='name']"));
        // contains
        WebElement inputEmail3 = wd.findElement(By.cssSelector("[placeholder*='your'"));

        WebElement a3 = wd.findElement(By.cssSelector("[href = '#item']"));

        //by name
        WebElement inputS = wd.findElement(By.cssSelector("[name = 'surename'"));
        WebElement inputS1 = wd.findElement(By.name("surename"));

        // By.linkText && By.partialLinkText
        WebElement a = wd.findElement(By.linkText("Item 1"));
        WebElement a1 = wd.findElement(By.partialLinkText("m 1"));


    }
}
