package fundamentos;

public class Temperatura {
    public static void main(String[] args) {
        final int AJUSTE = 32;
        final double FATOR = 5.0 / 9;
        double tempFr = 86;
        double tempCelsius = (tempFr - AJUSTE) * FATOR;
        
        System.out.println("O resultado é " + tempCelsius + "ºC");
    }
}
