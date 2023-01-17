package co.com.ch.automation.challenge.tasks;


import co.com.ch.automation.challenge.userinterface.Customers;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

public class Navigate implements Task {

    public static Navigate the(){
        return Tasks.instrumented(Navigate.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(Customers.LABEL1),
                        Click.on(Customers.LABEL2)
        );

    }
}
