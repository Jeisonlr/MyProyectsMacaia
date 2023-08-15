// Definición de la interfaz Conducible
interface Conducible {
    void conducir();
}








public class Main {
    public static void main(String[] args) {
        Automovil automovil = new Automovil(4, "Suzuki", "Jimny", 3, "Gasolina");
        Motocicleta motocicleta = new Motocicleta(2, "Harley-Davidson", "Sportster S", 1252, "Deportivo");

        Propietario propietarioAutomovil = new Propietario("Jeison", "Perez", automovil);
        Propietario propietarioMotocicleta = new Propietario("Jerson", "Gomez", motocicleta);

        propietarioAutomovil.mostrar_informacion();
        System.out.println("--------------------");
        propietarioMotocicleta.mostrar_informacion();
    }
}



