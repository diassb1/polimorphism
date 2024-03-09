
public class Main {
    public static void main(String[] args) {
        Media media = new Media("Медиа", 2005);

        media.showInfo();

        Movie movie = new Movie("Фильм 1", 2015, 150, 10);
        Movie movie1 = new Movie("Фильм 2", 2011, 110, 8);
        movie.showInfo();

        Series series = new Series("Сериал 1", 2009, 10, 120, 12);
        Series series1 = new Series("Сериал 2", 2014, 4, 180, 10);
        series.showInfo();

        Streaming streaming = new Streaming();
        streaming.addContents(movie);
        streaming.addContents(movie1);
        streaming.addContents(series);
        streaming.addContents(series1);

        streaming.playRandomMedia();
        streaming.displayAll();
        streaming.displayAllMovies();
        streaming.displayAllSeries();
        System.out.println("Самый старый фильм: " + streaming.getOldestMovie().getName() + " Вышел в " + streaming.getOldestMovie().getYear());
        System.out.println("Рандомный сериал: " + streaming.getRandomSeries().getName());
    }
}