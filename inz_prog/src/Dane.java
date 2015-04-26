import static org.mockito.Mockito.mock;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

public class Dane {

  public String NazwaPliku;
  public int TypPliku;

  FileReader streamReader = mock(FileReader.class);
  List<Wartosc> wartosci;

  public void CzytajDane() {
    wartosci.stream().forEach(wartosc -> wartosc.CzytajWartosc(streamReader));
  }

  public void ZapiszDane(FileWriter stream) {
    wartosci.forEach(wartosc -> wartosc.ZapiszWartosc(stream));
  }

  public void SetNazwaPliku(String nazwa) {
  }

  public List<Wartosc> GetWektorDanych() {
    return wartosci;
  }
}
