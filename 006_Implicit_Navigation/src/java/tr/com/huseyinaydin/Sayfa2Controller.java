package tr.com.huseyinaydin;

import java.io.Serializable;
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

@ManagedBean
@RequestScoped
public class Sayfa2Controller implements Serializable {

    public Sayfa2Controller() {
    }

    public String sayfa2yiAc() {
        return "sayfa2?faces-redirect=true"; //outcome çıkış
    }
}
