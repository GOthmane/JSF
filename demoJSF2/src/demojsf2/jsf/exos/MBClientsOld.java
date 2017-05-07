package demojsf2.jsf.exos;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="mBClients", eager=true)
@SessionScoped
public class MBClientsOld {

	private ArrayList<Client> clients = new ArrayList<Client>();
	private Client clientCourant;
	private Client clientAAjouter = new Client();
	private int nbClients;
	
	public MBClientsOld() {
		clients.add(new Client("Dupont", "Jean"));
		clients.add(new Client("Durand", "Paul"));
	}

	public ArrayList<Client> getClients() {
		System.out.println("get MBClients");
		return clients;
	}

	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
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
		return "client"; // retourne "client", interprété par la servlet de JSF qui redirige vers la page client.xhtml
	}
	
	public String delete(){
		System.out.println("deleting : " + clientCourant.getNom());
		clients.remove(clientCourant);
		return "clients";
	}
	
	public int getNbClients() {
		return clients.size();
	}
	
	public Client getClientAAjouter() {
		return clientAAjouter;
	}

	public void setClientAAjouter(Client clientAAjouter) {
		this.clientAAjouter = clientAAjouter;
	}

	public String add(){
		Client newClient = new Client(clientAAjouter.getNom(),clientAAjouter.getPrenom());
		clients.add(newClient);
		return "clients";
	}

	
}
