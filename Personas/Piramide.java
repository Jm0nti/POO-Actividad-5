public class Piramide extends FiguraGeometrica {
    private double base;
    private double altura;
    private double apotema;

    public Piramide(double base, double altura, double apotema) {
        this.base = base;
        this.altura = altura;
        this.apotema = apotema;
    }

    @Override
    public double calcularVolumen() {
        return (base * altura) / 3;
    }

    @Override
    public double calcularSuperficie() {
        return base * (base + Math.sqrt(Math.pow(base, 2) + 4 * Math.pow(altura, 2)));
    }
}