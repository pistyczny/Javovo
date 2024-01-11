public class Licznik {
    public static void main(String[] args) {



        LicznikMetryczny zamianaMetryczna = new LicznikMetryczny();
        double m = 25;

        double mToCm = zamianaMetryczna.metryNaCentymetry(m);
        double mToMm = zamianaMetryczna.metryNaMilimetry(m);



        LicznikCzasowy zamianaCzasowa = new LicznikCzasowy();
        double a = 4;
        double b = 43;

        double hNaMin = zamianaCzasowa.godzinyNaMinuty(a);
        double minNaSek = zamianaCzasowa.minutyNaSekundy(hNaMin);
        double sekNaMilisek = zamianaCzasowa.sekundyNaMilisekundy(minNaSek);

        System.out.println(a + " Godziny to: " + hNaMin + " Minut,oraz " + minNaSek + " sekund, i " + sekNaMilisek + " milisekund");




        System.out.println(m + "m to " + mToCm + " Cm" + " oraz " + mToMm + " mm");
    }
}
