package tr.com.huseyinaydin;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

//بسم الله الرحمن الرحيم
/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java, Java Server Faces.
 *
 */

@ManagedBean(name = "yb")
@RequestScoped
public class YonetimliBean {

    public YonetimliBean() {
    }

    int tamsayi;
    double virgullusayi;

    public int getTamsayi() {
        return tamsayi;
    }

    public void setTamsayi(int tamsayi) {
        this.tamsayi = tamsayi;
    }
}