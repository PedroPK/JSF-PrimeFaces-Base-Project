package psc.jsf.primefaces;

import java.time.LocalDateTime;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class ConfirmationDialogMB {

	public void press() {
		LocalDateTime now = LocalDateTime.now();
		
		addMessage("Press Infor", now + " Managed Bean was invoked successfully!");
	}

	public void addMessage(String summary, String detail) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

}
