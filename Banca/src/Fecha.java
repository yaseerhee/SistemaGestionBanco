import java.util.Calendar;

public class Fecha {

    private int dia;
    private int mes;
    private int anho;

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

    @Override
    public String toString() {
        return "{" + " dia='" + getDia() + "'" + ", mes='" + getMes() + "'" + ", anho='" + getAnho() + "'" + "}";
    }

}
