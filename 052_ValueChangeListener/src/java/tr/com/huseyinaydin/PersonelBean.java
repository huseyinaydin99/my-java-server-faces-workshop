package tr.com.huseyinaydin;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ValueChangeEvent;

//بسم الله الرحمن الرحيم
/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java, Java Server Faces.
 *
 */

@ManagedBean(name = "personel")
@SessionScoped
public class PersonelBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private static Map<String, String> kisiler;
    private String hakkinda = "Niğde ÖHÜ"; //varsayılan değer

    static {
        kisiler = new LinkedHashMap<String, String>();
        kisiler.put("Abc", "Abc");
        kisiler.put("Cba", "Cba");
        kisiler.put("Xyz", "Xyz");
        kisiler.put("Vxw", "Vxw");
        kisiler.put("Tbt", "Tbt");
        kisiler.put("Bny", "Bny");
        kisiler.put("Frt", "Frt");
        kisiler.put("Qsx", "Qsx");
    }

    public void personelHakkindaChanged(ValueChangeEvent e) {
        //personel bilgisine yeni bir değer atanıyor
        hakkinda = e.getNewValue().toString();
    }

    public Map<String, String> getPersonelInMap() {
        return PersonelBean.kisiler;
    }

    public String getHakkinda() {
        return hakkinda;
    }

    public void setHakkinda(String hakkinda) {
        this.hakkinda = hakkinda;
    }
}