import java.lang.ref.Cleaner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Empezamos proyecto...");
        System.out.println("");
        CuentaBancaria Bankia = new CuentaBancaria("1", "Bankia", 1890.75);
        CuentaBancaria Rural = new CuentaBancaria("2", "Rural", 1774.88);
        CuentaBancaria CoinBase = new CuentaBancaria("3", "CoinBaser", 84.57);
        System.out.println("");

        System.out.println(Bankia.toString());
        System.out.println(Rural.toString());
        System.out.println(CoinBase.toString());
        System.out.println("");

        double cantBankia = Bankia.getCantidad();
        double cantRural = Rural.getCantidad();
        double cantCoinBase = CoinBase.getCantidad();
        System.out.println("");

        double total = sumaTotal(cantBankia, cantCoinBase, cantRural);
        System.out.println("Dinero total: " + total);
        System.out.println("");

        System.out.println("Dinero con la beca: " + (total + 1700));
    }
    public static Double sumaTotal(double a, double b, double c) {
        return a + b + c;
    }
}
