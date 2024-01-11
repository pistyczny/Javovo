//class CarShop {
//    public static void main(String[] args) {
//        Car audi = new Car();
//        audi.brand = "Audi";
//        audi.doors = 4;
//        audi.carColor = "Black";
//        audi.wheelsColor = "Srebny";
//        audi.triesColor = "Czarny";
//
//        String audiInfo = audi.brand + "" + audi.model
//                + ",Drzwi" + audi.doors
//                + ",Kolor nadwozia: " + audi.carColor
//                + ",Kolor felg: " + audi.wheelsColor
//                + ",Kolor opon: " + audi.triesColor;
//
//        System.out.println("Wybrałes nastepujacy samochod: ");
//        System.out.println(audiInfo);
//    }
//}
class CarShop {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.brand = "Audi";
        audi.model = "A4";
        audi.doors = 4;
        audi.carColor = "Czarny";
        audi.wheelsColor = "Srebrny";
        audi.tiresColor = "Czarny";

        String audiInfo = audi.brand + " " + audi.model
                + ", Drzwi: " + audi.doors
                + ", Kolor nadwozia: " + audi.carColor
                + ", Kolor felg: " + audi.wheelsColor
                + ", Kolor opon: " + audi.tiresColor;
        System.out.println("Wybrałeś następujący samochód: ");
        System.out.println(audiInfo);
        Car bmw = new Car();
        bmw.brand = "BMW";
        bmw.model = "m3";
        System.out.println(bmw.brand);
    }
}