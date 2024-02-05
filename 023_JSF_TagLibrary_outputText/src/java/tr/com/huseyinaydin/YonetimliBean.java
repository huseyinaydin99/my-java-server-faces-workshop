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

    private String adi;
    private String soyadi;

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
  
    public String mesaj = "Bilişim, yazılım teknolojileri insanoğlunun şu ana kadar ki elde edebildiği en üstün şey ve süper güce en yakın şeydir.";

    public String getMesaj() {
        return mesaj;
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }

    public String htmlInputYaziKutusu = "<input type='text' size='40' />";
    public String htmlInputRadioKutusu
            = "<input type='radio' name='cinsiyet' value='bayan' /> Bayan<br />"
            + "<input type='radio' name='cinsiyet' value='erkek' /> Erkek";
    public String htmlInputCheckboxKutusu
            = "<input type='checkbox' name='egitimseti' value='JavaGUI' /> "
            + "JAVA GUI EĞİTİM SETİ <br />"
            + "<input type='checkbox' name='egitimseti' value='JSF' /> "
            + "JSP-JSF EĞİTİM SETİ";

    public String getHtmlInputCheckboxKutusu() {
        return htmlInputCheckboxKutusu;
    }

    public void setHtmlInputCheckboxKutusu(String htmlInputCheckboxKutusu) {
        this.htmlInputCheckboxKutusu = htmlInputCheckboxKutusu;
    }

    public String getHtmlInputRadioKutusu() {
        return htmlInputRadioKutusu;
    }

    public void setHtmlInputRadioKutusu(String htmlInputRadioKutusu) {
        this.htmlInputRadioKutusu = htmlInputRadioKutusu;
    }

    public String getHtmlInputYaziKutusu() {
        return htmlInputYaziKutusu;
    }

    public void setHtmlInputYaziKutusu(String htmlInputYaziKutusu) {
        this.htmlInputYaziKutusu = htmlInputYaziKutusu;
    }
}