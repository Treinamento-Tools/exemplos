package br.com.tools.treinamento;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Remote
@Stateless
public class CalculadoraRemotaService implements Serializable {

	private static final long serialVersionUID = 1L;

	public BigDecimal somar(BigDecimal a, BigDecimal b) throws CalculadoraServiceException {
		BigDecimal resultado = null;

		try {
			resultado = a.add(b);
		} catch (NullPointerException npe) {
			throw new CalculadoraServiceException("Parametros informados inválidos");
		}

		return resultado;
	}

	public BigDecimal subtrair(BigDecimal a, BigDecimal b) throws CalculadoraServiceException {
		BigDecimal resultado = null;
		try {
			resultado = a.subtract(b);
		} catch (NullPointerException npe) {
			throw new CalculadoraServiceException("Parametros informados inválidos");
		}
		return resultado;
	}
}
