package application;

import services.CriacaoContas;
import services.Servicos;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Servicos contas = new Servicos();
		
		
		contas.adicionarContaCorrente("1234-0", "53451-x", "Jessé freitas");
		contas.adicionarContaPoupanca("1234-0", "53452-x", "Jessé freitas");
		
		
		
		System.out.println(contas.getContaCorrente());
		System.out.println(contas.getContaPoupanca());
		
		contas.depositoPoupanca(300);
		contas.depositocontaCorrente(500);
		
		System.out.println(contas.getContaPoupanca());
		System.out.println(contas.getContaCorrente());
		
		
		
		contas.saquePoupanca(100);
		contas.saquecontaCorrente(300);
		
		System.out.println(contas.getContaPoupanca());
		System.out.println(contas.getContaCorrente());
		
		contas.transferenciaCCorrentePoupanca(195.0);
		
		
		System.out.println(contas.getContaPoupanca());
		System.out.println(contas.getContaCorrente());
		
		contas.transferenciaPoupancaCCorrente(200.0);
		
		System.out.println(contas.getContaPoupanca());
		System.out.println(contas.getContaCorrente());
		
		
				
		

	}

}
