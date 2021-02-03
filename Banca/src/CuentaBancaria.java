
public class CuentaBancaria extends App {

    private String id;
    private String nombreCuenta;
    private Double cantidad;

    public CuentaBancaria(String id, String nombreCuenta, Double cantidad) {
        this.id = id;
        this.nombreCuenta = nombreCuenta;
        this.cantidad = cantidad;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreCuenta() {
        return this.nombreCuenta;
    }

    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    public Double getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }
    
    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", nombreCuenta='" + getNombreCuenta() + "'" + ", cantidad='"
                + getCantidad() + "'" + "}";
    }

}
