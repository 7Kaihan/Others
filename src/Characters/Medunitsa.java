package Characters;
import Abstraction.*;
import Enums.BodyParts;
import Enums.Place;
import Enums.Preposition;
import Interfaces.*;

public class Medunitsa extends Base implements Seeable,Carriable,Feelable,Helpable,Sayable,Fallable,Sittable {
    private Patient p = new Patient();

    @Override
    public void See(){
        System.out.print(name+" see ");
    }

    @Override
    public void Carry(String name) {
        System.out.println(this.name + " carrys "+name +" "+ Preposition.ON+" his "+ BodyParts.ARMS+" to "+ Place.BED);
    }

    @Override
    public String Feel() {
        return null;
    }

    @Override
    public String Help() {
        return null;
    }

    @Override
    public void Say() {
        System.out.println(name+ " Says ");
    }

    @Override
    public String Fall() {
        return null;
    }

    @Override
    public void Sit() {
        System.out.println(name+ " sits "+Preposition.DOWN);
    }
}
