// Vadhir Santiago Jaime Salamanca 3c DSM (27/05/2025)
public class Computadora {

    private String marca;
    private String modelo;
    private boolean encendida;

    public Computadora(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.encendida = false;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void encender() {

        encendida = true;
        System.out.println("Encendiendo");
    }

    public void apagar() {

        encendida = false;
        System.out.println("Apagando");
    }

    public static void main(String[] args) {

        Computadora miPc = new Computadora("Lenovo", "LOQ");

        miPc.encender();
        miPc.encender();
        miPc.apagar();
    }
}
