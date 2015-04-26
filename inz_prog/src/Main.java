import java.util.Arrays;

public class Main {
  public static void main(String... args){
    Dane dane = new Dane();
    dane.wartosci = Arrays.asList(new WartoscLiczbowa());
    SredniaArytmetyczna sredniaArytmetyczna = new SredniaArytmetyczna();
    Raport raport = new Raport();
    raport.dane = dane;
    raport.statystyka = sredniaArytmetyczna;


    dane.CzytajDane();
    sredniaArytmetyczna.Oblicz();

    raport.SetNazwaPliku("nazwa");
    raport.SetZapisacDane(true);
    raport.SetPrecyzja(10);
    raport.ZapiszRaport();
  }
}
