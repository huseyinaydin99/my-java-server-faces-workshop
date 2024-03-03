package tr.com.huseyinaydin;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

//بسم الله الرحمن الرحيم
/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java, Java Server Faces.
 *
 */

@ManagedBean(name = "sb")
@ViewScoped
public class SayacBean implements Serializable {

    private int sayi;

    public int getSayi() {
        return sayi;
    }

    public void setSayi(int sayi) {
        this.sayi = sayi;
    }

    public void arttir() {
        sayi++;
    }

    public void azalt() {
        sayi--;
    }
}