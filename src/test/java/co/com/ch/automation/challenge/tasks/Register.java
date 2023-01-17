package co.com.ch.automation.challenge.tasks;


import co.com.ch.automation.challenge.userinterface.Customers;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Register implements Task {

    public static Register the(){
        return Tasks.instrumented(Register.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        Properties props = new Properties();
        try {
            props.load(new FileInputStream("src/test/resources/properties/test.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(Click.on(Customers.ADD),
                Enter.theValue(props.getProperty("testvariable")).into(Customers.CUSTOMER_ID),
                Enter.theValue("Test Company").into(Customers.COMPANY),
                Enter.theValue("Test Name").into(Customers.CONTACT),
                Enter.theValue("Test ADDRESS").into(Customers.ADDRESS),
                Click.on(Customers.COUNTRIES),
                Click.on(Customers.COUNTRY),
                Click.on(Customers.SAVE),
                WaitUntil.the(Customers.SEARCH, WebElementStateMatchers.isVisible()),
                Click.on(Customers.SEARCH),
                Enter.theValue(props.getProperty("testvariable")).into(Customers.SEARCH),
                WaitUntil.the(Customers.RESULT, WebElementStateMatchers.isVisible())
                //Click.on(Customers.RESULT)
        );
    }
}

