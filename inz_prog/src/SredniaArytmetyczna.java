import java.io.FileWriter;

public class SredniaArytmetyczna extends Statystyka {

  public double WartoscStatystyki;

  @Override
  public void Oblicz() {
    WartoscStatystyki =
        dane.GetWektorDanych().stream().mapToInt(Wartosc::KonwertujDoInt).average().getAsDouble();
  }

  @Override
  public void ZapiszStatystyka(FileWriter stream) {

  }
}
