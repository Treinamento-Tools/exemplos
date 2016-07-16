package br.com.tools.treinamento.test;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import br.com.tools.treinamento.CalculadoraRemotaService;
import br.com.tools.treinamento.CalculadoraServiceException;

public class SubtrairTest {
	@Test
	public void subtrair() throws CalculadoraServiceException {
		CalculadoraRemotaService service = new CalculadoraRemotaService();
		BigDecimal resultado = service.subtrair(BigDecimal.TEN, BigDecimal.TEN);
		Assert.assertEquals(resultado, BigDecimal.ZERO);
	}
	
	@Test
	public void subtrairValoresNegtivos() throws CalculadoraServiceException {
		CalculadoraRemotaService service = new CalculadoraRemotaService();
		BigDecimal resultado = service.subtrair(BigDecimal.valueOf(-10), BigDecimal.valueOf(-10));
		Assert.assertEquals(resultado, BigDecimal.valueOf(0));
	}

	@Test(expected = CalculadoraServiceException.class)
	public void parametrosInvalidos() throws CalculadoraServiceException {
		CalculadoraRemotaService service = new CalculadoraRemotaService();
		service.subtrair(null, BigDecimal.TEN);
	}

}
