package ejemplo;

/**
 * Clase Rectangle
 * Representa un rectángulo y permite calcular
 * la superficie y el perímetro.
 */
public class Rectangle {

    // Constante para el cálculo del perímetro
    private static final int MULTIPLICADOR = 2;

    private double base;
    private double altura;

    /**
     * Constructor de la clase Rectangle
     * 
     * @param base base del rectángulo
     * @param altura altura del rectángulo
     */
    public Rectangle(double base, double altura) {

        this.base = base;
        this.altura = altura;
    }

    /**
     * Calcula la superficie del rectángulo
     * 
     * @return superficie del rectángulo
     */
    public double surface() {

        int validacion = validarValores();

        if (validacion != 1) {
            return validacion;
        }

        return base * altura;
    }

    /**
     * Calcula el perímetro del rectángulo
     * 
     * @return perímetro del rectángulo
     */
    public double perimeter() {

        int validacion = validarValores();

        if (validacion != 1) {
            return validacion;
        }

        return MULTIPLICADOR * (base + altura);
    }

    /**
     * Valida los valores de base y altura
     * 
     * @return -1 si hay negativos,
     *          0 si hay ceros,
     *          1 si son válidos
     */
    private int validarValores() {

        // Valores negativos
        if (base < 0 || altura < 0) {
            return -1;
        }

        // Valores cero
        if (base == 0 || altura == 0) {
            return 0;
        }

        // Valores válidos
        return 1;
    }
}