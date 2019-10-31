package psc.jsf.primefaces;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class FirstMB {
	
	private String message = "Hello World! This is our First Managed Bean.";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}