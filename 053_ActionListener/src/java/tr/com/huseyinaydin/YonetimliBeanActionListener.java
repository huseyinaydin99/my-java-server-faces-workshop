package tr.com.huseyinaydin;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

//بسم الله الرحمن الرحيم
/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java, Java Server Faces.
 *
 */

public class YonetimliBeanActionListener implements ActionListener{

    public YonetimliBeanActionListener() {
    }
    
    @Override
    public void processAction(ActionEvent event) throws AbortProcessingException {
       System.out.println("Gönder2 düğmesine tıklandı.");
    }
}