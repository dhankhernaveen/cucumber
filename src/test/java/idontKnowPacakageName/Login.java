package idontKnowPacakageName;

import driver.TestBase;

public class Login extends TestBase {


    //CLICK SIGN IN LINK
    public void clickSignin() {
        driver.findElement("").click();
    }

    //SWITCH FRAME FROM PARENT FRAME TO LOGIN FRAME
    public void switchFrame(){
        WebElement body = driver.findElement(By.id("authiframe"));
        driver.switchTo().frame(body);
    }

    //SET USER NAME AND SEND VALUE TO IT
    public void setUserName(String userName) {
        Boolean abc = driver.findElement(userName).isDisplayed();
        System.out.println("USER NAME TEXT BOX IS DISPLAYED");

        driver.findElement(userName).sendKeys("");
    }

    //SEND VALUE TO PASSWORD
    public void setPassword(){
        driver.findElement(passWord).sendKeys("");
    }

    //CLICK ON SIGN IN BUTTON
    public void clickSignInButton() {
        driver.findElement(signInButton).click();
    }

    //GET TEXT FROM TITLE OF SIGN IN BUTTON
    public String getLoginTitle(){
        return driver.findElement(titleText).getText();
    }

    //CHECK WHETHER BUTTON IS ENABLED
    public String getSignInButtonTitle(){
        Boolean a = driver.findElement(signIn).isEnabled();
        String j = a.toString();
        return j;
    }

    //SWITCH BACK TO PARENT WINDOW
    public void switchToWindow(){
        String currentWindow = driver.getWindowHandle();
        driver.switchTo().window(currentWindow);
    }

    //SIGN IN TO IBIBO
    public void signInToSalesForce(){
       // this.setUserName();
        this.setPassword();
        this.clickSignInButton();

    }

}
