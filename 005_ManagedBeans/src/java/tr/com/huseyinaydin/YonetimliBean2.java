package tr.com.huseyinaydin;

import javax.faces.event.ActionEvent;

//بسم الله الرحمن الرحيم

/**
 * 
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java, Java Server Faces.
 * 
 */

public class YonetimliBean2 {

    public void onayverAction() {
        String sonuc = "Action metodu çalıştırıldı.";
        System.out.println(sonuc);
    }

    public void onayverActionListener(ActionEvent olay) {
        String gelenParametreAdi = (String) olay.getComponent().getAttributes().get("p_adi");
        String gelenParametreSoyadi = (String) olay.getComponent().getAttributes().get("p_soyadi");
        String sonuc = "Parametreler: " + gelenParametreAdi + " " + gelenParametreSoyadi;
        System.out.println(sonuc);
    }
}