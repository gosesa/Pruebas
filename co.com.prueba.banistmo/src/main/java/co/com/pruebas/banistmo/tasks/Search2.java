package co.com.pruebas.banistmo.tasks;

import co.com.pruebas.banistmo.interactions.CrossWindows;

import co.com.pruebas.banistmo.userinterface.BanistmoSearch2;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Search2 implements Task {
    public static Performable ThePage() {return Tasks.instrumented(Search2.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BanistmoSearch2.BOTON_NOSOTROS),
                Click.on(BanistmoSearch2.BOTON_CORPORATIVO),
                Click.on(BanistmoSearch2.BOTON_PROVEEDOR),
                Click.on(BanistmoSearch2.BOTON_DOCUMENTO)
        );
        actor.attemptsTo(CrossWindows.retornar(2));
    }
    }

