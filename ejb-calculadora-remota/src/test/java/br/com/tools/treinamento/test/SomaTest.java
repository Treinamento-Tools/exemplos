package br.com.tools.treinamento.test;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import br.com.tools.treinamento.CalculadoraRemotaService;
import br.com.tools.treinamento.CalculadoraServiceException;

public class SomaTest {

	@Test
	public void test() throws CalculadoraServiceException {
		CalculadoraRemotaService service = new CalculadoraRemotaService();
		BigDecimal resultado = service.somar(BigDecimal.TEN, BigDecimal.TEN);
		Assert.assertEquals(resultado, new BigDecimal(20));
	}

	@Test(expected = CalculadoraServiceException.class)
	public void somaNulos() throws CalculadoraServiceException {
		CalculadoraRemotaService service = new CalculadoraRemotaService();
		service.somar(null, BigDecimal.TEN);
	}
	
}
