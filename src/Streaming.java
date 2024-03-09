import java.util.Random;

public class Streaming {
    Random random = new Random();
    Media[] contents;

    {
        contents = new Media[10];
    }


    public void addContents(Media media) {
        for (int i = 0; i < contents.length; i++) {
            if (contents[i] == null) {
                contents[i] = media;
                return;
            }
        }
    }

    public void playRandomMedia() {
        int index = random.nextInt(0, contents.length);
        if (contents[index] != null) {
            Media media = contents[index];
            System.out.println("--------------");
            media.showInfo();
        } else {
            System.out.println("В данной ячейке нету фильма");
        }
    }


    public void displayAll() {
        int x = 1;
        System.out.println("Все фильмы и сериалы: ");
        for (Media media1 : contents) {
            if (media1 != null) {
                System.out.print(x + " - ");
                media1.displayMovie(media1);
            }
            x++;
        }
    }

    public void displayAllMovies() {
        int x = 1;
        System.out.println("Все фильмы: ");
        for (Media media1 : contents) {
            if (media1 != null && media1.getClass().getSimpleName().equals("Movie")) {
                System.out.print(x + " - ");
                media1.displayMovie(media1);
            }
            x++;
        }
    }

    public void displayAllSeries() {
        int x = 1;
        System.out.println("Все сериалы: ");
        for (Media media1 : contents) {
            if (media1 != null && media1.getClass().getSimpleName().equals("Series")) {
                System.out.print(x + " - ");
                media1.displayMovie(media1);
            }
            x++;
        }
    }

    Movie getOldestMovie() {   //не понял что делать с Movie, работает так же если будет Media
        int x = contents[0].getYear();
        int n=0;
        for (int i = 1; i < contents.length; i++) {
            if (contents[i] == null || !contents[i].getClass().getSimpleName().equals("Movie")){
                continue;
            }
            if (x > contents[i].getYear()) {
                x = contents[i].getYear();
                n = i;
            }
        }
        return (Movie) contents[n];
    }

    Series getRandomSeries() {
        Series series = null;
        int index = random.nextInt(0, 4);
        if (contents[index] != null && contents[index].getClass().getSimpleName().equals("Series")) {
           series = (Series) contents[index];

        } else {
            System.out.println("В данной ячейке нету фильма");
            Runtime.getRuntime().exit(0); // выход из программы
        }
        return series;
    }
}



