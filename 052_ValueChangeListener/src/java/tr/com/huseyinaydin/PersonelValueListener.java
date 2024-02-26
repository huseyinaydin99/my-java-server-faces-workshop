package tr.com.huseyinaydin;

import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;

//بسم الله الرحمن الرحيم
/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java, Java Server Faces.
 *
 */

public class PersonelValueListener implements ValueChangeListener {

    @Override
    public void processValueChange(ValueChangeEvent event)
            throws AbortProcessingException {

        // personel bean'e doğrudan erişim
        PersonelBean personel = (PersonelBean) FacesContext.getCurrentInstance().
                getExternalContext().getSessionMap().get("personel");
        personel.setHakkinda(event.getNewValue().toString());
    }
}