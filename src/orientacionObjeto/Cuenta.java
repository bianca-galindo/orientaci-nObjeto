package orientacionObjeto;

public class Cuenta { // Objeto, descrita como una clase.

	double saldo; // Atributo
	int agencia; // Atributo
	int numero; // Atributo
	String titular; // Atributo
	// Atributos

	void depositar(double saldo) {
		this.saldo = this.saldo + saldo;
	}

	public boolean retirar(double valor) {

		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;

		} else {
			return false;
		}
	}
	public boolean transferir(double valor, Cuenta cuenta){
		if(this.saldo >= valor) {
			this.saldo = this.saldo -valor;
			cuenta.depositar(valor);//cuenta.saldo = cuenta.saldo + valor; 
			return true;
		}else {
			return false;
		}
	}
	
	
}