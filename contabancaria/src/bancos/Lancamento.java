/**
 *@date 29 de ago de 2017
 *@author  Neto
 *@time	12:36:26
 */
package bancos;

import java.util.Date;

/**
 * @author Neto
 *
 */

public class Lancamento {
	private Date data;
	private double valor;
	private String tipo;
	
	public Lancamento(){
		Date D = new Date();
		this.setData(D);
	}
	
	public Lancamento(String M, double valor){
		Date D = new Date();
		this.data = D;
		setValor(valor);
		setTipo(M);
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}
