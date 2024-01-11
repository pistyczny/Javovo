public class Sklep {
    public static void main(String[] args) {
        Produkt produkt1 = new Produkt("Czekotubka", "Milka");
        Oferta oferta1 = new Oferta(produkt1, 3.95, true);
        oferta1.wyswietlOferty();

    }


}
