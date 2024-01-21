public class UserMenager {
    public static void main(String[] args) {
        User user1 = new User("jan", "kowalski");

        System.out.println("Wybierz opcję:");
        System.out.println("0 - wyjście z programu");
        System.out.println("1 - wyświetl informacje o użytkowniku");
        System.out.println("2 - modyfikuj dane użytkownika");

        int option = 1;

        if (option == 0) {
            System.out.println("bye bye");
        }else if (option == 1){
            System.out.println("Uzytkownik" + user1.firstName + " " + user1.lastName);
        } else if (option == 2) {
            user1.setFirstname("marian");
            user1.setLastName("nowak");
            System.out.println("zmieniono dane na" + user1.getFirstName() + " " + user1.getLastName());
        }


    }
}
