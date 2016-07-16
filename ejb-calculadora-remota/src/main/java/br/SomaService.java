package br;
import java.io.Serializable;
import java.math.BigDecimal;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Remote
public class SomaService implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	public BigDecimal somar (BigDecimal valor1, BigDecimal valor2){
		BigDecimal resultadoSoma = new BigDecimal(0);
		try {
			resultadoSoma = valor1.add(valor2);
		} catch (Exception e) {
			e.getMessage();
		}
		return resultadoSoma;
	}

}
