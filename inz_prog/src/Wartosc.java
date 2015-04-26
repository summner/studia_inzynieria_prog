import java.io.FileReader;
import java.io.FileWriter;

public interface Wartosc {

  public void ZapiszWartosc(FileWriter stream);

  public void CzytajWartosc(FileReader stream);

  public int KonwertujDoInt();

  public String KonwertujDoString();
}
