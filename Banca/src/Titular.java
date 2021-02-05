public class Titular {
    private String nombre;
    private String apellidos;
    private String identificacion;
    private Integer edad;

    public Titular() {
        setNombre("");
        setApellidos("");
        setIdentificacion("");
        setEdad(0);
    }

    public Titular(String nombre, String apellidos, String identificacion, int edad) {
        setNombre(nombre);
        setApellidos(apellidos);
        setIdentificacion(identificacion);
        setEdad(edad);
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getIdentificacion() {
        return this.identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
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
        return "{" + " nombre='" + getNombre() + "'" + ", apellidos='" + getApellidos() + "'" + ", identificacion='"
                + getIdentificacion() + "'" + ", edad='" + getEdad() + "'" + "}";
    }

}
