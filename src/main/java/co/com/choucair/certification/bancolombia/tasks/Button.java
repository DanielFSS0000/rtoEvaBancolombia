package co.com.choucair.certification.bancolombia.tasks;

import co.com.choucair.certification.bancolombia.model.Coordinates;
import co.com.choucair.certification.bancolombia.userinterface.MatrizButton;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

public class Button implements Task {

    Coordinates coordinates = new Coordinates();

    int[] btnarray = coordinates.getBtnArray();

    int [] sumarray = coordinates.getSumArray();

    int i = coordinates.getRepite();


    public static Button click(){return Tasks.instrumented((Button.class));
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (i=0; i<12; i++){
            String datoSumArray= String.valueOf(sumarray[i]);
            int datoBtnArray = btnarray[i];

            actor.attemptsTo(
                    Scroll.to((MatrizButton.CONT)),
                    Scroll.to((MatrizButton.CONT)),
                    Click.on(MatrizButton.arrayBtn(datoBtnArray)),
                    Click.on(MatrizButton.TEXT_SUMA),
                    Enter.keyValues(datoSumArray).into(MatrizButton.TEXT_SUMA),
                    Click.on(MatrizButton.SEND_SUMA)

            );
        }

    }
}
