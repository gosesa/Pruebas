package co.com.pruebas.banistmo.interactions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.util.Set;

public class CrossWindows implements Interaction {
private int intNroWin;


    public CrossWindows(int intNroWin) {
        this.intNroWin = intNroWin;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

            Set<String> allWindows = Serenity.getWebdriverManager().getWebdriver().getWindowHandles();
            Integer intW = 0;
            for(String curWindow : allWindows){
                intW = intW +1;
                if(intW==intNroWin){
                    Serenity.getWebdriverManager().getWebdriver().switchTo().window(curWindow);
                    break;
                }

        }
    }

    public static CrossWindows retornar( int intNroWin){
        return new CrossWindows(intNroWin);
    }
}
