package paquete1;

/**
 *
 * @author reroes
 */
public class Docente {

    protected String nombres;
    protected String cedula;

    public void establecerNombreDocente(String nom) {
        nombres = nom;
    }

    public void establecerCedulaDocente(String id) {
        cedula = id;
    }

    public String obtenerNombreDocente() {
        return nombres;
    }

    public String obtenerCedulaDocente() {
        return cedula;
    }
}
