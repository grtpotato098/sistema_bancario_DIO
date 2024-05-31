package model;

import java.util.List;

public class ContaCorrente extends Conta {
	
	private double taxaSaque = 5.00;
	

	
	

	
	
	public ContaCorrente() {
		
	}



	public ContaCorrente(String agencia, String conta, String cliente) {
		super(agencia, conta, cliente);
	}



	@Override
	public void saque(double valor) {
		
		saldo -= valor + taxaSaque;
	}
	
	public void transferencia(double valor, List<Conta> cCorrente, List<Conta> poupanca) {
		
		poupanca.forEach(n -> n.saldo += valor);
		cCorrente.forEach(n -> n.saldo -= valor);
		
	}
	
	
	
	@Override
	public String toString() {
		
		return cliente + ", " + agencia + ", " + conta + ", Saldo:" + saldo;
	}

}
