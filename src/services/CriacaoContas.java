package services;

import java.util.ArrayList;
import java.util.List;

import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class CriacaoContas {
	
	private List<Conta> contaCorrente = new ArrayList<>();
	private List<Conta> contaPoupanca = new ArrayList<>();
	
	
	
	
	
	public CriacaoContas() {
		super();
	}


	


	public List<Conta> getContaCorrente() {
		return contaCorrente;
	}


	public List<Conta> getContaPoupanca() {
		return contaPoupanca;
	}


	public void adicionarContaCorrente(String agencia, String conta, String cliente) {
		
		contaCorrente.add(new ContaCorrente(agencia, conta, cliente));
		
	}
	
	
	public void adicionarContaPoupanca(String agencia, String conta, String cliente) {
		
		contaPoupanca.add(new ContaPoupanca(agencia, conta, cliente));
	}
	
	
	

}
