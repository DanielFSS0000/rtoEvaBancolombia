package co.com.choucair.certification.bancolombia.tasks;

import co.com.choucair.certification.bancolombia.model.Authentication;
import co.com.choucair.certification.bancolombia.userinterface.OpenUrl;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class OpenPage implements Task {
    private Authentication authentication;
    public OpenPage(Authentication authentication){
        this.authentication=authentication;
    }
    private static OpenUrl openPage;
    public static Performable page(Authentication authentication) {
        return Tasks.instrumented(OpenPage.class, authentication);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(net.serenitybdd.screenplay.actions.Open.browserOn(openPage));
    }
}
