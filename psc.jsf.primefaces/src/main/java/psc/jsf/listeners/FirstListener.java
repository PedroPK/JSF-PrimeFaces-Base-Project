package psc.jsf.listeners;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class FirstListener implements PhaseListener {

	public void afterPhase(PhaseEvent event) {
		// TODO Auto-generated method stub
		System.out.println("After " + event.getPhaseId().toString());
	}

	public void beforePhase(PhaseEvent event) {
		// TODO Auto-generated method stub
		System.out.println("Before " + event.getPhaseId().toString());
	}

	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}

}