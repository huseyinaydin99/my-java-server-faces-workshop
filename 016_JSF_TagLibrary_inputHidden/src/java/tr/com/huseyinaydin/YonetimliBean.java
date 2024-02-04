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

    String verileceMesaj = "Bilişim, yazılım teknolojileri insanoğlunun şu ana kadar ki elde edebildiği en üstün şey ve süper güce en yakın şeydir.";

    public String getVerileceMesaj() {
        return verileceMesaj;
    }

    public void setVerileceMesaj(String verileceMesaj) {
        this.verileceMesaj = verileceMesaj;
    }
}