public class Computer {
    String  processor;
    int pamiec;

    void wyswietlInfo() {
        System.out.println(processor + " " + pamiec);

    }
    String dajInfo(){
        return processor + " " + pamiec;
//        String opis = processor + " " + memory;
//        return opis;
    }

}
