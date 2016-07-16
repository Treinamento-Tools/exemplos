package calculation;
import javax.ejb.Stateless;

@Stateless
public class Calculator {

	public int round(float value) {		
		return Math.round(value);
	}
	
	public long round(double value) {		
		return Math.round(value);
	}

}


