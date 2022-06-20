package co.com.reto.prueba.stepdefinitions;

import co.com.reto.prueba.questions.Answer;
import co.com.reto.prueba.tasks.OpenUp;
import co.com.reto.prueba.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import static co.com.reto.prueba.userinterface.RetoSearch.VER_TASA_INTERES;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class RetoPruebaStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());}


    @Dado("^que (.*) realizara una conversion de interes en la web Banistmo$")
    public void queLuisRealizaraUnaConversionDeInteresEnLaWebBanistmo(String nombre){
        OnStage.theActorCalled(nombre).wasAbleTo(OpenUp.thePage());
    }

    @Cuando("^haga la busqueda en Banistmo (.*)$")
    public void hagaLaBusquedaEnBanistmoDelConversorDeInterés(String busqueda){
        OnStage.theActorInTheSpotlight().attemptsTo(Search.ThePage());
    }

    @Entonces("^el escribira y vera el valor (.*)$")
    public void elEscribiraYVeraElValorGeneradoDeLaTasaDeInteres(String texto) {
       OnStage.theActorInTheSpotlight().should(seeThat(WebElementQuestion.stateOf(VER_TASA_INTERES), WebElementStateMatchers.isVisible()));
 //  OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(texto)));
    }

}
