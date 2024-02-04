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

@ManagedBean(name = "yb2")
@SessionScoped
public class YonetimliBean2 {

    public String[] androidSeverler;

    public String[] getAndroidSeverler() {
        return androidSeverler;
    }

    public void setAndroidSeverler(String[] androidSeverler) {
        this.androidSeverler = androidSeverler;
    }

    public String getAndroidSeverlerSonucu() {
        return Arrays.toString(androidSeverler);
    }
}