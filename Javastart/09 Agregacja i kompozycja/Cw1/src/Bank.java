class Bank {
    public static void main(String[] args) {

        Persona osobistosc1 = new Persona();
        osobistosc1.imie = "Jan";
        osobistosc1.nazwisko = "Kowalski";
        osobistosc1.pesel = "90897812362";

        Adres adres1 = new Adres();
        adres1.miasto = "Warszawa";
        adres1.kodPocztowy = "20-222";
        adres1.ulica = "Woronicza";
        adres1.numerDomu = 22;
        adres1.numerMieszkania = 43;
        osobistosc1.adresZamieszkania = adres1;
        osobistosc1.adresZameldowania = adres1;


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
