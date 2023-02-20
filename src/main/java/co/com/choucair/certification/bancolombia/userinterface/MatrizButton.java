package co.com.choucair.certification.bancolombia.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MatrizButton extends PageObject {

    public static Target arrayBtn(Integer index){
        return Target.the("BTN CORRECT").located(By.xpath("//button[@value=\"" + index +"\"]"));
    }

    public static final Target CONT = Target.the("Contenedor").located(By.xpath("//div[@class=\"flex flex-row p-3 justify-evenly \"]"));

    public static final Target TEXT_SUMA = Target.the("TEXT Suma").located(By.xpath("//input[@type=\"number\"]"));

    public static final Target SEND_SUMA = Target.the("Send Suma").located(By.xpath("//button[@type=\"submit\"]"));

}
