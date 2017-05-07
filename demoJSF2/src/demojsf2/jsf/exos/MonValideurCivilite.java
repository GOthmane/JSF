package demojsf2.jsf.exos;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

//@FacesValidator("demojsf2.jsf.exos.MonValidateurCivilite") // en passant par le .xhtml
@FacesValidator // en passant par faces-config.xml
public class MonValideurCivilite implements Validator{

	@Override
	public void validate(FacesContext facesContext,
	      UIComponent component, Object value)
	      throws ValidatorException {
		
	      //StringBuilder url = new StringBuilder();
	      
	      String inputData = value.toString(); // inputData représente ce qui a été saisi
	      
	      if(!(inputData.equals("Mr")||inputData.equals("Mme")||inputData.equals("Mlle"))) {
	    	  
	    	  FacesMessage msg = new FacesMessage("Erreur de civilité (Mr,Mme,Mlle)");
	    	  msg.setSeverity(FacesMessage.SEVERITY_ERROR);
	    	  throw new ValidatorException(msg);
	    	  
	      }
	}

}
