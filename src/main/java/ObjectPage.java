import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ObjectPage {
    public WebDriver driver;

    public ObjectPage (WebDriver driver){
        this.driver = driver;
    }

    private By market = By.xpath("(//a[@class='tabCategory collapsed']/span)[1]");
    private By vegetables = By.xpath("(//ul[@class='forthMenu collapse']/li/a)[1]");
    private By plusPotato = By.xpath("(//div[@class='input-group bootstrap-touchspin buttonsShow']/span)[1]");
    private By Potato = By.xpath("(//ul[@class='tileContainer']/li)[1]");
    private By cart = By.xpath("(//div[@class='middleContentBox']/section)[1]");
    private By closepop =By.xpath("(//div[@class='loginModalTop']/button)[1]");
    private By purpleOnion = By.xpath("(//a[@class='imgContainer']/img)[11]");
    private By cosbra = By.xpath("(//a[@class='imgContainer']/img)[18]");
    private By pluscosbra = By.xpath("(//div[@class='input-group bootstrap-touchspin buttonsShow']/span)[77]");
    private By search = By.id("js-site-search-input");
    private By plusmlik =By.xpath("(//div[@class='input-group bootstrap-touchspin buttonsShow']/span)[1]");
    private By addmilk = By.xpath("//div[contains(@class,'tt-dataset tt-dataset-product-ds')]//div[2]//div[1]//form[1]//button[2]");
    private By Payable = By.xpath("//a[contains(@class,'btnSubmit posR')]");
    private By username = By.id("j_username");
    private By password = By.id("j_password");
    private By ok = By.xpath("//div[@class='bottomSide']//button[@class='btn big']");




    public WebElement getmarket (){
        return driver.findElement(market);
    }
    public WebElement getvegetables (){
        return driver.findElement(vegetables);
    }
    public WebElement getplusPotato (){
        return driver.findElement(plusPotato);
    }
    public WebElement getPotato (){
        return driver.findElement(Potato);
    }
    public WebElement getcart (){
        return driver.findElement(cart);
    }
    public WebElement getclosepop (){
        return driver.findElement(closepop);
    }
    public WebElement getpurpleOnion (){
        return driver.findElement(purpleOnion);
    }
    public WebElement getcosbra (){
        return driver.findElement(cosbra);
    }
    public WebElement getpluscosbra (){
        return driver.findElement(pluscosbra);
    }
    public  WebElement getsearch (){
        return driver.findElement(search);
    }
    public  WebElement getplusmlik (){
        return driver.findElement(plusmlik);
    }
    public WebElement getaddmilk(){
     return driver.findElement(addmilk);
    }
    public WebElement getPayable(){
        return driver.findElement(Payable);
    }
    public WebElement getusername(){
        return driver.findElement(username);
    }
    public WebElement getpassword (){
        return driver.findElement(password);
    }
    public WebElement getok (){
        return driver.findElement(ok);
    }
 }


