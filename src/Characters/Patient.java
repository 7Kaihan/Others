package Characters;
import Abstraction.*;
import Interfaces.*;
import Enums.*;
import Interfaces.Runnable;

public class Patient extends Base implements Deterioratable,Delayable,Thankable, Sayable,Helpable,Dischargeable,Hurtable,Awakable,Feelable,Jumpable, Runnable,Turnable,Fallable {
 private String name;

   @Override
   public String getName() {
      return name;
  }
    @Override
    public void setName(String name){
        this.name = name;
    }

    @Override
    public void Deteriating() {
        System.out.println(name + " Deteriating "+Time.DAY + " to "+ Time.DAY);
    }

    @Override
    public void Say() {
        System.out.print(name+ " Said " +name+ " has become twenty times worse than ");
        System.out.println(Problems.Grumbler+ " and "+Problems.Pillkin);
    }

    @Override
    public void Discharge() {
        System.out.print("Discharging "+name +" from "+Place.HOSPITAL);
        System.out.println(Help());
    }

    @Override
    public String Help() {
        return (" could help "+name);
    }

    @Override
    public void Hurt() {
       System.out.print(Preposition.BESIDE+"s ");
        System.out.println(name+" 's "+ BodyParts.LEG+ " hurts alot");
        System.out.println(name+ " hurts himslef");
    }

    @Override
    public void Awake() {
        System.out.print("One "+Time.MORNING+" when "+name+" woke up ");
        System.out.println(name+" "+Feel());
    }

    @Override
    public String Feel() {
        return (" felt his "+BodyParts.LEG+" didn't hurt");
    }

    @Override
    public void Jump() {
        System.out.println(name+ " jumped "+Preposition.OUT+" of "+Place.BED);
    }

    @Override
    public void Run() {
        System.out.println(name+ " ran "+Preposition.AROUND+" "+Place.WARD);
    }

    @Override
    public String Fall() {
        return name+" fell ";
    }

    @Override
    public void Turn() {
        System.out.println(name+ " 's "+BodyParts.LEG+ " turned "+Preposition.UP+ " "+ Fall());
    }

    @Override
    public void Thank() {
        System.out.println(name +" is thanking ");
    }

    @Override
    public void Delay() {
        System.out.println(name+" 's "+BodyParts.LEG+ " treatment delayed ");
    }
}
