package br.com.tools.treinamento.test;

import java.io.Serializable;
import javax.ejb.Remote;
import javax.ejb.Stateless;

@Remote
@Stateless
public class DividePorCem implements Serializable{
		
	public double divide(double valor){
		
		double resultado;
		resultado = valor/100;
		return resultado;
		
	}

}
