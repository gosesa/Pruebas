package co.com.pruebas.banistmo.questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;


public class Answer implements Question<Boolean> {
    private String pdf;

    public Answer(String pdf) {this.pdf = pdf;}
    public static Answer toThe(String pdf){
        return new Answer(pdf);
    }

    @Override

    public Boolean answeredBy(Actor actor) {
        boolean result = false;
        try {


            String pdf1 = URLDecoder.decode(Serenity.getWebdriverManager().getWebdriver().getCurrentUrl(), "UTF-8");
            if (pdf1.contains(pdf)) {
                result = true;
            } else {
                result = false;
            }


        } catch (UnsupportedEncodingException e) {

            e.printStackTrace();
        }
        return result;

    }

}
