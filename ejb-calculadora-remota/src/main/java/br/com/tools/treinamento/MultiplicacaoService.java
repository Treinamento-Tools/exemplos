package br.com.tools.treinamento;

import java.io.Serializable;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Remote
@Stateless
public class MultiplicacaoService implements Serializable {


	public int multiplicar(int multiplicando, int multiplicador) {
		return multiplicando * multiplicador;
	}

}
