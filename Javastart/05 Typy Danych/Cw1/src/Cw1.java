//
// Ćwiczenie
// Napisz program, który wyświetli o tobie kilka informacji w postaci takiej jak przedstawiono poniżej.
// -Cześć Jan, słyszałem, że masz 25 lat i uczysz się programowania. Czy to prawda?
// -true
// -Czy Twoje inicjały to J K?
// -Tak, true
// W zadaniu wykorzystaj nie tylko napisy zapisane w cudzysłowie, ale również podane typy danych:
// • liczby (int),
// • znaki (char),
// • typ logiczny (boolean).
// Podpowiedź
// Utwórz plik z rozszerzeniem .java a w nim klasę o takiej samej nazwie co nazwa pliku. Wydrukuj na ekranie kilka rzeczy korzystając z metody System.out.print() lub System.out.println() pamiętając o tym, że do wydrukowania tekstu musisz zapisać go w cudzysłowach, do pojedynczych znaków używamy apostrofów, a liczby zapisujemy bez dodatkowych znaków.
//
// Przykładowe rozwiązanie
// class Chat {
//    public static void main(String[] args) {
//        System.out.print("Cześć Jan, słyszałem, że masz ");
//        System.out.print(25);
//        System.out.println(" lat i uczysz się programowania. Czy to prawda?");
//        System.out.println(true);
//        System.out.print("Czy Twoje inicjały to ");
//        System.out.print('J');
//        System.out.print(" ");
//        System.out.print('K');
//        System.out.println('?');
//        System.out.print("Tak, ");
//        System.out.println(true);
//    }
//}
// Całe zadanie polega na odpowiednim manipulowaniu instrukcjami print w celu wyświetlenia symulacji rozmowy. Zgodnie z treścią zadania wykorzystaliśmy nie tylko napisy typu String zapisane w cudzysłowie, ale również liczby (25), pojedyncze znaki('J' i 'K') oraz wartości boolean (true)

class Cw1 {
    public static void main(String[] args) {
        System.out.println("Cześć Jan, słyszałem, że masz 25 lat i uczysz się programowania. Czy to prawda?");
        System.out.println(true);
        System.out.println("czy twoje iniscjaly to J K??");
        System.out.println("tak");
        System.out.println(true);

    }
}
