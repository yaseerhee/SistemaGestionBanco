public class Fecha {
    private int dia;
    private int mes;
    private int anho;

    public Fecha() {
    }

    public Fecha(int dia, int mes, int anho) {
        setDia(dia);
        setMes(mes);
        setAnho(anho);
    }

    public int getDia() {
        return this.dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return this.mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnho() {
        return this.anho;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }

    public Boolean fechaCorrecta(Fecha fecha) {
        boolean fechaValida = false;
        if (fecha.getAnho() < 1900 || fecha.getAnho() > 2021) {
            System.out.println("Debe ser mayor a 1900 o menor a 2022 el anho");
            return fechaValida;
        } else {
            switch (fecha.getMes() - 1) {
                // ENERO
                case 0:
                    if (fecha.getDia() > 0 || fecha.getDia() < 32)
                        fechaValida = true;
                    else
                        fechaValida = false;
                    break;
                // FEBRERO
                case 1:
                    if (fecha.getDia() > 0 || fecha.getDia() < 29)
                        fechaValida = true;
                    else
                        fechaValida = false;
                    break;
                // MARZO
                case 2:
                    if (fecha.getDia() > 0 || fecha.getDia() < 32)
                        fechaValida = true;
                    else
                        fechaValida = false;
                    break;
                // ABRIL
                case 3:
                    if (fecha.getDia() > 0 || fecha.getDia() < 31)
                        fechaValida = true;
                    else
                        fechaValida = false;
                    break;
                // MAYO
                case 4:
                    if (fecha.getDia() > 0 || fecha.getDia() < 32)
                        fechaValida = true;
                    else
                        fechaValida = false;
                    break;
                // JUNIO
                case 5:
                    if (fecha.getDia() > 0 || fecha.getDia() < 31)
                        fechaValida = true;
                    else
                        fechaValida = false;
                    break;
                // JULIO
                case 6:
                    if (fecha.getDia() > 0 || fecha.getDia() < 32)
                        fechaValida = true;
                    else
                        fechaValida = false;
                    break;
                // AGOSTO
                case 7:
                    if (fecha.getDia() > 0 || fecha.getDia() < 32)
                        fechaValida = true;
                    else
                        fechaValida = false;
                    break;
                // SEPTIEMBRE
                case 8:
                    if (fecha.getDia() > 0 || fecha.getDia() < 31)
                        fechaValida = true;
                    else
                        fechaValida = false;
                    break;
                // OCTUBRE
                case 9:
                    if (fecha.getDia() > 0 || fecha.getDia() < 32)
                        fechaValida = true;
                    else
                        fechaValida = false;
                    break;
                // NOVIEMBRE
                case 10:
                    if (fecha.getDia() > 0 || fecha.getDia() < 31)
                        fechaValida = true;
                    else
                        fechaValida = false;
                    break;
                // DICIEMBRE
                case 11:
                    if (fecha.getDia() > 0 || fecha.getDia() < 32)
                        fechaValida = true;
                    else
                        fechaValida = false;
                    break;
                default:
                    fechaValida = false;
            }

            return fechaValida;
        }
    }

    @Override
    public String toString() {
        return getDia() + "/" + getMes() + "/" + getAnho();
    }

}
