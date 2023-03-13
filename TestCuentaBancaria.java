
import java.util.Scanner;

public class TestCuentaBancaria {
    public class vistaCuenta {
        public static void main(String[] args) {

            CuentaBancaria.datosCuenta cuenta = new CuentaBancaria.datosCuenta();
            cuenta.setName("Adalberto");
            cuenta.setSaldo(25.50);
            Scanner entra = new Scanner(System.in);

            cuenta.menu();


        }
    }
}


