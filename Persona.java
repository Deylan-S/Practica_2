/**
 * Representa a una persona veterinaria que trabaja en la clínica
 * Cada persona puede tener varias mascotas asignadas
 */
public class Persona {

    private String nombre;
    private String codigoLicencia;
    private Mascota[] misMascotas;
    private int cantidadMascotas;

    private static final int CAPACIDAD_INICIAL = 10;

    public Persona(String pNombre, String pCodigoLicencia) {
        this.nombre = pNombre;
        this.codigoLicencia = pCodigoLicencia;
        this.misMascotas = new Mascota[CAPACIDAD_INICIAL];
        this.cantidadMascotas = 0;
    }

    /**
     * Agrega una mascota a la lista de mascotas atendidas por la o el veterinari@
     */
    public void asignarMascota(Mascota mascota) {
        if (cantidadMascotas == misMascotas.length) {
            ampliarCapacidad();
        }
        misMascotas[cantidadMascotas] = mascota;
        cantidadMascotas++;
    }

    /**
     * Duplica la capacidad del arreglo interno cuando ya no hay espacio disponible
     */
    private void ampliarCapacidad() {
        Mascota[] nuevoArreglo = new Mascota[misMascotas.length * 2];
        for (int i = 0; i < misMascotas.length; i++) {
            nuevoArreglo[i] = misMascotas[i];
        }
        misMascotas = nuevoArreglo;
    }

    /**
     * Retorna los nombres de todas las mascotas asignadas a esta persona veterinaria
     */
    public String consultarNombreMisMascotas() {
        if (cantidadMascotas == 0) {
            return "Sin mascotas asignadas";
        }
        String resultado = "";
        for (int i = 0; i < cantidadMascotas; i++) {
            resultado += misMascotas[i].getNombre();
            if (i < cantidadMascotas - 1) {
                resultado += ", ";
            }
        }
        return resultado;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre
                + ", codigoLicencia=" + codigoLicencia
                + ", mascotas=" + consultarNombreMisMascotas() + "]";
    }
}