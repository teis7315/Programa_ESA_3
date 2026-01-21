public class Coordenadas {
    private double x;
    private double y;
    private double z;

    public Coordenadas(double z, double y, double x) {
        this.z = z;
        this.y = y;
        this.x = x;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";

    }
}