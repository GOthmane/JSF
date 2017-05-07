package demojsf1.jsf.exos;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="mBean1", eager=true)
// Par défaut : @RequestScoped
//@ApplicationScoped
//@ViewScoped
@SessionScoped
public class MBean1 {
	
	private String message = "Hello";
	private int compteur = 0;
	//final static int CONSTANTE = 10;
	private String data ="";
	private String data2 ="";
	private String lesDeux ="";
	private String civilite ="";
	
	public MBean1() {
		System.out.println("mBean1 constructeur");
	}

	public String getMessage() {
		compteur ++;
		return message + compteur + " data = "+data + " data2 = "+data2;
	}
	
	public String getData(){
		return data;
	}

	public void setData(String data){
		System.out.println("setting set data : "+data);
		this.data=data;
	}
	
	public String getCivilite(){
		return civilite;
	}

	public void setCivilite(String civilite){
		System.out.println("setting set civilite : "+civilite);
		this.civilite=civilite;
	}
	
	public String getData2(){
		return data2;
	}

	public void setData2(String data2){
		System.out.println("setting set data2 : "+data2);
		this.data2=data2;
		FacesContext ctx = FacesContext.getCurrentInstance();
		ctx.addMessage("laForm:inputData2", new FacesMessage("message inputData2 depuis le bean"));
		ctx.addMessage("laForm:inputDataXXX", new FacesMessage("message inputDataXXX depuis le bean"));
		ctx.addMessage(null, new FacesMessage("message for all depuis le bean")); // permet de rassembler tous les messages
		ctx.addMessage("laFormResult:inputDataResult", new FacesMessage("message inputDataResult depuis le bean"));
	}
	public String getLesDeux(){
		return data + data2;
	}
	public String goConditionnel(){
		if(data.length()>10)
		return "jsf3result2";
		else return "jsf3result";
	}
	public String testErreur(){
		System.out.println("testerreur");
		return "erreur";
	}
}
