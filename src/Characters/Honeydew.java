package Characters;
import Abstraction.*;
import Enums.BodyParts;
import Enums.Place;
import Interfaces.*;

public class Honeydew extends Base implements Sittable,Seeable,Sayable, Jumpable,Closable,Thankable,Awakable {
    private Patient p = new Patient();
    private Tumor tumor = new Tumor();
    @Override
    public void Jump() {
        System.out.println(name+" Jumps over "+Place.BED);
    }

    @Override
    public void Say() {
        System.out.println(name+" says ");
    }

    @Override
    public void See() {
        System.out.println(name+" sees "+Place.WARD);
    }

    @Override
    public void Sit() {
        p.setName("Pulka");
        System.out.println(name+ " sat by "+p.getName()+" 's "+ Place.BED);
    }

    @Override
    public void Closable() {
        System.out.println(name+" not closed her "+ BodyParts.EYES);
    }

    @Override
    public void Thank() {
        System.out.println("Thanks to "+name+" efforts "+tumor.Fall());
    }

    @Override
    public void Awake() {
        System.out.println(name+ " has been awaken ");
    }
}
