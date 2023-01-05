import Abstraction.Base;
import Characters.*;
import Enums.*;
public class Main {
    public static void main(String[] args) {
        Medunitsa medunitsa = new Medunitsa();
        Patient patient = new Patient();
        Tumor tumor = new Tumor();
        Honeydew honeydew = new Honeydew();
        medunitsa.setName("Medunitsa");
        System.out.println("Doctor 's name : "+medunitsa.getName());
        patient.setName("Pulka");
        System.out.println("Patient's name : "+patient.getName());
        medunitsa.See();
        System.out.println(patient.getName());
        patient.Deteriating();
        patient.Say();
        patient.Discharge();
        patient.Hurt();
        patient.Awake();
        patient.Jump();
        patient.Run();
        patient.Turn();
        medunitsa.Carry(patient.getName());
        tumor.Appear();
        System.out.println("By the "+Time.EVENING+ " the temprature jumped ");
        honeydew.setName("HoneyDew");
        honeydew.getName();
        honeydew.Sit();
        honeydew.Closable();
        honeydew.Thank();
        patient.Delay();
        System.out.println(patient.toString());
        System.out.println(medunitsa);
        System.out.println(honeydew);
        System.out.println(patient.hashCode());
        System.out.println(medunitsa.hashCode());
        System.out.println(honeydew.hashCode());
        System.out.println(medunitsa.equals(medunitsa));
        System.out.println(patient.equals(patient));
        System.out.println(honeydew.equals(honeydew));
    }
}