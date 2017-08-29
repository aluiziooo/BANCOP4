package contas;

import java.util.ArrayList;
import java.util.Iterator;

import bancos.Lancamento;

public class Conta {
	protected String tipo;
	protected String numeroConta;
	protected String nomeCliente;
	protected Double saldo = 0.0;
	
	ArrayList<Lancamento> lancamentos = new ArrayList<>();
	
	
	public Conta(){
		this.nomeCliente="Cliente sem nome";
		this.numeroConta="Conta sem numero";
	}
	public Conta(String numeroConta, String nomeCliente){
		this.nomeCliente = nomeCliente;
		this.numeroConta = numeroConta;
	}
	
	public Conta(String numeroConta, String nomeCliente, Double saldo){
		this(numeroConta, nomeCliente);
		this.saldo = saldo;
	}
	
	public void imprimir(){
		System.out.println("===================\nCliente: "+this.nomeCliente+"");
		for (Lancamento lancamento : lancamentos) {
			System.out.println("---------------\nLançamento\n-------------\nData: "+lancamento.getData()+"\nLançamento: "+lancamento.getValor()+"\nTipo: "+lancamento.getTipo());
		}
		System.out.println("\n--------------------\nSaldo atual:"+saldo+"\n--------------------");
	}
	
	public void creditar(Double valor){
		tipo = "Creditar";
		Lancamento L = new Lancamento(tipo,valor);
		lancamentos.add(L);
		saldo +=valor;
	}
	
	public void debitar(Double valor) throws Exception{
		if(saldo >= valor ){
			lançando(valor);
			saldo -= valor;
			return;
		}
		throw new Exception("Saldo nao pode ficar negativo");
		
	}
	
	public Lancamento lançando(double valor){
		tipo = "Debitar";
		valor *= -1;
		Lancamento L = new Lancamento(tipo,valor);
		lancamentos.add(L);
		
		return L;
	}
	
	
	
	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

}
