package co.com.ch.automation.challenge.questions;

import co.com.ch.automation.challenge.userinterface.Customers;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Answer implements Question<Boolean> {

    private  String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer (question);

    }

    @Override
    public Boolean answeredBy (Actor actor){

        Properties props = new Properties();
        try {
            props.load(new FileInputStream("src/test/resources/properties/test.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String message = Text.of(Customers.RESULT).answeredBy(actor).toString();

        if (question.equals(props.getProperty("testvariable"))){
            return true;
        }
        return false;
    }
}

