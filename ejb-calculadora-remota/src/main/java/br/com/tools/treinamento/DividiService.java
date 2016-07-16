
package br.com.tools.treinamento;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Remote
@Stateless
public class DividiService implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BigDecimal dividir(BigDecimal valor, BigDecimal divisor) throws Exception{
		try {
			return valor.divide(divisor); 
		} catch (ArithmeticException e) {			
			throw new Exception("Valor incorretos para divisão");
		}
	}
}
