import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        ShowManagement showManagement = new ShowManagement();
        MusicalShow musicalShowBallet = new MusicalShow();
        MusicalShow musicalShowOpera = new MusicalShow();

        ArrayList<Actor> showActors = new ArrayList<>();
        ArrayList<Actor> balletActors = new ArrayList<>();
        ArrayList<Actor> operaActors = new ArrayList<>();

        Actor actorChristian = new Actor("Christian", "Bale", Sex.MALE, 185);
        Actor actorJohnny = new Actor("Johnny", "Depp", Sex.MALE, 184);
        Actor actorOberyn = new Actor("Oberyn", "Martell", Sex.MALE, 183);

        Director directorChristopher = new Director("Christopher", "Nolan", Sex.MALE, 15);
        Director directorQuentin = new Director("Quentin", "Tarantino", Sex.MALE, 19);

        Person musicAuthor = new Person("Hans", "Zimmer");
        Person choreographer = new Person("Paul", "Becker");

        //creating show
        //showManagement.addActor(actorChristian, showActors);
        //showManagement.addActor(actorJohnny, showActors);
        Show show = new Show("Big Drama Show", 48, directorChristopher, showActors);
        show.printActors();

        //creating ballet
        showManagement.addActor(actorOberyn, balletActors);
        showManagement.addActor(actorJohnny, balletActors);

        String librettoTextBallet =
                "На пустой сцене встречаются Судьба и Человек.\n" +
                        "Город замирает в ожидании, часы бьют полночь.\n" +
                        "Герой разрывается между долгом и любовью,\n" +
                        "а Хор шепчет о цене выбора.\n\n" +
                        "Любовь обещает свет,\n" +
                        "Долг — спасение мира.\n" +
                        "В последнем акте Человек делает шаг вперёд,\n" +
                        "и тишина становится ответом.\n\n" +
                        "Занавес.";
        musicalShowBallet.setLibrettoText(librettoTextBallet);
        Ballet ballet = new Ballet("Big Drama Ballet", 65, directorQuentin, balletActors, musicAuthor, musicalShowBallet.getLibrettoText(), choreographer);
        ballet.printActors();
        showManagement.changeActor(actorChristian, "Depp", balletActors);
        ballet.printActors();
        ballet.printLibrettoText();

        //create opera
        showManagement.addActor(actorOberyn, operaActors);
        showManagement.addActor(actorChristian, operaActors);

        String librettoTextOpera = """
        О, ночь! Свидетель тайной клятвы,
        Где сердце спорит с небом вновь.
        Я слышу зов судьбы суровой,
        Но в жилах — пламя и любовь!

        Хор:
        Выбор твой — и свет, и гибель,
        Путь один — назад пути нет.

        Занавес.
        """;
        musicalShowOpera.setLibrettoText(librettoTextOpera);
        Opera opera = new Opera("Big Drama Opera", 78, directorChristopher, operaActors, musicAuthor, musicalShowOpera.getLibrettoText(), 2);
        opera.printActors();
        showManagement.changeActor(actorJohnny, "Joker", operaActors);
        opera.printActors();
        opera.printLibrettoText();

    }


}
