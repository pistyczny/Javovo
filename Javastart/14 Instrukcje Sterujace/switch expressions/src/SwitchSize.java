import java.util.Scanner;

class SwitchSize{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj rozmiar");

        String shortSize = scanner.nextLine();
//        String size;
//        switch (size){
//            case "S":
//                size = "maly";
//                break;
//            case "M":
//                size = "średni";
//                break;
//            case "L":
//                size = "duzy";
//                break;
//            case "xl":
//                size ="bardzo duzy";
//                break;
//            default:
//                size = "Nieznany";
//
//        }

//        String size = switch (shortSize) {
//            case "S":
//                yield "mały";
//            case "M":
//                yield "średni";
//            case "L":
//                yield "duży";
//            case "XL":
//                yield "bardzo duży";
//            default:
//                yield "nieznany";
//        };

        String size = switch (shortSize) {
            case "S" -> "mały";
            case "M" -> "średni";
            case "L" -> "duży";
            case "XL" -> "bardzo mały";
            default -> "nieznany";
        };

        System.out.println("wybrano rozmiar" + size);


    }
}