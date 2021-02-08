// import javax.swing.*;

public class PruebaCuenta {
    public static void main(String[] args) {
        Fecha fecha = new Fecha(1, 2, 2012);
        Fecha metodoFecha = new Fecha();
        if (metodoFecha.fechaCorrecta(fecha)) {
            System.out.println("Correcta!");
        } else {
            System.out.println("Falta poner la fecha de hoy");
        }
        Titular titular = new Titular("Yaser", "Haddad", "1234", 21);
        Cuenta cuenta = new Cuenta();
        Cuenta cuenta1 = new Cuenta(titular, fecha, "IBAN365", 1000.0);
        Cuenta cuenta2 = new Cuenta(titular, fecha, "IBANYas", 1000.0);
        boolean comprobarCuenta = cuenta.compararCuentas(cuenta1, cuenta2);

        System.out.println(cuenta.transferencia(cuenta1, cuenta2, 100.0));
        if (comprobarCuenta) {
            System.out.println("Es la misma cuenta ");
        } else {
            System.out.println("Es otra cuenta");
        }

    }

    // public static void grafico() {
    // Titular yaser = new Titular("Yaser", "Haddad", "1234", 21);
    // Fecha fecha2 = new Fecha(05, 02, 2021);
    // Cuenta haddad = new Cuenta(yaser, fecha2, "IBAN2000", 5000.0);
    // JFrame panel = new JFrame();
    // JButton boton = new JButton("Consultar");
    // JLabel tit = new JLabel(haddad.getTitular().toString());
    // JLabel fec = new JLabel(haddad.getFecha().toString());
    // JLabel cue = new JLabel("NUMERO CUENTA: " + haddad.getNumeroCuenta());
    // JLabel sald = new JLabel(" SALDO: " + haddad.getSaldo() + "€");

    // boton.setBounds(350, 650, 300, 30);
    // tit.setBounds(20, 20, 1000, 200);
    // fec.setBounds(20, 40, 1000, 200);
    // cue.setBounds(20, 60, 1000, 200);
    // sald.setBounds(20, 80, 1000, 200);
    // panel.add(boton);
    // panel.add(tit);
    // panel.add(fec);
    // panel.add(cue);
    // panel.add(sald);
    // panel.setSize(1000, 1000);
    // panel.setLayout(null);
    // panel.setVisible(true);
    // }
}
