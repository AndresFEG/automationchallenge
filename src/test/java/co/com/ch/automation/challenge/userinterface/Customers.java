package co.com.ch.automation.challenge.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Customers extends PageObject {

    public static final Target LABEL1 = Target.the("Option for show all products").located(By.xpath("//*[@id=\"nav_menu1_2\"]/li[1]/a/span"));
    public static final Target LABEL2 = Target.the("Option for select or person type").located(By.xpath("//*[@id=\"nav_menu1_2_1\"]/li[1]/a/span"));
    public static final Target ADD = Target.the("Option for select or person type").located(By.xpath("//*[@id=\"GridDiv\"]/div[2]/div[2]/div/div/div[1]/div/span/i"));
    public static final Target CUSTOMER_ID = Target.the("Option for select or person type").located(By.id("Serenity_Demo_Northwind_CustomerDialog9_CustomerID"));
    public static final Target COMPANY = Target.the("Option for select or person type").located(By.id("Serenity_Demo_Northwind_CustomerDialog9_CompanyName"));
    public static final Target CONTACT = Target.the("Option for select or person type").located(By.id("Serenity_Demo_Northwind_CustomerDialog9_ContactName"));
    public static final Target ADDRESS = Target.the("Option for select or person type").located(By.id("Serenity_Demo_Northwind_CustomerDialog9_Address"));
    public static final Target COUNTRIES = Target.the("Option for select or person type").located(By.id("s2id_Serenity_Demo_Northwind_CustomerDialog9_Country"));
    public static final Target COUNTRY = Target.the("Option for select or person type").located(By.id("select2-result-label-14"));
    public static final Target CITIES = Target.the("Option for select or person type").located(By.id("s2id_Serenity_Demo_Northwind_CustomerDialog9_City"));
    public static final Target CITY = Target.the("Option for select or person type").located(By.xpath("//*[@id=\"select2-result-label-38\"]/text()"));
    public static final Target SAVE = Target.the("Option for select or person type").located(By.xpath("//*[@id=\"Serenity_Demo_Northwind_CustomerDialog9_Toolbar\"]/div/div/div/div[1]/div/span"));
    public static final Target SEARCH = Target.the("Option for select or person type").located(By.xpath("//*[@id=\"GridDiv\"]/div[2]/div[1]/input"));
    public static final Target RESULT = Target.the("Option for select or person type").located(By.xpath("//*[@id=\"GridDiv\"]/div[3]/div[5]/div/div[1]/div[1]/a"));







}
