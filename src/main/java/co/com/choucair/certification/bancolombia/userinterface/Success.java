package co.com.choucair.certification.bancolombia.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Success extends PageObject {
    public static final Target MESSAGE = Target.the("MESSAGE").located(By.xpath("//h1[@class=\"text-center text-3xl p-5\"]"));

    public static final String HASH = "//p[@class=\"text-white text-2xl text-center break-all\"]";
}
