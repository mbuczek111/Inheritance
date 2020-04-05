package PolymorphismTestProject;

public class PolymorphismTest {
    public static void main(String[] args) {


        Car benz = new Car();
        PublicTransport jakis = new PublicTransport();
        Transport cos = new Transport();
        Motorbike motocykl = new Motorbike();
        Bicycle rower = new Bicycle();
        Airplane samolot = new Airplane();
        Bus autobus = new Bus();
        Train pociag = new Train();
        Scooter skuter = new Scooter();
        Tram tramwaj = new Tram();

        whichTypeOfTransport(tramwaj);
        whichTypeOfTransport(skuter);
        whichTypeOfTransport(pociag);
        whichTypeOfTransport(autobus);
        whichTypeOfTransport(samolot);
        whichTypeOfTransport(motocykl);
        whichTypeOfTransport(rower);
        whichTypeOfTransport(benz);
        whichTypeOfTransport(jakis);
        whichTypeOfTransport(cos);
    }
    public static void whichTypeOfTransport(Transport transport) {
        transport.say();
    }
}
