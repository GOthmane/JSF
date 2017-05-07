package demojsf1.jsf.exos;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="mBeanResult", eager=true)
// Par défaut : @RequestScoped
//@ApplicationScoped
//@ViewScoped
@SessionScoped
public class MBeanResult {
	
	private String dataResult ="";

	
	public MBeanResult() {
		System.out.println("mBeanResult constructeur");
	}

	public String getDataResult(){
		return dataResult;
	}

	public void setDataResult(String dataResult){
		System.out.println("setting set dataResult : "+dataResult);
		this.dataResult=dataResult;
	}
}
