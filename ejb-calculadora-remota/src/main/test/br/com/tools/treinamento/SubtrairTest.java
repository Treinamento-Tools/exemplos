package br.com.tools.treinamento;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class SubtrairTest {
	@Test
	public void test() throws CalculadoraServiceException {
		CalculadoraRemotaService service = new CalculadoraRemotaService();
		BigDecimal resultado = service.subtrair(BigDecimal.TEN, BigDecimal.TEN);
		Assert.assertEquals(resultado, BigDecimal.ZERO);
	}

	@Test(expected = CalculadoraServiceException.class)
	public void somaNulo() throws CalculadoraServiceException {
		CalculadoraRemotaService service = new CalculadoraRemotaService();
		service.subtrair(null, BigDecimal.TEN);
	}

}
