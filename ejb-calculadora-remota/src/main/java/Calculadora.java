import java.io.Serializable;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebMethod;

@Remote
@Stateless
public class Calculadora implements CalculadoraInterface {


 public double raizQuadrada(int valor){		
		return Math.sqrt(valor);
		}
	
 public double raizAtan(int valor){		
		return Math.atan(valor);
		}
 
 public double raizRound(int valor){		
		return Math.round(valor);
		}
	
	public static void main(String[] args) {
		Calculadora c = new Calculadora();
		System.out.print(c.raizQuadrada(4));

	}

}
