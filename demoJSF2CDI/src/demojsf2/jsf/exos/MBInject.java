package demojsf2.jsf.exos;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ApplicationScoped
public class MBInject implements Serializable{

	private static final long serialVersionUID = -2400729488209306551L;
	
	private String data = "data from inject";
	
	public MBInject() {
		System.out.println("Injected bean created");
	}
	
	@Inject
	private MBInjected mBInjected;
	
	@Inject
	private ClientService clientService;

	public String getData() {
		 mBInjected.show();
		 return mBInjected.getInjectedData() + " + nombre de clients : " + clientService.getNbClients();
	}

}
