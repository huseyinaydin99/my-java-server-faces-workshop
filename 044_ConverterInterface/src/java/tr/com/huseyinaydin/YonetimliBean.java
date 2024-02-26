package tr.com.huseyinaydin;
 
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

//بسم الله الرحمن الرحيم
/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java, Java Server Faces.
 *
 */

@ManagedBean(name = "yb")
@SessionScoped
public class YonetimliBean implements Serializable {

    String siteAdresi;

    public String getSiteAdresi() {
        return siteAdresi;
    }

    public void setSiteAdresi(String siteAdresi) {
        this.siteAdresi = siteAdresi;
    }
}