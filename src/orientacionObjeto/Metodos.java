package orientacionObjeto;

public class Metodos {
public static void main(String[] args) {
	Cuenta miCuenta = new Cuenta ();
	miCuenta.saldo = 300;
	miCuenta.depositar(200);
	
	System.out.println(miCuenta.saldo);
}

}