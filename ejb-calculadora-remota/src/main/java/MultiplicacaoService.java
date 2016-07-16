import javax.ejb.Remote;
import javax.ejb.Stateless;

@Remote
@Stateless
public class MultiplicacaoService {

	public int multiplicar(int multiplicando, int multiplicador) {
		return multiplicando * multiplicador;
	}

}
