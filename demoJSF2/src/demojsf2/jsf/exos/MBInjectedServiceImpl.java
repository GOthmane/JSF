package demojsf2.jsf.exos;

import java.util.ArrayList;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name="mBInjectedService", eager=true)
@ApplicationScoped
public class MBInjectedServiceImpl implements MBInjectedService {
	
	public MBInjectedServiceImpl() {
		System.out.println("Injected service bean created");
	}
	
	@Override
	public String getInjectedData(){
		return("Hello injected service");
	}
	
	@Override
	public void show() {
		System.out.println("show injected service");
	}

	@Override
	public String getInjectedData2() {
		return("Hello injected service 2");
	}

}
