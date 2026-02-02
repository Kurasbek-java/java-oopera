import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

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

    public void showDirector() {
        System.out.println("Режиссёр спектакля " + title + ":");
        System.out.println(director);
    }

    public ArrayList<Actor> addActor(Actor newActor) {
        if (listOfActors.contains(newActor)) {
            System.out.println("Такой актёр уже существует!");
        } else listOfActors.add(newActor);
        return listOfActors;
    }

    public ArrayList<Actor> changeActor(Actor newActor, String surname) {
        boolean removed = listOfActors.removeIf(actor -> actor.surname.equals(surname));
        if (removed) {
            addActor(newActor);
        } else System.out.println("Такого актёра нет в списке!");
        return listOfActors;
    }
}
