package Pages;

import Base.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {
    @FindBy(name="userName")
    private  WebElement userNameTextField;

    @FindBy(name="password")
    private WebElement passwordTextField;
    @FindBy(name="submit")
    private WebElement submitButton;

    public LoginPage(WebDriver driver){
        super(driver);
    }

    public void enterUserName(String userName){
        this.userNameTextField.sendKeys(userName);
    }

    public void enterPassword(String password){
        this.passwordTextField.sendKeys(password);
    }

    public void pressSubmitButton(){
        this.submitButton.click();
    }


}
