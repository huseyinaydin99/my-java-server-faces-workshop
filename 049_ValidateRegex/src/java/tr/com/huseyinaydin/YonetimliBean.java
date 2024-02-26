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
public class YonetimliBean {

    public YonetimliBean() {
    }
         
    private String eposta;

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }
}