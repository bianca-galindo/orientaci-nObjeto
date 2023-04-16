package orientacionObjeto;

public class Cuenta { // Objeto, descrita como una clase.

	private double saldo; // Atributo
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	private int agencia; // Atributo
	private int numero; // Atributo
	private String titular; // Atributo
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