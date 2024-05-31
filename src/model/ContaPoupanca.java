package model;

import java.util.List;

public class ContaPoupanca extends Conta {
	
	

	
	public ContaPoupanca(String agencia, String conta, String cliente) {
		super(agencia, conta, cliente);
	}
	
	public void transferencia(double valor, List<Conta> cCorrente, List<Conta> poupanca) {
		
		
		poupanca.forEach(n -> n.saldo -= valor);
		cCorrente.forEach(n -> n.saldo += valor);
		
	}
	
	
	
	@Override
	public String toString() {
		
		return cliente + ", " + agencia + ", " + conta + ", Saldo:" + saldo;
	}

}
