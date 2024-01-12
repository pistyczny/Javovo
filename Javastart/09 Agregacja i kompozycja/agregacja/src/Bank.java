// ..
public class Bank {
    public static void main(String[] args) {

        Persona osobistosc1 = new Persona();
        osobistosc1.imie = "Jan";
        osobistosc1.nazwisko = "Kowalski";
        osobistosc1.pesel = "90897812362";

        KontoBankowe konto1 = new KontoBankowe();
        konto1.wlasciciel = osobistosc1;
        konto1.stanKonta = 10_000;

        Kredyt kredycik1 = new Kredyt();
        kredycik1.pozyczajaca = osobistosc1;
        kredycik1.gotowkaPozyczona = 2000;
        kredycik1.oprocentowanie = 0.05;
        kredycik1.terminMiesieczny = 12;

        System.out.println("Osoba");
        System.out.println(osobistosc1.imie + " " + osobistosc1.nazwisko + " pesel  " + osobistosc1.pesel);
        System.out.println("posiada konto bankowe z kwotą: " + konto1.stanKonta);
        System.out.println("oraz kredyt na kwotę: " + kredycik1.gotowkaPozyczona);


    }
}
