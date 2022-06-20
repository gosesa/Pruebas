package co.com.reto.prueba.questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Attribute;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Value;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.naming.directory.SearchResult;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.ElementType;
import java.net.URLDecoder;


import static co.com.reto.prueba.userinterface.RetoSearch.INGRESAR_TASA_INTERES;
import static co.com.reto.prueba.userinterface.RetoSearch.VER_TASA_INTERES;


public class Answer implements Question<String> {
    private String texto;


    public Answer(String texto) {
        this.texto = texto;
    }

    public static Answer toThe(String texto) {
        return new Answer(texto);
    }



    @Override
    public String answeredBy(Actor actor) {

        return INGRESAR_TASA_INTERES .resolveFor(actor).getText();

       // return Attribute.of(VER_TASA_INTERES).named("h3").viewedBy(actor).asString();
      //  WebElementQuestion.valueOf(VER_TASA_INTERES);
    }
}
