package co.com.pruebas.banistmo.stepdefinitions;

import co.com.pruebas.banistmo.questions.Answer;
import co.com.pruebas.banistmo.tasks.OpenUp;
import co.com.pruebas.banistmo.tasks.Search2;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class DescargaBanistmoStepDefinitions {
    @Before
    public void setStage(){OnStage.setTheStage(new OnlineCast());}

    @Dado("^que (.*) quiere descargar otro documento$")
    public void queLuisQuiereDescargarOtroDocumento(String nombre)  {
        OnStage.theActorCalled(nombre).wasAbleTo(OpenUp.thePage());
    }


    @Cuando("^realice la busqueda del documento (.*)$")
    public void realiceLaBusquedaDelDocumentoNuestrosPrincipiosYCompromisos(String Documento) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search2.ThePage());
    }

    @Entonces("^se descargara el documento (.*)$")
    public void seDescargaraElDocumentoPrincipiosCompromisosGrupoBancolombiaPdf(String pdf){
      OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(pdf)));
    }

}
