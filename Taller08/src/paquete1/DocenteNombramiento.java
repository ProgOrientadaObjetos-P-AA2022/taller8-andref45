package paquete1;

/**
 *
 * @author andreflores
 */
public class DocenteNombramiento extends Docente {

    private double valorSueldo;
    private double valorHoraextra;
    private int numHorasExtra;
    private double sueldo;

    public void establecerValorSueldo(double vSueldo) {
        valorSueldo = vSueldo;
    }

    public void establecerV_horasExtra(double hExtra) {
        valorHoraextra = hExtra;
    }

    public void establecerNumeroHoras(int nH) {
        numHorasExtra = nH;
    }

    public void calcularSueldo() {
        sueldo = valorSueldo + (valorHoraextra * numHorasExtra);
    }

    public double obtenerValorSueldo() {
        return valorSueldo;
    }

    public double obtenerV_horasExtra() {
        return valorHoraextra;
    }

    public int obtenerNumeroHoras() {
        return numHorasExtra;
    }

    public double obtenerSueldo() {
        return sueldo;
    }
}
