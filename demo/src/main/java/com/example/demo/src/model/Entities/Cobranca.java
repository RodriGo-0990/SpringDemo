package com.example.demo.src.model.Entities;

public class Cobranca {
	private Double valorBasico;
	private Double valorTaxa;
	
	
	public Double getValorBasico() {
		return valorBasico;
	}
	public void setValorBasico(Double valorTotal) {
		this.valorBasico = valorTotal;
	}
	public Double getValorTaxa() {
		return valorTaxa;
	}
	public void setValorTaxa(Double valorTaxa) {
		this.valorTaxa = valorTaxa;
	}
	public Double getValorTotal(){
		return getValorBasico() + getValorTaxa();
	}
	public Cobranca(Double valorBasico, Double valorTaxa) {
		
		this.valorBasico = valorBasico;
		this.valorTaxa = valorTaxa;
	}
	@Override
	public String toString() {
		return "Valor Basico: $" + valorBasico + "\n"+  
				"ValorTaxa: $" + valorTaxa + "\n" +
				"TOTAL: $"+ getValorTotal()+"\n"+"-------------";
	}
	
	

	
}
