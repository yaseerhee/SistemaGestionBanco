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

    public static Boolean fechaCorrecta(Fecha fecha) {
        boolean fechaValida = false;
        if (fecha.getAnho() < 1900 || fecha.getAnho() > 2021) {
            System.out.println("Debe ser mayor a 1900 o menor a 2022 el anho");
            return fechaValida;
        } else {
            switch (fecha.getMes() - 1) {
                // ENERO
                case 0:
                    if (fecha.getDia() > 0 || fecha.getDia() < 32) {
                        fechaValida = true;
                    } else {
                        fechaValida = false;
                    }
                    break;
                // FEBRERO
                case 1:
                    if (fecha.getDia() > 0 || fecha.getDia() < 29) {
                        fechaValida = true;
                    } else {
                        fechaValida = false;
                    }
                    break;
                // MARZO
                case 2:
                    if (fecha.getDia() > 0 || fecha.getDia() < 32) {
                        fechaValida = true;
                    } else {
                        fechaValida = false;
                    }
                    break;
                // ABRIL
                case 3:
                    if (fecha.getDia() > 0 || fecha.getDia() < 31) {
                        fechaValida = true;
                    } else {
                        fechaValida = false;
                    }
                    break;
                // MAYO
                case 4:
                    if (fecha.getDia() > 0 || fecha.getDia() < 32) {
                        fechaValida = true;
                    } else {
                        fechaValida = false;
                    }
                    break;
                // JUNIO
                case 5:
                    if (fecha.getDia() > 0 || fecha.getDia() < 31) {
                        fechaValida = true;
                    } else {
                        fechaValida = false;
                    }
                    break;
                // JULIO
                case 6:
                    if (fecha.getDia() > 0 || fecha.getDia() < 32) {
                        fechaValida = true;
                    } else {
                        fechaValida = false;
                    }
                    break;
                // AGOSTO
                case 7:
                    if (fecha.getDia() > 0 || fecha.getDia() < 32) {
                        fechaValida = true;
                    } else {
                        fechaValida = false;
                    }
                    break;
                // SEPTIEMBRE
                case 8:
                    if (fecha.getDia() > 0 || fecha.getDia() < 31) {
                        fechaValida = true;
                    } else {
                        fechaValida = false;
                    }
                    break;
                // OCTUBRE
                case 9:
                    if (fecha.getDia() > 0 || fecha.getDia() < 32) {
                        fechaValida = true;
                    } else {
                        fechaValida = false;
                    }
                    break;
                // NOVIEMBRE
                case 10:
                    if (fecha.getDia() > 0 || fecha.getDia() < 31) {
                        fechaValida = true;
                    } else {
                        fechaValida = false;
                    }
                    break;
                // DICIEMBRE
                case 11:
                    if (fecha.getDia() > 0 || fecha.getDia() < 32) {
                        fechaValida = true;
                    } else {
                        fechaValida = false;
                    }
                    break;
                default:
                    fechaValida = false;
            }

            return fechaValida;
        }
    }
}
