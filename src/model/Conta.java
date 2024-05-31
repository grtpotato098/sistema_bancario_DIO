package model;

import java.util.List;

public abstract class Conta {
	
	protected String agencia;
	protected String conta;
	protected String cliente;
	protected double saldo;
	
	
	public Conta(String agencia, String conta, String cliente) {
		
		this.agencia = agencia;
		this.conta = conta;
		this.cliente = cliente;
		
	}
	
	


	public Conta() {
		super();
	}




	public String getAgencia() {
		return agencia;
	}


	public String getConta() {
		return conta;
	}


	public String getCliente() {
		return cliente;
	}
	
	
	
	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double valor) {
		
		saldo += valor;
	}
	
	public void saque(double valor) {
		
		saldo -= valor;
	}
	
	public void transferencia(double valor, List<Conta> cCorrente, List<Conta> poupanca) {
		
		
	}

	
	@Override
	public String toString() {
		
		return cliente + ", " + agencia + ", " + conta + ", Saldo:" + saldo;
	}
	
	

}
