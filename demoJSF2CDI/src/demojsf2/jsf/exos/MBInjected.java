package demojsf2.jsf.exos;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class MBInjected implements Serializable{

	private static final long serialVersionUID = -3235231515328957816L;

	public MBInjected() {
		System.out.println("Injected bean created");
	}
	
	public String getInjectedData(){
		return("Hello injected");
	}
	
	public void show() {
		System.out.println("show injected");
	}

	
}
