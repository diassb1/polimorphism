public class Media {
        private String  name;
    private int year;


    public Media(String name, int year) {
        setName(name);
        setYear(year);
    }

    void showInfo() {
        System.out.println(getClass().getSimpleName());
        System.out.println("Название: " + getName());
        System.out.println("Год выпуска: " + getYear());
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void displayMovie(Media media){
        System.out.println(media.getName());
    }
}