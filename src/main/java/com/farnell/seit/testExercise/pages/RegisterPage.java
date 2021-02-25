package com.farnell.seit.testExercise.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {

    WebDriver driver;
    WebDriverWait wait;

    //Page factory Object definition
    
    //User Name text field
    @FindBy(id = "logonId")
    WebElement userName;

    //Password text field
    @FindBy(id = "logonPassword]")
    WebElement password;

    //First Name text field
    @FindBy(id = "firstName")
    WebElement firstName;

    //Email text field
    @FindBy(id = "email1")
    WebElement email;

    //Remember me check box
    @FindBy(id = "rememberMe")
    WebElement rememberMe;

    //Register button
    @FindBy(id = "registerValidate")
    WebElement registerButton;

    public RegisterPage(WebDriver driver) 
    {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);

    }

    //Method to enter user name    
    public void setUserName(String userNamestr) 
    {
        wait.until(ExpectedConditions.visibilityOf(userName));
        userName.sendKeys(userNamestr);
    }

    //Method to enter user password    
    public void setPassword(String passwordsStr) 
    {
        password.sendKeys(passwordsStr);
    }

    //Method to enter user password    
    public void setFirstName(String firstNameStr) 
    {
        firstName.sendKeys(firstNameStr);
    }

    //Method to enter user password    
    public void setEmail(String emailStr) 
    {
        email.sendKeys(emailStr);
    }

    //Method to check/un check rememberMe check box    
    public void checkRememberMe(Boolean check) 
    {
        if (check && !rememberMe.isSelected()) 
        {
            rememberMe.click();
        }

        if (!check && rememberMe.isSelected()) 
        {
            rememberMe.click();
        }
    }

    //Method to whether checkbox is checked   
    public boolean isRememberMeChecked() 
    {
        return (rememberMe.isSelected());
    }

    //Method to click on Register Button    
    public void clickRegisterButton() 
    {
        wait.until(ExpectedConditions.visibilityOf(registerButton));
        registerButton.click();
    }
}