/**
 * Representa una mascota atendida en la clínica
 */
public class Mascota {

    private String nombre;
    private String raza;
    private int anioNacimiento;
    private Persona miVeterinario;

    /**
     * Constructor sin año de nacimiento, queda inicialmente en 0
     */
    public Mascota(String pNombre, String pRaza) {
        this(pNombre, pRaza, 0);
    }

    /**
     * Constructor con año del nacimiento
     */
    public Mascota(String pNombre, String pRaza, int pAnio) {
        this.nombre = pNombre;
        this.raza = pRaza;
        this.anioNacimiento = pAnio;
        this.miVeterinario = null;
    }

    /**
     * Asigna o reemplaza la persona veterinaria de la mascota
     */
    public void asignarVeterinario(Persona vet) {
        this.miVeterinario = vet;
    }

    /**
     * Retorna el nombre de la persona veterinaria asignada a esta mascota
     */
    public String consultarNombreVeterinario() {
        if (miVeterinario == null) {
            return "Sin veterinario asignado";
        }
        return miVeterinario.getNombre();
    }

    /**
     * Obtiene el año actual del sistema
     */
    private int obtenerAnioActual() {
        return java.time.LocalDate.now().getYear();
    }

    /**
     * Calcula la edad canina: añoActual - añoNacimiento
     * Si el año de nacimiento no fue registrado wntonces 0
     */
    private int calcularEdadCanina() {
        if (anioNacimiento == 0) {
            return 0;
        }
        return obtenerAnioActual() - anioNacimiento;
    }

    /**
     * Calcula el equivalente en edad humana: edadCanina * 7
     * Si el año de nacimiento no fue registrado da 0
     */
    private int calcularEdadHumana() {
        if (anioNacimiento == 0) {
            return 0;
        }
        return calcularEdadCanina() * 7;
    }

    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el estado completo de la mascota: nombre, raza, año de nacimiento,
     * edad canina actual y el equivalente en edad humana
     */
    @Override
    public String toString() {
        return "Mascota [nombre=" + nombre
                + ", raza=" + raza
                + ", anioNacimiento=" + anioNacimiento
                + ", edadCanina=" + calcularEdadCanina()
                + ", edadHumana=" + calcularEdadHumana() + "]";
    }
}