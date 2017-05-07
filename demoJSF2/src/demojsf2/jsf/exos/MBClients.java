package demojsf2.jsf.exos;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="mBClients", eager=true)
@SessionScoped
public class MBClients {

	//ClientService clientService;
	@ManagedProperty(value="#{clientService}")
	private ClientService clientService;

	public ClientService getClientService() {
		return clientService;
	}

	public void setClientService(ClientService clientService) {
		this.clientService = clientService;
	}
	
	private Client clientCourant;
	private Client clientAAjouter = new Client();
	
	public MBClients() {
		ClientService clientService = new ClientService();
	}
	
	public ArrayList<Client> getClients(){
		return clientService.getClients();
	}
	
	public Client getClientCourant() {
		return clientCourant;
	}

	public void setClientCourant(Client clientCourant) {
		this.clientCourant = clientCourant;
	}

	public String select(Client client){
		this.clientCourant = client;
		System.out.println("selected : " + clientCourant.getNom());
		return "clientDisplay"; // retourne "clientDisplay", interprété par la servlet de JSF qui redirige vers la page clientDisplay.xhtml
	}
	
	public String delete(){
		clientService.delete(clientCourant);;
		return "clients";
	}
	
	public int getNbClients() {
		return clientService.getClients().size();
	}
	
	public Client getClientAAjouter() {
		return clientAAjouter;
	}

	public void setClientAAjouter(Client clientAAjouter) {
		this.clientAAjouter = clientAAjouter;
	}

	public String add(){
		clientService.add(clientAAjouter);
		Client clientAAjouter = new Client();
		return "clients";
	}

	
}
