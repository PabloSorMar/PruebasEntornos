package herencia;

public class CocheElectrico extends Coche {
    private double voltaje;

    public CocheElectrico(int numRuedas, int numPuertas, String modelo, int numVentana, int numAsientos, int velocidadMAX, double voltaje) {
        // super debe recibir exactamente los 6 parámetros que  Coche
        super(numRuedas, numPuertas, modelo, numVentana, numAsientos, velocidadMAX);
        this.voltaje = voltaje;
    }

    @Override
    public void mostrarInfo()
    {
        super.mostrarInfo();
        System.out.println("Info particular del coche \n"
            + "\t Voltaje: " + this.voltaje
        );
    }
}