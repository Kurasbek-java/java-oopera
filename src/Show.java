import java.util.ArrayList;

public class Show {
    String title;
    int duration;
    Director director;
    ArrayList<Actor> listOfActors;

    public Show() {
    }

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printActors() {
        if (!listOfActors.isEmpty()) {
            System.out.println("Актёры спектакля " + title + ":");
            for (Actor actor: listOfActors) {
                System.out.println(actor);
            }
        } else System.out.println("Пока никого не утвердили для спектакля " + title + "!");
        System.out.println("-".repeat(15));
    }
}
