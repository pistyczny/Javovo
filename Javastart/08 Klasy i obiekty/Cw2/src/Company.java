// .
public class Company {
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.imie = "Imie1 ";
        emp1.nazwisko = "Nazwisko1 ";
        emp1.rokUrodzenia = 1991;
        emp1.stazPracy = 1;

        Employee emp2 = new Employee();
        emp2.imie = "Imie2 ";
        emp2.nazwisko = "Nazwisko2 ";
        emp2.rokUrodzenia = 1992;
        emp2.stazPracy = 2;

        Employee emp3 = new Employee();
        emp3.imie = "Imie3 ";
        emp3.nazwisko = "Nazwisko3 ";
        emp3.rokUrodzenia = 1993;
        emp3.stazPracy = 3;

        System.out.println("Pracownicy w firmie");

        System.out.println(emp1.imie + "" + emp1.nazwisko + "ur "
                            + emp1.rokUrodzenia + " staz " + emp1.stazPracy + " lat/a") ;


        System.out.println(emp2.imie + "" + emp2.nazwisko + "ur "
                + emp2.rokUrodzenia + " staz " + emp2.stazPracy + " lat/a") ;

        System.out.println(emp3.imie + "" + emp3.nazwisko + "ur "
                + emp3.rokUrodzenia + " staz " + emp3.stazPracy + " lat/a") ;
    }
}
