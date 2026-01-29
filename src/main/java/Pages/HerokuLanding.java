package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.time.Duration;
import org.openqa.selenium.support.ui.Select;
import Base.BaseClass;

public class HerokuLanding extends BaseClass{

private WebDriver driver;

public HerokuLanding(WebDriver driver)
{

    this.driver=driver;
}

public void HerokuHomepage()
{

    driver.get("https://the-internet.herokuapp.com/");
    
}

public void ABTestingPage()
{
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
   By abtesting= By.cssSelector("a[href='/abtest']");
   driver.findElement(abtesting).click();
}


public void CheckBoxesPage()
{

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.findElement(By.cssSelector("a[href='/checkboxes']")).click();

}



public void Check()
{
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.findElement(By.xpath("//form[@id='checkboxes']//input[@type='checkbox'][1]")).click();

}

public void uncheck()
{

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.findElement(By.xpath("//form[@id='checkboxes']//input[@type='checkbox'][2]")).click();

}


public void dropdownpage()
{
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.findElement(By.cssSelector("a[href='/dropdown']")).click();
}


public void selectfromdown(String options)
{

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    Select item=new Select(driver.findElement(By.id("dropdown")));
    item.selectByValue(options);
    System.out.println("Successfully selected option"+options);
}
}
