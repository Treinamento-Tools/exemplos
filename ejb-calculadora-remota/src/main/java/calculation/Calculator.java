package calculation;
import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Remote
public class Calculator {

	public int round(float value) {		
		return Math.round(value);
	}
	
	public long round(double value) {		
		return Math.round(value);
	}

}


