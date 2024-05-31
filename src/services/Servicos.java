package services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class Servicos implements Movimentacoes {
	
	private List<Conta> contaCorrente = new ArrayList<>();
	private List<Conta> contaPoupanca = new ArrayList<>();
	
	
	
	
	
	

	


	public Servicos() {
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


	@Override
	public void saquePoupanca(double valor) {
		
		contaPoupanca.forEach(n -> {
			if(n.getSaldo() < valor) {
				
				throw new RuntimeException("Saldo insuficiente");
				
			}else {
				
				n.saque(valor);
			}
			
		});
		
	}


	@Override
	public void saquecontaCorrente(double valor) {
		contaCorrente.forEach(n -> {
			if(n.getSaldo() < valor) {
				
				throw new RuntimeException("Saldo insuficiente");
				
			}else {
				
				n.saque(valor);
			}
			
		});
		
	}


	@Override
	public void depositoPoupanca(double valor) {
		
		contaPoupanca.forEach(n -> n.deposito(valor));
		
	}


	@Override
	public void depositocontaCorrente(double valor) {
		// TODO Auto-generated method stub
		contaCorrente.forEach(n -> n.deposito(valor));
	}


	@Override
	public void transferenciaCCorrentePoupanca(double valor) {
		
		
		contaCorrente.forEach(n -> {
			
			if (n.getSaldo() < valor) {
				
				throw new RuntimeException("Saldo insuficiente");
			}else {
				
				n.transferencia(valor, contaCorrente, contaPoupanca);
				
			}
			
		});
		
		
		
		
	}


	@Override
	public void transferenciaPoupancaCCorrente(double valor) {
		// TODO Auto-generated method stub
		
		
		contaPoupanca.forEach(n -> {
			
			if (n.getSaldo() < valor) {
				
				throw new RuntimeException("Saldo insuficiente");
			}else {
				
				n.transferencia(valor, contaCorrente, contaPoupanca);
				
			}
			
		});
		
	}
	
	
	}
		
		
		
	



