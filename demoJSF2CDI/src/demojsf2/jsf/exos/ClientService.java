package demojsf2.jsf.exos;

import java.util.ArrayList;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class ClientService {

	private ArrayList<Client> clients = new ArrayList<Client>();
	
	public ClientService() {
		clients.add(new Client("Dupont", "Jean"));
		clients.add(new Client("Durand", "Paul"));
	}

	public ArrayList<Client> getClients() {
		return clients;
	}

	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}
	
	public int getNbClients() {
		return clients.size();
	}
	
	public void delete(Client client){
		clients.remove(client);
	}

	public void add(Client client){
		clients.add(client);
	}	
}
