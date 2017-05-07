package demojsf2.jsf.exos;

import java.util.ArrayList;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean(name="mBInject", eager=true)
@ApplicationScoped
public class MBInject {
	
	private String data = "data from inject";
	
	public MBInject() {
		System.out.println("Injected bean created");
	}
	
	@ManagedProperty(value="#{mBInjected}")
	private MBInjected mBInjected;
		
	public MBInjected getmBInjected() {
		return mBInjected;
	}

	public void setmBInjected(MBInjected mBInjected) {
		this.mBInjected = mBInjected;
	}
	
	@ManagedProperty(value="#{mBInjectedService}")
	private MBInjectedService mBInjectedService;
	
	public void setmBInjectedService(MBInjectedService mBInjectedService) {
		this.mBInjectedService = mBInjectedService;
	}
	
	@ManagedProperty(value="#{clientService}")
	private ClientService clientService;

	public ClientService getClientService() {
		return clientService;
	}

	public void setClientService(ClientService clientService) {
		this.clientService = clientService;
	}

	public String getData() {
		 mBInjected.show();
		 mBInjectedService.show();
		 return mBInjected.getInjectedData()
				 +" + " +mBInjectedService.getInjectedData()
				 +" + " +mBInjectedService.getInjectedData2()
				 +" + nombre de clients : " +clientService.getNbClients();
	}
	

	
	
	
}
