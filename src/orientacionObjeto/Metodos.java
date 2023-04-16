package orientacionObjeto;

public class Metodos {
	public static void main(String[] args) {
		boolean resultado;
		Cuenta miCuenta = new Cuenta();
		miCuenta.setSaldo(300);
		miCuenta.depositar(200);

		System.out.println(miCuenta.getSaldo());
		resultado = miCuenta.retirar(100);
		if (resultado == true) {
			System.out.println("Retiro de cuenta exitoso, su saldo es : " + miCuenta.getSaldo());

		} else {
			System.out.println("El retiro de cuenta no fue completado");
		}
		
		Cuenta cuentaDeJimena = new  Cuenta();
		cuentaDeJimena.depositar(1000);
		if(cuentaDeJimena.transferir(400, miCuenta)) {
			
			System.out.println("La tranferencia fue exitosa el saldo de jimena es : " + cuentaDeJimena.getSaldo());
			System.out.println("El saldo de mi cuenta es: "+ miCuenta.getSaldo());
		}

	}

}
