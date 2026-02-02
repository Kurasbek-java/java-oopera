import java.util.Objects;

public class Director extends Person {
    private int numberOfShows;

    public Director(String name, String surname, Sex sex, int numberOfShows) {
        super(name, surname, sex);
        this.numberOfShows = numberOfShows;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() :0);
        result = 31 * result + (sex != null ? sex.hashCode() :0);
        result = 31 * result + numberOfShows;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Director director = (Director) obj;
        return Objects.equals(name, director.name)
                && Objects.equals(surname, director.surname)
                && sex == director.sex
                && numberOfShows == director.numberOfShows;
    }

    @Override
    public String toString() {
        return name + " " + surname + "(Спектаклей: " + numberOfShows + ")";
    }
}
