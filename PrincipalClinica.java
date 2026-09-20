public class PrincipalClinica {
    public static void main(String[] args) {
        Persona p1, p2, p3;
        Mascota m1, m2, m3;

        p1 = new Persona("Ana Rodríguez", "VET-101");
        p2 = new Persona("Carlos Méndez", "VET-205");
        p3 = new Persona("Laura Jiménez", "VET-310");

        m1 = new Mascota("Luna", "Beagle");
        m2 = new Mascota("Max", "Labrador", 2020);
        m3 = new Mascota("Nala", "Pastor Alemán", 2018);

        System.out.println("==== ESTADO INICIAL DE LAS PERSONAS ====");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println();

        System.out.println("==== ESTADO INICIAL DE LAS MASCOTAS ====");
        System.out.println(m1.toString());
        System.out.println(m2.toString());
        System.out.println(m3.toString());
        System.out.println();

        m1.asignarVeterinario(p1);
        p1.asignarMascota(m1);
        m2.asignarVeterinario(p1);
        p1.asignarMascota(m2);
        m3.asignarVeterinario(p2);
        p2.asignarMascota(m3);

        System.out.println("==== PERSONA VETERINARIA DE CADA MASCOTA ====");
        System.out.println(
                "Veterinario de " + m1.getNombre() + ": "
                        + m1.consultarNombreVeterinario());
        System.out.println(
                "Veterinario de " + m2.getNombre() + ": "
                        + m2.consultarNombreVeterinario());
        System.out.println(
                "Veterinario de " + m3.getNombre() + ": "
                        + m3.consultarNombreVeterinario());
        System.out.println();

        System.out.println("==== MASCOTAS ASIGNADAS A CADA PERSONA ====");
        System.out.println(
                p1.getNombre() + ": "
                        + p1.consultarNombreMisMascotas());
        System.out.println(
                p2.getNombre() + ": "
                        + p2.consultarNombreMisMascotas());
        System.out.println(
                p3.getNombre() + ": "
                        + p3.consultarNombreMisMascotas());
        System.out.println();

        System.out.println("==== ESTADO FINAL DE LAS MASCOTAS ====");
        System.out.println(m1.toString());
        System.out.println(m2.toString());
        System.out.println(m3.toString());
        System.out.println();

        System.out.println("==== ESTADO FINAL DE LAS PERSONAS ====");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }
}