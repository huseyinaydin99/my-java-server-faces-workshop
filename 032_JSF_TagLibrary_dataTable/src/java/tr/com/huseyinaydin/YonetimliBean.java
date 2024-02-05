package tr.com.huseyinaydin;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.bean.ManagedBean;

//بسم الله الرحمن الرحيم
/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java, Java Server Faces.
 *
 */

@ManagedBean(name = "yb")
@ApplicationScoped
public class YonetimliBean implements Serializable {

    private static final Personel[] personelListesi = new Personel[]{
        new Personel("571", "Vâhid Çelik", new BigDecimal("1900.00"), 28),
        new Personel("1299", "Erim Karakaya", new BigDecimal("1500.00"), 22),
        new Personel("632", "Ayşenur Kuşkapan", new BigDecimal("1600.00"), 26),
        new Personel("1453", "Mert Türkman", new BigDecimal("1300.00"), 23),
        new Personel("1918", "Musa Baran", new BigDecimal("1100.00"), 27),
        new Personel("1915", "Rahmi Balık", new BigDecimal("1050.00"), 21),
        new Personel("1517", "Merve Arık", new BigDecimal("1140.00"), 24)
    };

    public Personel[] getPersonelListesi() {
        return personelListesi;
    }
} 