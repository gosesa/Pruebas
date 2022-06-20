package co.com.reto.prueba.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RetoSearch extends PageObject {

    public static final Target BOTON_NEGOCIOS = Target.the("boton que ingresa en Negocios")
            .located(By.xpath("//a[@id=\"header-pymes\"]"));
    public static final Target BOTON_HERRAMIENTAS = Target.the("boton que ingresa en Herramientas")
            .located(By.xpath("//*[@id=\"old-headerMain\"]/section/div/div/div/div[1]/ul/li[4]/a"));
    public static final Target BOTON_FINANCIACION = Target.the("boton que ingresa en Financiacion")
            .located(By.xpath("//*[@id=\"layoutContainers\"]/div[1]/div[2]/div[1]/div[5]/section/div[3]/div[1]/div/div/div/div/div[1]/div[7]"));
    public static final Target BOTON_CONVERTOR_INTERES = Target.the("boton que ingresa en Convertidor tasa de intereses")
            .located(By.xpath("//*[@id=\"rows-financial\"]/div[5]/div/a"));
    public static final Target INGRESAR_TASA_INTERES = Target.the("entrada de tasas de interes")
            .located(By.id("interes"));
    public static final Target SELECCIONAR_PERIODICIDAD = Target.the("se selecciona la periodicidad")
            .located(By.xpath("//*[@id=\"periodicidad-deseada\"]/option[2]"));
    public static final Target SELECCIONAR_CAPITALIZACION = Target.the("se selecciona la capitalizacion")
            .located(By.xpath("//*[@id=\"capitalizacion\"]/option[3]"));
    public static final Target VER_TASA_INTERES= Target.the("Mostrar tasa de Interes")
            .located(By.xpath("/html/body/div[2]/div[2]/div[2]/section[3]/div/div/div/div/div/div/div[2]/div/h3"));

}
