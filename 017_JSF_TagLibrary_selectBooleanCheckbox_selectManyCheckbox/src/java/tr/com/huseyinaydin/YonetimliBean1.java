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

@ManagedBean(name = "yb1")
@SessionScoped
public class YonetimliBean1 {

    public boolean yazilimiSeviyorMu;
    
    public boolean isYazilimiSeviyorMu() {
        return yazilimiSeviyorMu;
    }

    public void setYazilimiSeviyorMu(boolean yazilimiSeviyorMu) {
        this.yazilimiSeviyorMu = yazilimiSeviyorMu;
    }
}