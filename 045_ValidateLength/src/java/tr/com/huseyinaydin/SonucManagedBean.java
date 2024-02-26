package tr.com.huseyinaydin;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

//بسم الله الرحمن الرحيم
/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java, Java Server Faces.
 *
 */

@ManagedBean(name = "yb")
@RequestScoped
public class SonucManagedBean {

    public SonucManagedBean() {
    }
    
    String cumle;

    public String getCumle() {
        return cumle;
    }

    public void setCumle(String cumle) {
        this.cumle = cumle;
    }
}