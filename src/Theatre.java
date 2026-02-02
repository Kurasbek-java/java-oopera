import java.util.ArrayList;

public class Theatre {
/*Спасибо большое за комментарии)
Думаю код стал более чище.
Если ещё можно улучшить(сократить) код или есть ещё какие то лайфкахи, буду очень признателен)*/
    public static void main(String[] args) {

        Actor actorChristian = new Actor("Christian", "Bale", Sex.MALE, 185);
        Actor actorJohnny = new Actor("Johnny", "Depp", Sex.MALE, 184);
        Actor actorOberyn = new Actor("Oberyn", "Martell", Sex.MALE, 183);

        Director directorChristopher = new Director("Christopher", "Nolan", Sex.MALE, 15);
        Director directorQuentin = new Director("Quentin", "Tarantino", Sex.MALE, 19);

        Person musicAuthor = new Person("Hans", "Zimmer");
        Person choreographer = new Person("Paul", "Becker");

        //creating show
        Show show = new Show("Big Drama Show", 48, directorChristopher, new ArrayList<Actor>());
        show.addActor(actorChristian);
        show.addActor(actorJohnny);
        show.printActors();

        //creating ballet
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

        Ballet ballet = new Ballet("Big Drama Ballet", 65, directorQuentin, new ArrayList<Actor>(), musicAuthor, librettoTextBallet, choreographer);
        ballet.addActor(actorOberyn);
        ballet.addActor(actorJohnny);
        ballet.showDirector();
        ballet.printActors();
        ballet.changeActor(actorChristian, "Depp");
        ballet.printActors();
        ballet.printLibrettoText();

        //create opera
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
        Opera opera = new Opera("Big Drama Opera", 78, directorChristopher, new ArrayList<Actor>(), musicAuthor, librettoTextOpera, 2);
        opera.addActor(actorOberyn);
        opera.addActor(actorChristian);
        opera.printActors();
        opera.changeActor(actorJohnny, "Joker");
        opera.printActors();
        opera.printLibrettoText();
    }
}
