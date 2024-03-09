public class Series extends Movie {
    private int numOfSeries;

    public Series(String name, int year, int rating, double length, int numOfSeries) {
        super(name, year, length, rating);
        setNumOfSeries(numOfSeries);
    }

    @Override
    void showInfo() {
        super.showInfo();
        System.out.println("Кол-во серий: " + getNumOfSeries());
    }

    public int getNumOfSeries() {
        return numOfSeries;
    }

    public void setNumOfSeries(int numOfSeries) {
        this.numOfSeries = numOfSeries;
    }
}