import java.util.ArrayList;

public class ShowManagement {
    public ArrayList<Actor> addActor(Actor newActor, ArrayList<Actor> listOfActors) {
        if (listOfActors.contains(newActor)) {
            System.out.println("Такой актёр уже существует!");
        } else listOfActors.add(newActor);
        return listOfActors;
    }

    public ArrayList<Actor> changeActor(Actor newActor, String surname, ArrayList<Actor> listOfActors) {
        boolean removed = listOfActors.removeIf(actor -> actor.surname.equals(surname));
        if (removed) {
            addActor(newActor, listOfActors);
        } else System.out.println("Такого актёра нет в списке!");
        return listOfActors;
    }
}
