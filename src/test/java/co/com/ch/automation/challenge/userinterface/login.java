package co.com.ch.automation.challenge.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class login extends PageObject {

    public static final Target USERNAME = Target.the("Option for show all products").located(By.id("LoginPanel0_Username"));
    public static final Target PASSWORD = Target.the("Option for select or person type").located(By.id("LoginPanel0_Password"));

    public static final Target BUTTON = Target.the("Message for detail a products of people").located(By.id("LoginPanel0_LoginButton"));
}
