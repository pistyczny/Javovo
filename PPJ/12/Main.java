public class Main {
    public static void main(String[] args) {
        {
//            Element head = null;
//            head = new Element(10, head);
//            head = new Element(5, head);
//            head = new Element(20, head);
//            head = new Element(50, head);
//
//            Element tmp = head;
//            while (tmp != null) {
//                System.out.println(tmp.getValue());
//                tmp = tmp.getNext();
//            }
        }

        {
            MyList myList = new MyList();
            myList.add(10);
            myList.add(5);
            myList.add(25);

            myList.show();

        }

        {
            Student stud = new Student(
                "Ola", 1990, 534
            );
            System.out.println(stud);
            stud.show();
            Student stud1 = new Student(
                "Ola", 1990, 534
            );

            System.out.println(
                stud == stud1
            );
            System.out.println(
                stud.equals(stud1)
            );

            System.out.println(
                stud
            );

            //===============================

            Person person = stud;
            System.out.println(person);
            Object obj = person;
            System.out.println(obj);
        }
    }
}