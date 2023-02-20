package co.com.choucair.certification.bancolombia.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Credentials extends PageObject {
    public static final Target INPUT_USER = Target.the("Into user")
            .located(By.xpath("//input[@name='username']"));
    public static final Target INPUT_PASSWORD = Target.the("Into password")
            .located(By.xpath("//input[@name='password']"));
    public static final Target BTN_LOGIN = Target.the("Button Login")
            .located(By.xpath("//button[contains(text(),'Enviar')]"));

}
