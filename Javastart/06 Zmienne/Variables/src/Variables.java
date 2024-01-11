public class Variables {
    public static void main(String[] args) {
        String firstName = "Jan";
        var lastName = "Kowalski";
        int age = 25;
        double height = 180;
        final String pesel ;
        pesel = "12345678901";
        System.out.println(firstName + " " + lastName + " ma "+ age + " lat");
        System.out.println("Pan" + lastName + " ma pesel "+ pesel);
        System.out.println("Jan ma wzrost" + height + "c,");
        System.out.println("Jezeli Jan urosnie o 5cm, to bedzie mial" + (height + 5) + "cm");


    }
}

