package tr.com.huseyinaydin;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
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

    String numarasi;
    String adiSoyadi;
    BigDecimal maasi;
    int yasi;

    public String getAdiSoyadi() {
        return adiSoyadi;
    }

    public void setAdiSoyadi(String adiSoyadi) {
        this.adiSoyadi = adiSoyadi;
    }

    public BigDecimal getMaasi() {
        return maasi;
    }

    public void setMaasi(BigDecimal maasi) {
        this.maasi = maasi;
    }

    public String getNumarasi() {
        return numarasi;
    }

    public void setNumarasi(String numarasi) {
        this.numarasi = numarasi;
    }

    public int getYasi() {
        return yasi;
    }

    public void setYasi(int yasi) {
        this.yasi = yasi;
    }

    private static final ArrayList<Personel> personelListesi
            = new ArrayList<Personel>(Arrays.asList(
                    new Personel("571", "Hüseyin Aydın", 28, new BigDecimal("1900.00")),
                    new Personel("1299", "Selim Uçar", 22, new BigDecimal("1500.00")),
                    new Personel("1326", "Hasan Aydın", 26, new BigDecimal("1800.00")),
                    new Personel("632", "Ayturan Yıldırım", 23, new BigDecimal("1300.00"))
            ));

    public ArrayList<Personel> getPersonelListesi() {
        return personelListesi;
    }

    public String kayitEkle() {
        Personel personel = new Personel(this.numarasi, this.adiSoyadi, this.yasi, this.maasi);
        personelListesi.add(personel);
        this.numarasi = "";
        this.adiSoyadi = "";
        this.yasi = 0;
        this.maasi = null;
        return null;
    }

    public String kayitSil(Personel personel) {
        personelListesi.remove(personel);
        return null;
    }
}