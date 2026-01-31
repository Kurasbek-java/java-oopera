import java.util.ArrayList;

public class MusicalShow extends Show {
    Person musicAuthor;
    private String librettoText;

    public MusicalShow() {}

    public MusicalShow(String title, int duration, Director director, ArrayList<Actor> listOfActors, Person musicAuthor, String librettoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void setLibrettoText(String librettoText) {
        this.librettoText = librettoText;
    }

    public String getLibrettoText() {
        return librettoText;
    }

    public void printLibrettoText() {
        System.out.println("Либретто текст спектакля: " + title + ":");
        System.out.println(librettoText);
        System.out.println("-".repeat(15));
    }
}
