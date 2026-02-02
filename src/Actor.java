import java.util.Objects;

public class Actor extends Person {
    private int height;

    public Actor(String name, String surname, Sex sex, int height) {
        super(name, surname, sex);
        this.height = height;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + height;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Actor actor = (Actor) obj;
        return Objects.equals(name, actor.name)
                && Objects.equals(surname, actor.surname)
                && sex == actor.sex
                && height == actor.height;
    }

    @Override
    public String toString() {
        return name + " " + surname + "(" + height + " cm)";
    }
}
