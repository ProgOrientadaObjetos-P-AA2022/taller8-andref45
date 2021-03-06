package paquete1;

/**
 *
 * @author andreflores
 */
public class DocenteFactura extends Docente {

    private double v_Factura;
    private double v_iva;
    private double v_cancelar;

    public void establecerV_factura(double fac) {
        v_Factura = fac;
    }

    public void establecerV_Iva(double iva) {
        v_iva = iva;
    }

    public void calcularV_Cancelar() {
        v_cancelar = v_Factura + (v_Factura * v_iva);
    }

    public double obtenerV_factura() {
        return v_Factura;
    }

    public double obtenerV_Iva() {
        return v_iva;
    }

    public double obtenerV_cancelar() {
        return v_cancelar;
    }

    @Override
    public String toString() {
        String reporte = String.format("Nombre del docente: %s\n"
                + "Cédula: %s\n"
                + "Valor factura: %.2f\n"
                + "Descuento del iva: %.2f\n"
                + "Valor a cancelar: %.2f\n",
                obtenerNombreDocente(),
                obtenerCedulaDocente(),
                obtenerV_factura(),
                obtenerV_Iva(),
                obtenerV_cancelar());
        return reporte;
    }
}
