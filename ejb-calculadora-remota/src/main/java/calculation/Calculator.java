package calculation;
import java.io.Serializable;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Remote
public class Calculator implements Serializable {

	private static final long serialVersionUID = 1L;

	public int round(float value) {	
		int result = 0;
		try {
			result = Math.round(value);			
		} catch (Exception e){
			e.printStackTrace();
		}
		
		return result;
	}
	
	public long round(double value) {		
		long result = 0;
		try {
			result = Math.round(value);
		} catch (Exception e){
			e.printStackTrace();
		}
		
		return result;
	}
	

}


