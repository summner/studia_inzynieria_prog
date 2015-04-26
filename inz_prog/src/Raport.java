import static org.mockito.Mockito.mock;

import java.io.FileWriter;

public class Raport {

  public String NazwaPliku;
  public boolean ZapisacDane;
  public int Precyzja;

  FileWriter stream = mock(FileWriter.class);

  Dane dane;
  Statystyka statystyka;

  public void ZapiszRaport() {
    dane.ZapiszDane(stream);
    statystyka.ZapiszStatystyka(stream);
  }

  public void SetZapisacDane(boolean zapisacDane) {
    ZapisacDane = zapisacDane;
  }

  public void SetPrecyzja(int precyzja) {
    Precyzja = precyzja;
  }

  public void SetNazwaPliku(String nazwaPliku) {
    NazwaPliku = nazwaPliku;
  }
}