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
    
    double virgullusayi;

    public double getVirgullusayi() {
        return virgullusayi;
    }

    public void setVirgullusayi(double virgullusayi) {
        this.virgullusayi = virgullusayi;
    }
}