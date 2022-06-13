package co.com.pruebas.banistmo.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.util.Set;

public class BanistmoSearch extends PageObject {

    public static final Target BOTON_NOSOTROS = Target.the("boton que ingresa en acerca de nosotros")
            .located(By.xpath("//*[@id=\"header-nosotros\"]"));

    public static final Target BOTON_CORPORATIVO = Target.the("boton que ingresa en informacion corporativa")
            .located(By.id("serv"));

    public static final Target BOTON_PROVEEDOR = Target.the("boton que ingresa a proveedores")
            .located(By.xpath("//*[@id=\"menu-sup\"]/li[4]/ul/div/div/div/div/div/div[6]/div/a"));

    public static final Target BOTON_DOCUMENTO = Target.the("boton que abre el pdf a descargar")
            .located(By.xpath("//*[@id=\"wizard2\"]/div/div[3]/div/div[1]/div/p[2]/a"));


}
