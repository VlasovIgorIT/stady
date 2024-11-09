package tasks.hares;

import java.util.List;

public class Forest {
    private List<MountainHare> hares;
    private String season;

    public Forest(List<MountainHare> hares, String season) {
        this.hares = hares;
        this.season = season;
        setSeason(season);
    }

    public static void setSeason(String season) {
        if (season.equals("Winter")) {
            MountainHare.color = "White";
        } else {
            MountainHare.color = "Grey-red";
        }
    }

    public void printHares() {
        for (MountainHare hare : hares) {
            System.out.println(hare);
        }
    }

    // объявите недостающие переменные и добавьте конструктор

    // добавьте метод setSeason(String newSeason)
    // в этом методе реализуйте логику смены цвета шубок зайцев-беляков
    // добавьте метод printHares()

}
