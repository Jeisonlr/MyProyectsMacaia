// Clase base Vehiculo
class Vehiculo {
    protected int ruedas;
    protected String marca;
    protected String modelo;

    public Vehiculo(int ruedas, String marca, String modelo) {
        this.ruedas = ruedas;
        this.marca = marca;
        this.modelo = modelo;
    }
    //Metodo imprime info basica del vehiculo.
    public void obtener_informacion() {
        System.out.println("Información del vehículo:");
        System.out.println("Tipo: " + getClass().getSimpleName());
        System.out.println("Ruedas: " + ruedas);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}
