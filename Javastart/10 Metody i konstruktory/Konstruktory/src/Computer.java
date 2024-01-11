public class Computer {
    String processor;
    int memory;

    Computer(){
        System.out.println("Tworze nowy komputer");
    }

    void printInfo() {
        System.out.println(processor + " " + memory);
    }

}
