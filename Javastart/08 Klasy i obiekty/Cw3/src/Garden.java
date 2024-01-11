public class Garden {
    public static void main(String[] args) {


        Plant plant1 = new Plant();
        plant1.nazwa = "Roslinka1 ";
        plant1.opis = "Ten chwast jest unikalny ";
        plant1.potrzebnaWoda = 130;

        Plant plant2 = new Plant();
        plant2.nazwa = "Roslinka2 ";
        plant2.opis = "To rosnie wszedzie";
        plant2.potrzebnaWoda = 5.1;

        Plant plant3 = new Plant();
        plant3.nazwa = "MOkebe";
        plant3.opis = "Ebeebe";
        plant3.potrzebnaWoda = 350;

        double dailyWaterConsumption = plant1.potrzebnaWoda +
                plant2.potrzebnaWoda +
                plant3.potrzebnaWoda;
        double weeklyWaterConsumption = dailyWaterConsumption * 7;
        double yearlyWaterConsumption = dailyWaterConsumption * 365;

        System.out.println("Dzienne zapotrzebowanie na wodę: " + dailyWaterConsumption + "l");
        System.out.println("Tygodniowe zapotrzebowanie na wodę: " + weeklyWaterConsumption + "l");
        System.out.println("Roczne zapotrzebowanie na wodę: " + yearlyWaterConsumption + "l");



    }
}
