package br.com.tools.treinamento.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.tools.treinamento.MultiplicacaoService;

public class MultiplicacaoServiceTest {

	@Test
	public void test() {
		MultiplicacaoService mult = new MultiplicacaoService();
		assertEquals("10 x 0 must be 0", 0, mult.multiplicar(10, 0));
        assertEquals("0 x 10 must be 0", 0, mult.multiplicar(0, 10));
        assertEquals("0 x 0 must be 0", 0, mult.multiplicar(0, 0));
        assertEquals("10 x 10 must be 0", 100, mult.multiplicar(10, 10));
	}

}
