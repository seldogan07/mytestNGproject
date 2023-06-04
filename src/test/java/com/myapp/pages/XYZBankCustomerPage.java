package com.myapp.pages;

import com.myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class XYZBankCustomerPage {
    public XYZBankCustomerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "userSelect")
    public WebElement yourNameDropDown;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//button[@ng-class='btnClass2']")
    public WebElement depositButton;

    @FindBy(xpath = "//input[@placeholder='amount']")
    public WebElement amountToBeDepositedInput;

    @FindBy(xpath = "//button[.='Deposit']")
    public WebElement depositSubmitButton;

    @FindBy(xpath = "//span[.='Deposit Successful']")
    public WebElement depositSuccessfulMessage;

    @FindBy(xpath = "//button[@ng-class='btnClass3']")
    public WebElement withdrawlButton;

    @FindBy(xpath = "//input[@placeholder='amount']")
    public WebElement amountToBeWithdrawnInput;

    @FindBy(xpath = "//button[.='Withdraw']")
    public WebElement withdrawSubmitButton;

    @FindBy(xpath = "//span[.='Transaction successful']")
    public WebElement transactionSuccessfulMessage;
}
