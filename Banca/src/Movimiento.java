public class Movimiento {
    private Fecha fecha;
    private char tipoMovimiento;
    private double importe;
    private double saldo;

    public Movimiento(Fecha fecha, char tipoMovimiento, double importe, double saldo) {
        setFecha(fecha);
        setTipoMovimiento(tipoMovimiento);
        setImporte(importe);
        setSaldo(saldo);
    }

    public Fecha getFecha() {
        return this.fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public char getTipoMovimiento() {
        return this.tipoMovimiento;
    }

    public void setTipoMovimiento(char tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public double getImporte() {
        return this.importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
