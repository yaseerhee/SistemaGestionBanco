
import java.util.*;

public class PruebaCuenta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Buenas tardes!");
        // Date hoy = new Date();
        Calendar hoy = Calendar.getInstance();
        int dia = hoy.get(Calendar.DAY_OF_MONTH);
        int mes = hoy.get(Calendar.MONTH) + 1;
        int anho = hoy.get(Calendar.YEAR);

        Fecha fecha = new Fecha(dia, mes, anho);
        System.out.println("Fecha de hoy: " + fecha.toString());
        System.out.println("Acceda a su cuenta: ");
        System.out.println("Introduzca su Nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("Introduzca su Apellido: ");
        String apellidos = teclado.nextLine();
        System.out.println("Introduzca su Numero de Cuenta: ");
        String numCuenta = teclado.nextLine();
        System.out.println("Introduzca su edad: ");
        ;
        int edad = teclado.nextInt();

        Titular titular = new Titular(nombre, apellidos, numCuenta, edad);

        Cuenta cuenta = new Cuenta();
        Cuenta cuenta1 = new Cuenta(titular, fecha, numCuenta, 1000.0);
        Cuenta cuenta2 = new Cuenta(titular, fecha, "IBANYas", 1000.0);
        boolean comprobarCuenta = cuenta.compararCuentas(cuenta1, cuenta2);

        System.out.println(cuenta.transferencia(cuenta1, cuenta2, 100.0));
        if (comprobarCuenta) {
            System.out.println("Es la misma cuenta ");
        } else {
            System.out.println("Es otra cuenta");
        }
    }
}
