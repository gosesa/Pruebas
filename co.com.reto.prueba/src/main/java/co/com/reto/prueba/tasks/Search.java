package co.com.reto.prueba.tasks;


import co.com.reto.prueba.userinterface.RetoSearch;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.EnsureFieldVisible;

public class Search implements Task {
    public static Performable ThePage() {return Tasks.instrumented(Search.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(RetoSearch.BOTON_NEGOCIOS),
                Click.on(RetoSearch.BOTON_HERRAMIENTAS),
                Click.on(RetoSearch.BOTON_FINANCIACION),
                Click.on(RetoSearch.BOTON_CONVERTOR_INTERES),
                Enter.theValue("120.00").into(RetoSearch.INGRESAR_TASA_INTERES),
                Click.on(RetoSearch.SELECCIONAR_PERIODICIDAD),
                Click.on(RetoSearch.SELECCIONAR_CAPITALIZACION),
                Click.on(RetoSearch.VER_TASA_INTERES)
        );


    }

}
