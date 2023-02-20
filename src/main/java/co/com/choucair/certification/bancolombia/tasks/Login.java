package co.com.choucair.certification.bancolombia.tasks;

import co.com.choucair.certification.bancolombia.model.Authentication;
import co.com.choucair.certification.bancolombia.userinterface.Credentials;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class Login implements Task {

    private Authentication authentication;
    public Login(Authentication authentication){this.authentication=authentication;}

    public static Credentials credentials;
    public static Performable keys(Authentication authentication) {
        return Tasks.instrumented(Login.class,authentication);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(authentication.getUser()).into(Credentials.INPUT_USER),
                Enter.theValue(authentication.getKey()).into(Credentials.INPUT_PASSWORD),
                Click.on(Credentials.BTN_LOGIN)
        );

    }
}
