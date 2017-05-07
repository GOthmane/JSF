package demojsf2.jsf.exos;

import java.util.ArrayList;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name="mBInjected", eager=true)
@ApplicationScoped
public class MBInjected {
	
	public MBInjected() {
		System.out.println("Injected bean created");
	}
	
	public String getInjectedData(){
		return("Hello injected");
	}
	
	public String getInjectedData2(){
		return("Hello injected 2");
	}
	
	public void show() {
		System.out.println("show injected");
	}

	
}
