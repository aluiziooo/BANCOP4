package bancos;

import java.util.ArrayList;
import java.util.List;

import contas.Conta;

public class Banco {
	private List<Conta> contas;
	
	public Banco(){
		contas = new ArrayList<Conta>();
	}
	
	public void abrirConta(String numeroConta, String nomeCliente){
		Conta conta = new Conta(numeroConta, nomeCliente);
		contas.add(conta);
	}
	
	public void abrirConta(String numeroConta, String nomeCliente, Double saldo){
		Conta conta = new Conta(numeroConta, nomeCliente, saldo);
		contas.add(conta);
	}
	
	public void transferir(String contaOrigem, String contaDestino, Double valor){
		try {
			debitar(contaOrigem, valor);
			creditar(contaDestino, valor);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void imprimirLancamentos(String numConta){
		for (Conta conta : contas) {
			if(conta.getNumeroConta().equals(numConta)){
				conta.imprimir();
				return;
			}
		}
	}
	public void debitar(String numeroConta,Double valor) throws Exception{
		for (Conta conta : contas) {
			if(conta.getNumeroConta().equals(numeroConta)){
				conta.debitar(valor);
				return;
			}
		}
		throw new Exception("Conta nao existe");
	}
	public void creditar(String numeroConta,Double valor) throws Exception{
		for (Conta conta : contas) {
			if(conta.getNumeroConta().equals(numeroConta)){
				conta.creditar(valor);
				return;
			}
		}
		throw new Exception("Conta nao existe");
	}

	
	
	
	

}
