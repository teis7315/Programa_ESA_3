public abstract class ActivoDefensa implements ProtocoloActuacion{
    String nombre;
    double nivelEnergia;
    String posicionActual;

    public ActivoDefensa(String nombre, double nivelEnergia, String posicionActual) {
        this.nombre = nombre;
        this.nivelEnergia = nivelEnergia;
        this.posicionActual = posicionActual;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNivelEnergia() {
        return nivelEnergia;
    }

    public String getPosicionActual() {
        return posicionActual;
    }
}
