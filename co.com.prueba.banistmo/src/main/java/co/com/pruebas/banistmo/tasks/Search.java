package co.com.pruebas.banistmo.tasks;


import co.com.pruebas.banistmo.interactions.CrossWindows;
import co.com.pruebas.banistmo.userinterface.BanistmoSearch;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Search  implements Task {
     public static Performable ThePage() {return Tasks.instrumented(Search.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
actor.attemptsTo(Click.on(BanistmoSearch.BOTON_NOSOTROS),
        Click.on(BanistmoSearch.BOTON_CORPORATIVO),
        Click.on(BanistmoSearch.BOTON_PROVEEDOR),
        Click.on(BanistmoSearch.BOTON_DOCUMENTO)
);
actor.attemptsTo(CrossWindows.retornar(2));
    }


}
