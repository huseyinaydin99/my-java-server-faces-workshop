package tr.com.huseyinaydin;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Comparator;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.ArrayDataModel;
import javax.faces.model.DataModel;

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
public class YonetimliBean implements Serializable {

    private static final Personel[] personelListesi = {
        new Personel("571", "Eren Ertaş", 28, new BigDecimal("1800.00")),
        new Personel("1326", "Edip Yüksel", 20, new BigDecimal("1100.00")),
        new Personel("632", "Yunus Çetiner", 23, new BigDecimal("1300.00")),
        new Personel("1299", "Doğan Özdoğan", 22, new BigDecimal("1900.00")),
        new Personel("1517", "Ertan Burak", 23, new BigDecimal("1400.00"))
    };
    
    private DataModelSiralamasi<Personel> dataModelSiralamasi;

    public YonetimliBean() {
        dataModelSiralamasi = new DataModelSiralamasi<Personel>
                (new ArrayDataModel<Personel>(personelListesi));
    } 

    public DataModel<Personel> getPersonelListesi() {
        return dataModelSiralamasi;
    }

    private boolean artanSiralama = true;
    //adan zeye, azdan çoğa siralama
    public String siralaPersonelAdiSoyadi() {
        if (artanSiralama) {
            //adan zeye azdan çoğa siralama
            dataModelSiralamasi.sirala(new Comparator<Personel>() {
                @Override
                public int compare(Personel o1, Personel o2) {
                    return o1.getAdiSoyadi().compareTo(o2.getAdiSoyadi());
                }
            });
            artanSiralama = false;
        } else {
            //zeden aya, çoktan aza siralama
            dataModelSiralamasi.sirala(new Comparator<Personel>() {
                @Override
                public int compare(Personel o1, Personel o2) {
                    return o2.getAdiSoyadi().compareTo(o1.getAdiSoyadi());
                }
            });
            artanSiralama = true;
        }
        return null;
    }

    //adan zeye, azdan çoğa siralama
    public String siralaPersonelMaasi() {
        if(artanSiralama){
            //adan zeye azdan çoğa siralama
            dataModelSiralamasi.sirala(new Comparator<Personel>() {
                @Override
                public int compare(Personel o1, Personel o2) {
                    return o1.getMaasi().compareTo(o2.getMaasi());
                }
            });
            artanSiralama = false;
        }else{
            //zeden aya, çoktan aza siralama
            dataModelSiralamasi.sirala(new Comparator<Personel>() {
                @Override
                public int compare(Personel o1, Personel o2) {
                    return o2.getMaasi().compareTo(o1.getMaasi());
                }
            });
            artanSiralama = true;
        }
        return null;
    }
}