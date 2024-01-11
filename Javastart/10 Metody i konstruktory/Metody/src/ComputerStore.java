public class ComputerStore {
    public static void main(String[] args) {

        FabrykaKomputerow nowyComp1 = new FabrykaKomputerow();
        Computer comp1 = nowyComp1.create("intel i5", 8192);

//        Computer comp1 = new Computer();
//        comp1.processor = "intel i5";
//        comp1.pamiec = 8192;

        Computer comp2 = new Computer();
        comp2.processor = "amd ryzen 1700 ";
        comp2.pamiec = 16_384;

        comp1.wyswietlInfo();
        comp2.wyswietlInfo();
        System.out.println(comp1.dajInfo());

        String info2 = comp2.dajInfo();
        System.out.println(info2);

        System.out.println("-----------------------------------");

        ComputerUpgrade komputerowyUpgrade = new ComputerUpgrade();
        komputerowyUpgrade.addMemory(comp1, 1024);
        comp1.wyswietlInfo();

    }
}
