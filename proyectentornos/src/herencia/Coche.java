package herencia;

public class Coche {
    private int numRuedas;
    private int numPuertas;
    private String modelo;
    private int numVentana;
    private int numAsientos;
    private int velocidadMAX;

    Coche(int numRuedas, int numPuertas, String mod, int numVentana, int numAsientos, int velocidadMAX)
    {
        this.numRuedas = numRuedas;
        this.numPuertas = numPuertas;
        this.modelo = mod;
        this.numVentana = numVentana;
        this.numAsientos = numAsientos;
        this.velocidadMAX = velocidadMAX;
    }
    public void mostrarInfo()
    {
        System.out.println("Info general del coche\n" 
            + "\t NumRuedas" + this.numRuedas + "\n"
            + "\t numPuertas" + this.numPuertas + "\n"
            + "\t modelo" + this.modelo + "\n"
            + "\t numVentana" + this.numVentana + "\n"
            + "\t numAsientos" + this.numAsientos + "\n"
            + "\t velocidadMAX" + this.velocidadMAX + "\n"
            
        );
    }
}
