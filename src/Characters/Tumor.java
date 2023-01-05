package Characters;

import Enums.Preposition;
import Interfaces.Appearable;
import Interfaces.Fallable;

public class Tumor implements Appearable, Fallable {
    @Override
    public void Appear() {
        System.out.println("A Tumor had appeared");
    }

    @Override
    public String Fall() {
        return " tumor fell "+ Preposition.OFF;
    }
}
