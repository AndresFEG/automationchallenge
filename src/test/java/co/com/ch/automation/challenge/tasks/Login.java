package co.com.ch.automation.challenge.tasks;


import co.com.ch.automation.challenge.userinterface.login;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

import java.io.Writer;

public class Login implements Task {

    public static Login the(){
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(login.USERNAME),
                Enter.theValue("admin").into(login.USERNAME),
                Click.on(login.PASSWORD),
                Enter.theValue("serenity").into(login.PASSWORD),
                Click.on(login.BUTTON)
                );

    }
}
