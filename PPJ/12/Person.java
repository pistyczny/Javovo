import java.util.Objects;

public
    class Person {

    protected String name;
    protected int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return birthYear == person.birthYear &&
            name.equals(person.name);
    }

    public String toString(){
        return "Person{\n" +
                "\tname: "+name+
                "\n\tbirthyear: "+birthYear+
                "\n}";
    }

}
