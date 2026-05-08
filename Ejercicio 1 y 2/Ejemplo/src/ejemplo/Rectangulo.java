package ejemplo;

public class Rectangulo {
	
	private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double area() {
        if (base < 0 || altura < 0) {
            return -1;
        }
        if (base == 0 || altura == 0) {
            return 0;
        }
        return base * altura;
    }

    public double perimetro() {
        if (base < 0 || altura < 0) {
            return -1;
        }
        if (base == 0 || altura == 0) {
            return 0;
        }
        return 2 * (base + altura);
    }
}
