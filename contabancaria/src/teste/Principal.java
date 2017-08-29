package teste;

import bancos.Banco;
import contas.Conta;

public class Principal {
	public static void main(String[] args) {
		Banco banco = new Banco();
		try {
			banco.abrirConta("123", "Coroinha", 150.0);
			banco.abrirConta("1234", "Aluizio");
			
			banco.transferir("123","1234", 30.0);
			System.out.println("Imprimindo antes");
			banco.imprimirLancamentos("123");
			banco.imprimirLancamentos("1234");
			
			banco.debitar("1234", 14.5);
			System.out.println("Imprimindo Depois");
			banco.imprimirLancamentos("123");
			banco.imprimirLancamentos("1234");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
}
