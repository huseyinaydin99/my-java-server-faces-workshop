package tr.com.huseyinaydin;
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

@ManagedBean(name = "yb3")
@SessionScoped
public class YonetimliBean3 {
    public String[] iphoneSeverler;

    public String[] getIphoneSeverler() {
        return iphoneSeverler;
    }
    public void setIphoneSeverler(String[] iphoneSeverler) {
        this.iphoneSeverler = iphoneSeverler;
    }
  //Array - Dizi tarafından oluşturuldu
    public String[] getIphoneSeverlerAdiSoyadi() {
        iphoneSeverler = new String[6];
        iphoneSeverler[0] = "Anıl Can Uğursuz";
        iphoneSeverler[1] = "Aydın Aydın";
        iphoneSeverler[2] = "Rüçhan Kaçan";
        iphoneSeverler[3] = "Selami Zımba";
        iphoneSeverler[4] = "Mehtap Baydın";
        iphoneSeverler[5] = "Hüseyin Aydın";
        return iphoneSeverler;
    }
    
    public String getIphoneSeverlerSonucu() {
        return Arrays.toString(iphoneSeverler);
    }
}