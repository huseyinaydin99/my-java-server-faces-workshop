package tr.com.huseyinaydin;

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
public class YonetimliBean {

    public String kullaniciAdi, adiSoyadi, eposta, parola;

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    } 

    public String getAdiSoyadi() {
        return adiSoyadi;
    }

    public void setAdiSoyadi(String adiSoyadi) {
        this.adiSoyadi = adiSoyadi;
    } 

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    } 

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    } 

    public String kayitOlActionMetodu() {
        return "sonuc";
    }
}