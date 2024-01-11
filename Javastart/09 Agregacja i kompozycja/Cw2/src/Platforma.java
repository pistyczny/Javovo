public class Platforma {
    public static void main(String[] args) {
        Aukcje aukcja1 = new Aukcje();
        aukcja1.przedmiot = "Tombak";
        aukcja1.opis = "Gowno ale sie blyszczy";
        aukcja1.cena = 3990;
        aukcja1.sprzedawca = new Uzytkownik();
        aukcja1.sprzedawca.imie = "Jan";
        aukcja1.sprzedawca.nazwisko = "Kowalski";
        aukcja1.sprzedawca.adres = new Adres();
        aukcja1.sprzedawca.adres.miasto = "Wwa";
        aukcja1.sprzedawca.adres.kodPocztowy = "01-012";
        aukcja1.sprzedawca.adres.ulica = "Warszawska";
        aukcja1.sprzedawca.adres.numerDomu = "53A";
        aukcja1.sprzedawca.adres.numerMieszkania = "21";

        Aukcje aukcja2 = new Aukcje();
        aukcja2.przedmiot = "Szajsung sz20";
        aukcja2.opis = "dzyn dzym";
        aukcja2.cena = 12300;
        aukcja2.sprzedawca = new Uzytkownik();
        aukcja2.sprzedawca.imie = "Jowisz";
        aukcja2.sprzedawca.nazwisko = "Etlyki";

        System.out.println("Dostepne aukcje: ");
        System.out.println(aukcja1.przedmiot + " " + aukcja1.opis + " " + aukcja1.cena + " " + aukcja1.sprzedawca.imie + " " + aukcja1.sprzedawca.nazwisko);






    }
}
