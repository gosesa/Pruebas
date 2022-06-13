package co.com.pruebas.banistmo.stepdefinitions;

import co.com.pruebas.banistmo.questions.Answer;
import co.com.pruebas.banistmo.tasks.OpenUp;
import co.com.pruebas.banistmo.tasks.Search;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class PruebasBanistmoStepDefinitions {

    @Before
    public void setStage(){OnStage.setTheStage(new OnlineCast());}


    @Dado("^que (.*) quiere descargar un documento en Banistmo$")
    public void queLuisQuiereDescargarUnDocumentoEnBanistmo(String nombre) {
        OnStage.theActorCalled(nombre).wasAbleTo(OpenUp.thePage());
    }

    @Cuando("^haga la busqueda en Banistmo el documento (.*)$")
    public void hagaLaBusquedaEnBanistmoElDocumentoPolíticasDeTratamientoYDeProtecciónDeDatosPersonalesDeProveedores(String Documento) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.ThePage());
    }

    @Entonces("^el descargara el documento (.*)$")
    public void elDescargaraElDocumentoPolíticasDeTratamientoYDeProtecciónDeDatosPersonalesDeProveedores(String pdf) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(pdf)));
    }


}
