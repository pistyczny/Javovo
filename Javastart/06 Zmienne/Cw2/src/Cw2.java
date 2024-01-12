//
//Ćwiczenie
//
//        Napisz program, w którym zadeklarujesz zmienne, które będą reprezentować samochód w salonie samochodowym poprzez:
//        • Markę
//        • Model
//        • Rocznik
//        • Cenę
//
//        Możesz również dodać dowolne zmienne, które samodzielnie uznasz za stosowne. Do reprezentacji każdego z powyższych elementów wykorzystaj najbardziej odpowiedni Twoim zdaniem typ danych.
//        Na końcu wyświetl informacje o samochodzie, które przypisałeś do zmiennych.
//
//
//        Podpowiedź
//        Do marki i modelu użyj zmiennych typu String, do rocznika zmiennej typu int, a do ceny typu double. Przypisz do zmiennych wartości, a następnie odwołaj się do nich w metodach print() lub println().
//class CarShop {
//    public static void main(String[] args) {
//        String carBrand = "Audi";
//        String carModel = "A4";
//        int carYear = 2007;
//        double carPrice = 67000.0;
//
//        System.out.println("Wybrany samochód to:");
//        System.out.print(carBrand);
//        System.out.print(" ");
//        System.out.print(carModel);
//        System.out.print(", rocznik ");
//        System.out.print(carYear);
//        System.out.print(", cena ");
//        System.out.print(carPrice);
//        System.out.println("zł");
//    }
//}
//Utworzyliśmy 4 zmienne do przechowywania wymaganych w zadaniu informacji. Markę i model samochodu najwygodniej przechowywać jako napisy, ponieważ najczęściej będą składały się co najmniej z 2 znaków. Do reprezentacji roku wybrany został int jako typ najbardziej uniwersalny wśród liczb całkowitoliczbowych, natomiast cena jest typu double, ponieważ istnieje możliwość podania jej z dokładnością co do grosza.
//        W dalszej części wyświetlamy odpowiedni komunikat wykorzystując wartości przechowywane w zmiennych.
//



public class Cw2 {
    public static void main(String[] args) {

        String marka;
        String model;
        int rocznik;
        double cena;

        marka = "opel";
        model = "fajny";
        rocznik = 1991;
        cena = 929.12;

        System.out.println("model to " + model + " marka to " + marka + " rocznik to " + rocznik + " cena to: " + cena);



    }
}
