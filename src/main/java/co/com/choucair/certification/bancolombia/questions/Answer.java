package co.com.choucair.certification.bancolombia.questions;

import co.com.choucair.certification.bancolombia.userinterface.Success;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String str = actor.asksFor(Text.of(Success.MESSAGE));

        if (str.equals(question)) {
            return true;
        } else {
            return false;
        }
    }
}