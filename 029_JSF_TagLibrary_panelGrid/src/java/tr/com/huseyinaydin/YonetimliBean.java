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

    public String adi, soyadi;
    public int numarasi;

    public String getAdi() {
        return adi;
    }
    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }
    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public int getNumarasi() {
        return numarasi;
    }
    public void setNumarasi(int numarasi) {
        this.numarasi = numarasi;
    }
}