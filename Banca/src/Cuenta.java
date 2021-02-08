public class Cuenta {

    // propiedad
    private Titular titular;
    private Fecha fecha;
    private String numeroCuenta;
    private Double saldo;

    // constructor
    public Cuenta() {
    }

    public Cuenta(Titular titular, String numeroCuenta) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
    }

    public Cuenta(Titular titular, Fecha fecha, String numeroCuenta, Double saldo) {
        this.titular = titular;
        this.fecha = fecha;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    // getter
    public Titular getTitular() {
        return this.titular;
    }

    public Fecha getFecha() {
        return this.fecha;
    }

    public String getNumeroCuenta() {
        return this.numeroCuenta;
    }

    // setter
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    // metodos
    public Double ingresar(Cuenta cuenta, double ingreso) {
        double saldo = cuenta.getSaldo() + ingreso;
        return saldo;
    }

    public Double reintegrar(Cuenta cuenta, double reintegro) {
        if (cuenta.getSaldo() > 0) {
            double saldo = cuenta.getSaldo() - reintegro;
            return saldo;
        } else {
            double saldo = cuenta.getSaldo();
            return saldo;
        }
    }

    public String transferencia(Cuenta emisor, Cuenta destino, double cantidad) {
        return "Saldo Cuenta emisora: " + reintegrar(emisor, cantidad) + ", Saldo cuenta recibe: "
                + ingresar(destino, cantidad);
    }

    public  Boolean compararCuentas(Cuenta numeroCuenta, Cuenta otraCuenta) {
        int comparador = numeroCuenta.getNumeroCuenta().compareTo(otraCuenta.getNumeroCuenta());
        if (comparador == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Texto
    @Override
    public String toString() {
        return "Titular=" + getTitular() + "\n" + "Fecha=" + getFecha() + "\n" + "Numero Cuenta=" + getNumeroCuenta()
                + "\n" + "Saldo=" + getSaldo() + "\n" + "}";
    }

}
