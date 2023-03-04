package orientacionObjeto;

public class CrearCuenta {//clase que permitirá realizar procesos como por ejemplo "Crear una cuenta de banco"
	public static void main ( String[] args) {
		Cuenta         primeraCuenta = 			new Cuenta(); 
//		Tipo de dato   Nombre de la variable    Datos que se asignaran
		
		primeraCuenta.saldo = 1000;
//		Para acceder a los datos de la clase cuenta, es requerido utilizar la variable creada, la cual sirve como un puente para llegar la información
//		de la clase Cuenta. 
		
		System.out.println(primeraCuenta.saldo);
		
		Cuenta segundaCuenta = new Cuenta();
		
		segundaCuenta.saldo=200;
		System.out.println(segundaCuenta.saldo);
		segundaCuenta.saldo=200;
		System.out.println(segundaCuenta.saldo);
	}
	
}
