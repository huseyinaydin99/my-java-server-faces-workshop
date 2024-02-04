package tr.com.huseyinaydin;

import java.util.LinkedHashMap;
import java.util.Map;
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

    public String programlamadili;
    //getter and setter metotları

    public String getProgramlamadili() {
        return programlamadili;
    }

    public void setProgramlamadili(String programlamadili) {
        this.programlamadili = programlamadili;
    }
    
    public String ders;
    public String egitmen;

    public String getDers() {
        return ders;
    }
    public void setDers(String ders) {
        this.ders = ders;
    }

    public String getEgitmen() {
        return egitmen;
    }
    public void setEgitmen(String egitmen) {
        this.egitmen = egitmen;
    }
    //Map Haritalama ile değerleri hazırlıyoruz.
    private static Map<String, Object> dersAdi;
    static {
        dersAdi = new LinkedHashMap<String, Object>();
        dersAdi.put("Java Standard Edition", "Java SE"); //etiket, değer
        dersAdi.put("JavaServer Pages", "JSP");
        dersAdi.put("JavaServer Faces ", "JSF");//label, value
    } 

    public Map<String, Object> dersAdlariniAl() {
        return dersAdi;
    }
  
    //Sınıf ile nesne aracılığı ile değerleri hazırlıyoruz.
    public static class Egitmen {
        public String egitmenAdi;
        public String egitmenNo;

        public Egitmen(String egitmenAdi, String egitmenNo) {
            this.egitmenAdi = egitmenAdi;
            this.egitmenNo = egitmenNo;
        }

        public String getEgitmenAdi() {
            return egitmenAdi;
        }

        public String getEgitmenNo() {
            return egitmenNo;
        }
    }
    public Egitmen[] egitmenBilgisi;

    public Egitmen[] getEgitmenBilgileriniAl() {

        egitmenBilgisi = new Egitmen[4];
        egitmenBilgisi[0] = new Egitmen("XXX", "1453");
        egitmenBilgisi[1] = new Egitmen("YYY", "1299");
        egitmenBilgisi[2] = new Egitmen("TTT", "1517");
        egitmenBilgisi[3] = new Egitmen("NNNT", "1326");

        return egitmenBilgisi;
    }
}