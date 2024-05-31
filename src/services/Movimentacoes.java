package services;

public interface Movimentacoes {
	
	void saquePoupanca(double valor);
	void saquecontaCorrente(double valor);
	void depositoPoupanca(double valor);
	void depositocontaCorrente(double valor);
	void transferenciaCCorrentePoupanca(double valor);
	void transferenciaPoupancaCCorrente(double valor);

}
