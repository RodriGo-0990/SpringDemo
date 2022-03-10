package com.example.demo.src.model.services;

import com.example.demo.src.model.Interfaces.TaxPayment;

public class TaxPaymentimpl implements TaxPayment {
	
	public double cobrarTaxa(Double valor) { 
		if(valor < 100) {
			valor = valor * 0.2;
		}else {
			valor = valor * 0.15;
		}
		return valor;
	}
}
