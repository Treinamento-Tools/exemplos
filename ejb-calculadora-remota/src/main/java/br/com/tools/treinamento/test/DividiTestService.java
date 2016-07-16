package br.com.tools.treinamento.test;

import java.math.BigDecimal;

import br.com.tools.treinamento.DividiService;

public class DividiTestService {
	public static void main(String[] args) throws Exception {
		DividiService d = new DividiService();
		
		System.out.println(d.dividir(BigDecimal.TEN, BigDecimal.TEN));
		System.out.println(d.dividir(BigDecimal.valueOf(5), BigDecimal.valueOf(4)));
		System.out.println(d.dividir(BigDecimal.valueOf(10), BigDecimal.valueOf(5)));
		System.out.println(d.dividir(BigDecimal.valueOf(100), BigDecimal.valueOf(2)));
		System.out.println(d.dividir(BigDecimal.valueOf(15), BigDecimal.valueOf(3)));
		
		
	}
	
	
}
