public interface Operaciones {
    int suma(int a, int b);
    int resta(int a, int b);
    int multiplicacion(int a, int b);
    int division(int a, int b);
}

public class Calculadora implements Operaciones {
    @Override
    public int suma(int a, int b) {
        return a + b;
    }

    @Override
    public int resta(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplicacion(int a, int b) {
        return a * b;
    }

    @Override
    public int division(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: No se puede dividir por cero.");
            return 0;
        }
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int resultadoSuma = calculadora.suma(5, 3);
        int resultadoResta = calculadora.resta(8, 2);
        int resultadoMultiplicacion = calculadora.multiplicacion(4, 6);
        int resultadoDivision = calculadora.division(9, 3);

        System.out.println("Suma: " + resultadoSuma);
        System.out.println("Resta: " + resultadoResta);
        System.out.println("Multiplicación: " + resultadoMultiplicacion);
        System.out.println("División: " + resultadoDivision);
    }
}
