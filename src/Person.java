import java.util.Objects;

public class Person {
    String name;
    String surname;
    Sex sex;

    public Person(String name, String surname, Sex sex) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return Objects.equals(name, person.name)
                && Objects.equals(surname, person.surname)
                && sex == person.sex;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
