import java.util.Objects;

public
    class Student
    extends Person{

    protected int sNumber;

    public Student(
        String name, int birthYear,
        int sNumber
    ) {
        super(name, birthYear);
        this.sNumber = sNumber;
    }

    public void show(){
        System.out.println(
            super.name+"\t"+
            super.birthYear+"\t"+
            this.sNumber
        );
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return super.equals(student) &&
            sNumber == student.sNumber;
    }

    public String toString(){
        return "Student{"+
                "\n\t" + super.toString()+
                "\n\tsnumber: "+sNumber+
                "\n}";
    }

}
