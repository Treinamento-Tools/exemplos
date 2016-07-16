import java.io.Serializable;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Remote
@Stateless
public class Calculadora implements Serializable {

	private static final long serialVersionUID = 1L;

public double raizQuadrada(int valor){		
		return Math.sqrt(valor);
		}
	
 public double raizAtan(int valor){		
		return Math.atan(valor);
		}
 
 public double raizRound(int valor){	
		return Math.round(valor);
		}
}
