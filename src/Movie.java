public class Movie extends Media {
    private int rating;
    private double length;
    private String id = "m";

    public Movie(String name, int year, double length, int rating) {
        super(name, year);
        setLength(length);
        setRating(rating);
    }


    @Override
    void showInfo() {
        super.showInfo();
        System.out.println("Рейтинг: " + getRating());
        System.out.println("Продолжительность: " + getLength());
    }

    public int getRating() {
        return rating;
    }

    public double getLength() {
        return length;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setLength(double length) {
        this.length = length;
    }

}