package JAVA;

public class Main {
    public static void main(String[] args){
        UberX uberX = new UberX("AMQ123", new Account("Andres Herrera", "AND123"), "Chevrolet", "Sonic");
        uberX.setPassenger(4);
        uberX.printDataCar();

        UberVan uberVan = new UberVan("FGH354", new Account("Fernando Casas", "AFN341"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();

       /* Car car2 = new Car("QWE563", new Account("Andrea Herrera", "AND3454"));
        car2.passenger = 3;
        car2.printDataCar();*/
    }
}
