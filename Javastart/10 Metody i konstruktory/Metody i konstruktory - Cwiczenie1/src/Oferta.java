public class Oferta {
    Produkt produkt;
    double cena;
    boolean specjalna;

    Oferta(Produkt prod, double price, boolean s){

        produkt = prod;
        cena = price;
        specjalna = s;
    }

     void wyswietlOferty(){
         System.out.println(produkt.nazwa + " "
                            + produkt.producent + " "
                            + cena + "zl, "
                            + "oferta specjalna?" + specjalna);

    }
}
