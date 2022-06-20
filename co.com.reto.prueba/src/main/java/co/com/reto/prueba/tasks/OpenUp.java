package co.com.reto.prueba.tasks;

import co.com.reto.prueba.userinterface.RetoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {

    private RetoPage retoPage;

      public static Performable thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {actor.attemptsTo(Open.browserOn(retoPage));

    }
}
