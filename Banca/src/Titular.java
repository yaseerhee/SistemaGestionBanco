public class Titular {
    private String nombre;
    private String apellidos;
    private String identificacion;
    private Integer edad;

    public Titular() {
        this.nombre = "";
        this.apellidos = "";
        this.identificacion = "";
        setEdad(0);
    }

    public Titular(String nombre, String apellidos, String identificacion, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        setEdad(edad);
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public String getIdentificacion() {
        return this.identificacion;
    }

    public Integer getEdad() {
        return this.edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String imprimirTitular(String nombre, String apellidos, int edad) {
        return "Nombre Titular: " + nombre + ", Apellidos: " + apellidos + ", Edad: " + edad;
    }

    @Override
    public String toString() {
        return " Nombre: " + getNombre() + ".   " + " Apellidos: " + getApellidos() + ". " + " Identificacion: "
                + getIdentificacion() + ".  " + " Edad:   " + getEdad() + ". ";
    }
}