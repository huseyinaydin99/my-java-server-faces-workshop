package tr.com.huseyinaydin;
import java.util.Arrays;
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

@ManagedBean(name = "yb4")
@SessionScoped
public class YonetimliBean4 {
    
    public String[] javaGuiSeverler;

    public String[] getJavaGuiSeverler() {
        return javaGuiSeverler;
    }
    public void setJavaGuiSeverler(String[] javaGuiSeverler) {
        this.javaGuiSeverler = javaGuiSeverler;
    }

    //Map - Haritalama ile oluşturuldu.
    private static Map<String, Object> javaGuiSeverlerAdiSoyadi;

    static {
        javaGuiSeverlerAdiSoyadi = new LinkedHashMap<String, Object>();
        javaGuiSeverlerAdiSoyadi.put("Şakir Cumali", "1"); //label, value
        javaGuiSeverlerAdiSoyadi.put("Veli Emmi", "2"); //etiket , değer
        javaGuiSeverlerAdiSoyadi.put("Şakir Şenşakırdakçıoğulları", "3");
        javaGuiSeverlerAdiSoyadi.put("Bekir Tekir", "4");
        javaGuiSeverlerAdiSoyadi.put("Cahit Karataş", "5");
        javaGuiSeverlerAdiSoyadi.put("Muharrem Melih Cessur", "6");
    }

    public Map<String, Object> getJavaGuiSeverlerAdiSoyadi() {
        return javaGuiSeverlerAdiSoyadi;
    }

    public String getJavaGuiSeverlerSonucu() {
        return Arrays.toString(javaGuiSeverler);
    }
}