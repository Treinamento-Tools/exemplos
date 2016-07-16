import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class MultiplicacaoService {
	private int multiplicando;
	private int multiplicador;
	public MultiplicacaoService(int multiplicando, int multiplicador) {
		super();
		this.multiplicando = multiplicando;
		this.multiplicador = multiplicador;
	}
	@WebMethod
	public int multiplicar() {
		return multiplicando*multiplicador;
	} 
	

}
